package jetzt.machbarschaft.android.service.testapi.datasource

import io.reactivex.Single
import jetzt.machbarschaft.android.model.testapi.datasource.UserDataApi
import jetzt.machbarschaft.android.service.testapi.data.*

/**
 * Implementation of [UserDataSource] that uses the remote server as data source.
 */
class UserRemoteDataSource constructor(
    private val userDataApi: UserDataApi
) : UserDataSource {


    /**
     * Creates a new new User Account in the Backend.
     */
    override fun createUser(header: String, body: CreateUserBody): Single<CreateUserResponse> =
        userDataApi.createUser(header, body)
            .flatMap {
                Single.just(it.body())
            }


    /**
     * Gets the Current User Account in a anonymized version with geo hash.
     */
    override fun getUser(header: String): Single<GetUserResponse> =
        userDataApi.getUser(header)
            .flatMap {
                Single.just(it.body())
            }

}