package jetzt.machbarschaft.android.view.splash

import android.util.Log
import com.google.firebase.auth.FirebaseAuth
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import jetzt.machbarschaft.android.BuildConfig
import jetzt.machbarschaft.android.service.ApiConstants
import jetzt.machbarschaft.android.service.base.NullOrEmptyConverterFactory
import jetzt.machbarschaft.android.service.testapi.data.CreateUserBody
import jetzt.machbarschaft.android.service.testapi.data.CreateUserResponse
import jetzt.machbarschaft.android.service.testapi.data.GetUserResponse
import jetzt.machbarschaft.android.service.testapi.datasource.UserDataApi
import jetzt.machbarschaft.android.service.testapi.datasource.UserRemoteDataSource
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit


/**
 * Class which connects Service and View
 */
class SplashPresenter : SplashContract.Presenter {

    private var view: SplashContract.View? = null

    private val disposables = CompositeDisposable()
    private val testDataRemoteDataSource: UserRemoteDataSource

    private var mAuth: FirebaseAuth
    private lateinit var headerToken: String


    init {
        val client =
            if (BuildConfig.DEBUG) {
                val loggingInterceptor = HttpLoggingInterceptor()
                loggingInterceptor.level = HttpLoggingInterceptor.Level.BODY

                OkHttpClient.Builder()
                    .addInterceptor(loggingInterceptor)
                    .connectTimeout(60, TimeUnit.SECONDS)
                    .build()
            } else {

                OkHttpClient.Builder()
                    .connectTimeout(60, TimeUnit.SECONDS)
                    .build()
            }

        val retrofit = Retrofit.Builder()
            .baseUrl(ApiConstants.BASE_URL)
            .client(client)
            .addConverterFactory(NullOrEmptyConverterFactory())
            .addConverterFactory(GsonConverterFactory.create())
            .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
            .build()

        val testDataApi = retrofit.create(UserDataApi::class.java)

        testDataRemoteDataSource = UserRemoteDataSource(testDataApi)

        mAuth = FirebaseAuth.getInstance()
    }

    override fun bindView(view: SplashContract.View) {
        this.view = view
    }

    override fun unbindView() {
        view = null
    }


    /**
     * Creates a user in the Backend. This user is linked to the firebase Auth Service.
     * To identify the user in the Backend for all further calls the Header Token has to be used.
     */
    private fun createUser(headerToken: String, body: CreateUserBody) {
        disposables.add(
            testDataRemoteDataSource
                .createUser(
                    "Bearer " + headerToken, body
                )
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                    this::onRequestRegistrationDataSuccessful,
                    this::onRequestRegistrationDataFailure
                )
        )
    }


    /**
     * Gets the Account data of the user correlated to the send auth header token
     */
    private fun getUser(header: String) {

        disposables.add(
            testDataRemoteDataSource
                .getUser(
                    "Bearer " + header
                )
                .subscribeOn(Schedulers.io())
                .observeOn(AndroidSchedulers.mainThread())
                .subscribe(
                    this::onGetUserSuccessful,
                    this::onRequestRegistrationDataFailure
                )
        )
    }

    /**
     * callback if request is successful
     */
    private fun onGetUserSuccessful(response: GetUserResponse) {
        println("successful")
        view?.hideLoadingDialog()
        Log.wtf("GetUserResponse", response.toString())
    }

    /**
     * callback if rest request fails
     */
    private fun onRequestRegistrationDataFailure(throwable: Throwable) {
        throwable.printStackTrace()
        view?.hideLoadingDialog()
        view?.showError()
    }


    /**
     * callback if the registration request is successful
     */
    private fun onRequestRegistrationDataSuccessful(response: CreateUserResponse) {
        println("successful")
        println(response)
        view?.hideLoadingDialog()
        getUser(headerToken)
    }


    /**
     *  Authenticates the User in the Firebase with his Email and Password.
     */
    override fun authFirebase(email: String, password: String) {
        mAuth.signInWithEmailAndPassword(email, password).addOnCompleteListener { task ->
            if (task.isSuccessful) {
                // In case the Authentication was successful it will set the Token in the Header for the Rest Calls which go directly to the Backend and not the Firebase Auth Service
                setToken()
            }else{
                Log.wtf("Auth Firebase", "Failed")
            }
        }
    }

    override fun getUser() {
        mAuth.currentUser!!.getIdToken(false).addOnCompleteListener{task ->
            if(task.isSuccessful){
                task.result!!.token?.let { getUser(it) }
            }else{
                //need to auth maybe put email and password in a var
                // and call authFirebase() here again in case something went wrong
                println(task.result.toString())
            }
        }
    }

    /**
     * Sets the Bearer Token which is used in the Header of the API Calls to the Backend as Auth.
     */
    override fun setToken() {
        mAuth.currentUser!!.getIdToken(false)
            .addOnCompleteListener { task ->
                if (task.isSuccessful) {
                    headerToken = task.result!!.token.toString()
                    Log.wtf("SetToken", headerToken)
                    val geoPoint = CreateUserBody.GeoPoint(12.0, 12.0)
                    val createUserBody = CreateUserBody(
                        "Vorname",
                        "Nachname",
                        "Theodor Storm Straße",
                        "12",
                        "93051",
                        "Regensburg",
                        geoPoint,
                        "test@test.de",
                        "017682920320",
                        CreateUserBody.SourceEnum.HOTLINE
                    )
                    // If the app can get the Token from Firebase correctly it will Create a new User in the Backend, which is than linked directly to the Firebase Auth Token
                    createUser(headerToken, createUserBody)
                } else {
                    Log.wtf("authFirebase", task.exception.toString())
                }
            }
    }


    /**
     * Registers the User in Firebase
     */
    override fun registerFirebase(email: String, password: String) {
        val firebaseAuth = FirebaseAuth.getInstance()
        firebaseAuth.createUserWithEmailAndPassword(email, password).addOnCompleteListener { task ->
            if (task.isSuccessful) {
                Log.wtf("Register Firebase", "Success")
                //In case Registration was successful it will auth the user in firebase
                authFirebase(email, password)
            } else {
                Log.wtf("Register Firebase", "Failed")
                //In case registration wasn't successful it will try to auth as well cause, the registration will fail if the user is already registered.
                authFirebase(email, password)
            }
        }
    }
}