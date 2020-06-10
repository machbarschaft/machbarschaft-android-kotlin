package jetzt.machbarschaft.android.service.testapi.datasource

import io.reactivex.Single
import jetzt.machbarschaft.android.service.testapi.data.*

/**
 * Interface which defines the methods and return values for the service usage
 */
interface UserDataSource {
    fun createUser(header: String, body: CreateUserBody): Single<CreateUserResponse>
    fun getUser(header: String): Single<GetUserResponse>
}