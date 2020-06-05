package jetzt.machbarschaft.android.model

/**
 * Constants representing the remote server API URLs.
 */
object ApiConstants {

    //test base url
//    val BASE_URL = "https://jsonplaceholder.typicode.com"
    val BASE_URL = "https://reqres.in"

    object TestApi {
        const val GET_ALL = "/api/users"

        const val POST_BY_USER_ID = "/users"
    }
}