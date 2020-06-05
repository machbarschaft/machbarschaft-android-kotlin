package jetzt.machbarschaft.android.service.testapi.datasource

import io.reactivex.Single
import jetzt.machbarschaft.android.service.testapi.data.TestBody
import jetzt.machbarschaft.android.service.testapi.data.UserResponse

/**
 * Implementation of [TestDataSource] that uses the remote server as data source.
 */
class TestRemoteDataSource constructor(
    private val testDataApi: TestDataApi
) : TestDataSource {

    override fun getAllUsers(page: Int): Single<List<UserResponse>> =
        testDataApi.getAllUsers(page)
            .flatMap {
                Single.just(it.body()?.data)
            }

}