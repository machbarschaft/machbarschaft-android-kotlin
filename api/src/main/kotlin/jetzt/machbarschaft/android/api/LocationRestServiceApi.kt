package jetzt.machbarschaft.android.api

import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Query


interface LocationRestServiceApi {
    @GET("/v1/location")
    fun geoCodeAddressUsingGET(
        @Query("countryCode") countryCode: kotlin.String,
        @Query("zipCode") zipCode: kotlin.String
    ): Call<kotlin.Any>

}
