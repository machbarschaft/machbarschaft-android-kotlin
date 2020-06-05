package jetzt.machbarschaft.android.model.testapi.datasource

import io.reactivex.Single
import jetzt.machbarschaft.android.model.testapi.data.UserResponse

/**
 * Interface which defines the methods and return values for the service usage
 */
interface TestDataSource {
    fun getAllUsers(page: Int): Single<List<UserResponse>>
}