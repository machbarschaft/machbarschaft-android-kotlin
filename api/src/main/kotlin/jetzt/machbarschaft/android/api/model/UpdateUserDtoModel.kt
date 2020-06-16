/**
 * Api Documentation
 * Api Documentation
 *
 * The version of the OpenAPI document: 1.0
 *
 *
 * NOTE: This class is auto generated by OpenAPI Generator (https://openapi-generator.tech).
 * https://openapi-generator.tech
 * Do not edit the class manually.
 */
package jetzt.machbarschaft.android.api.model

import com.squareup.moshi.Json

/**
 *
 * @param firstName
 * @param lastName
 * @param street
 * @param streetNo
 * @param zipCode
 * @param city
 * @param email
 * @param location
 * @param phone
 * @param source
 */

data class UpdateUserDtoModel(
    @Json(name = "firstName")
    val firstName: kotlin.String,
    @Json(name = "lastName")
    val lastName: kotlin.String,
    @Json(name = "street")
    val street: kotlin.String,
    @Json(name = "streetNo")
    val streetNo: kotlin.String,
    @Json(name = "zipCode")
    val zipCode: kotlin.String,
    @Json(name = "city")
    val city: kotlin.String,
    @Json(name = "email")
    val email: kotlin.String,
    @Json(name = "location")
    val location: GeoPointResource1Model,
    @Json(name = "phone")
    val phone: kotlin.String,
    @Json(name = "source")
    val source: UpdateUserDtoModel.Source
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
