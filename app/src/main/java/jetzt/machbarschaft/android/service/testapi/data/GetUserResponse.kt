package jetzt.machbarschaft.android.service.testapi.data

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import com.squareup.moshi.Json
import kotlinx.android.parcel.Parcelize


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

@Parcelize
data class GeoPoint(
    @SerializedName("longitude") val longitude: Double?,
    @SerializedName("latitude") val latitude: Double?
): Parcelable
