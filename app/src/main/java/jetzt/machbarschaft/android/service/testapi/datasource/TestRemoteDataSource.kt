package jetzt.machbarschaft.android.service.testapi.datasource

import io.reactivex.Single
import jetzt.machbarschaft.android.service.testapi.data.TestBody
import jetzt.machbarschaft.android.service.testapi.data.TestResponse

/**
 * Implementation of [TestDataSource] that uses the remote server as data source.
 */
class TestRemoteDataSource constructor(
    private val testDataApi: TestDataApi
) : TestDataSource {

    override fun getAllUsers(testDataForRequest: TestBody): Single<TestResponse> =
        testDataApi.getAllUsers(testDataForRequest)
            .flatMap {
                Single.just(it.body())
            }

}