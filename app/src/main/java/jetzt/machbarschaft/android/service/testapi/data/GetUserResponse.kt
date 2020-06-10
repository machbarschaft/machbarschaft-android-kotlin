package jetzt.machbarschaft.android.service.testapi.data

import com.squareup.moshi.Json


/**
 * This class was created by hand and needs to be replaced with the automatic created class from OPEN API Code Generator. :)
 * TODO replace and add missing values
 */
data class GetUserResponse(
    @Json(name = "centerOfLocationGeoHash")
    val centerOfLocationGeoHash: GeoPoint,
    @Json(name = "city")
    val city: kotlin.String,
    @Json(name = "locationGeoHash")
    val locationGeoHash: kotlin.String,
    @Json(name = "source")
    val source: GetUserResponse.Source,
    @Json(name = "zipCode")
    val zipCode: kotlin.String,
    @Json(name = "firstName")
    val firstName: kotlin.String? = null,
    @Json(name = "id")
    val id: java.util.UUID? = null
) {

    /**
     *
     * Values: hOTLINE,aPP
     */

    enum class Source(val value: kotlin.String) {
        @Json(name = "HOTLINE")
        hOTLINE("HOTLINE"),
        @Json(name = "APP")
        aPP("APP");
    }
}


class GeoPoint {
    constructor(longitude: Double?, latitude: Double?) {
        this.longitude = longitude
        this.latitude = latitude
    }
    var longitude: Double? = null
    var latitude: Double? = null
}