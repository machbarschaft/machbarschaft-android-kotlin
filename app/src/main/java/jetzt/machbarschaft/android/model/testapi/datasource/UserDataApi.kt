package jetzt.machbarschaft.android.model.testapi.datasource

import io.reactivex.Single
import jetzt.machbarschaft.android.model.ApiConstants
import jetzt.machbarschaft.android.model.testapi.data.CreateUserBody
import jetzt.machbarschaft.android.model.testapi.data.CreateUserResponse
import jetzt.machbarschaft.android.model.testapi.data.GetUserResponse
import retrofit2.Response
import retrofit2.http.*

/**
 * REST API for Test related data.
 * TODO The Headers can be already added to all request with the OkHttpClient by adding
 * TODO a custom Interceptor
 */
interface UserDataApi {


    @Headers("Content-Type: application/json")
    @POST(ApiConstants.TestApi.USER)
    fun createUser(
        @Header("Authorization") header: String,
        @Body body: CreateUserBody
    ): Single<Response<CreateUserResponse>>

    @Headers("Content-Type: application/json")
    @GET(ApiConstants.TestApi.USER)
    fun getUser(@Header("Authorization") header: String): Single<Response<GetUserResponse>>
}