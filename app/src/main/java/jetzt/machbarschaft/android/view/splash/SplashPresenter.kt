package jetzt.machbarschaft.android.view.splash

import jetzt.machbarschaft.android.BuildConfig
import jetzt.machbarschaft.android.service.ApiConstants
import jetzt.machbarschaft.android.service.base.NullOrEmptyConverterFactory
import jetzt.machbarschaft.android.service.testapi.datasource.TestDataApi
import jetzt.machbarschaft.android.service.testapi.datasource.TestRemoteDataSource
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

    private var splashView: SplashContract.View? = null

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
        splashView = view
    }

    override fun unbindView() {
        splashView = null
    }

    override fun getAllUsers() {
        TODO("Not yet implemented")
    }


}