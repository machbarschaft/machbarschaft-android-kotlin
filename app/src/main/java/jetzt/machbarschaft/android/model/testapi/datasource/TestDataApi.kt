package jetzt.machbarschaft.android.model.testapi.datasource

import io.reactivex.Single
import jetzt.machbarschaft.android.model.ApiConstants
import jetzt.machbarschaft.android.model.testapi.data.TestResponse
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

/**
 * REST API for Test related data.
 */
interface TestDataApi {
    @GET(ApiConstants.TestApi.GET_ALL)
    fun getAllUsers(@Query("page") id: Int): Single<Response<TestResponse>>

//    @GET(ApiConstants.TestApi.POST_BY_USER_ID)
//    fun getUserByID(@Query("id") id: Int): Single<Response<List<UserResponse>>>

//    @POST("")
//    fun createUser(
//        @Body dataForRequest: TestBody
//    ): Single<Response<List<TestResponse>>>
}