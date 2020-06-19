package jetzt.machbarschaft.android.model.testapi.datasource

import io.reactivex.Single
import jetzt.machbarschaft.android.model.testapi.data.CreateUserBody
import jetzt.machbarschaft.android.model.testapi.data.CreateUserResponse
import jetzt.machbarschaft.android.model.testapi.data.GetUserResponse

/**
 * Interface which defines the methods and return values for the service usage
 */
interface UserDataSource {
    fun createUser(header: String, body: CreateUserBody): Single<CreateUserResponse>
    fun getUser(header: String): Single<GetUserResponse>
}