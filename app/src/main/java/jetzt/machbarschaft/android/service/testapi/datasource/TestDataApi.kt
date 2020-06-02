package jetzt.machbarschaft.android.service.testapi.datasource

import io.reactivex.Single
import jetzt.machbarschaft.android.service.ApiConstants
import jetzt.machbarschaft.android.service.testapi.data.TestBody
import jetzt.machbarschaft.android.service.testapi.data.TestResponse
import retrofit2.Response
import retrofit2.http.Body
import retrofit2.http.GET

/**
 * REST API for Test related data.
 */
interface TestDataApi {
    @GET(ApiConstants.TestApi.GET_ALL)
    fun getAllUsers(
        @Body dataForRequest: TestBody
    ): Single<Response<TestResponse>>
}