package jetzt.machbarschaft.android.model

/**
 * Constants representing the remote server API URLs.
 * TODO replace with open api code gen
 */
object ApiConstants {

    // Base URL of the API
    const val BASE_URL = "https://service-api-ng.nightly.staging.colivery.app/v1/"

    object TestApi {
        // Endpoint handling all Calls with the User Account Update(Makes Changes in the Account), Delete(Deletes the Account, also in Firebase), Post(Creates a new Account) and Get(Gets the Account information).
        const val USER = "user"

    }
}