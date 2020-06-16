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
 * @param source
 * @param hint
 * @param maxPrice
 * @param userId
 * @param items
 */

data class CreateOrderDtoModel(
    @Json(name = "source")
    val source: CreateOrderDtoModel.Source,
    @Json(name = "hint")
    val hint: kotlin.String? = null,
    @Json(name = "maxPrice")
    val maxPrice: kotlin.Int? = null,
    @Json(name = "userId")
    val userId: kotlin.Int? = null,
    @Json(name = "items")
    val items: kotlin.Array<CreateOrderItemDtoModel>? = null
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
