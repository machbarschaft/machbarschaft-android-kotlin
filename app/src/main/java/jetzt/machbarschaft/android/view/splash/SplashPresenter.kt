package jetzt.machbarschaft.android.view.splash

import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.CompositeDisposable
import io.reactivex.schedulers.Schedulers
import jetzt.machbarschaft.android.BuildConfig
import jetzt.machbarschaft.android.model.ApiConstants
import jetzt.machbarschaft.android.model.base.NullOrEmptyConverterFactory
import jetzt.machbarschaft.android.model.testapi.data.UserResponse
import jetzt.machbarschaft.android.model.testapi.datasource.TestDataApi
import jetzt.machbarschaft.android.model.testapi.datasource.TestRemoteDataSource
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import retrofit2.Retrofit
import retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory
import retrofit2.converter.gson.GsonConverterFactory
import java.util.concurrent.TimeUnit

/**
 * Class which connects Service and View
 */
class SplashPresenter: SplashContract.Presenter {

    private var view: SplashContract.View? = null

    private val disposables = CompositeDisposable()
    private val testDataRemoteDataSource: TestRemoteDataSource

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

        val testDataApi = retrofit.create(TestDataApi::class.java)

        testDataRemoteDataSource = TestRemoteDataSource(testDataApi)
    }

    override fun bindView(view: SplashContract.View) {
        this.view = view
    }

    override fun unbindView() {
        view = null
    }

    /**
     * Makes request to remote data source and handles callback
     */
    override fun getAllUsers() {

        view?.showLoadingDialog()

        disposables.add(
            testDataRemoteDataSource
                .getAllUsers(
                    1
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
     * callback if request is successful
     */
    private fun onRequestRegistrationDataSuccessful(response: List<UserResponse>) {
        println("successful")
        view?.hideLoadingDialog()

        view?.showUsers(response)

    }

    /**
     * callback if rest request fails
     */
    private fun onRequestRegistrationDataFailure(throwable: Throwable) {
        throwable.printStackTrace()
        view?.hideLoadingDialog()

        view?.showError()
    }

}