package jetzt.machbarschaft.android.api

import jetzt.machbarschaft.android.api.model.CreateOrderDtoModel
import jetzt.machbarschaft.android.api.model.FluxUserOrderSearchResponseModel
import retrofit2.Call
import retrofit2.http.*

interface OrderRestServiceApi {
    @PATCH("/v1/order/{orderId}/abort")
    fun abortOrderDeliveryUsingPATCH(
        @Path("orderId") orderId: java.util.UUID,
        @Query("authenticated") authenticated: kotlin.Boolean,
        @Query("authorities[0].authority") authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority: kotlin.String,
        @Query("credentials") credentials: kotlin.Any,
        @Query("details") details: kotlin.Any,
        @Query("principal") principal: kotlin.Any
    ): Call<kotlin.Any>

    @PATCH("/v1/order/{orderId}/accept")
    fun acceptOrderUsingPATCH(
        @Path("orderId") orderId: java.util.UUID,
        @Query("authenticated") authenticated: kotlin.Boolean,
        @Query("authorities[0].authority") authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority: kotlin.String,
        @Query("credentials") credentials: kotlin.Any,
        @Query("details") details: kotlin.Any,
        @Query("principal") principal: kotlin.Any
    ): Call<kotlin.Any>

    @PATCH("/v1/order/{orderId}/cancel")
    fun cancelOrderUsingPATCH(
        @Path("orderId") orderId: java.util.UUID,
        @Query("authenticated") authenticated: kotlin.Boolean,
        @Query("authorities[0].authority") authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority: kotlin.String,
        @Query("credentials") credentials: kotlin.Any,
        @Query("details") details: kotlin.Any,
        @Query("principal") principal: kotlin.Any
    ): Call<kotlin.Any>

    @POST("/v1/order")
    fun createOrderUsingPOST(
        @Body order: CreateOrderDtoModel,
        @Query("authenticated") authenticated: kotlin.Boolean,
        @Query("authorities[0].authority") authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority: kotlin.String,
        @Query("credentials") credentials: kotlin.Any,
        @Query("details") details: kotlin.Any,
        @Query("principal") principal: kotlin.Any
    ): Call<kotlin.Any>

    @PATCH("/v1/order/{orderId}/deliver")
    fun deliverOrderUsingPATCH(
        @Path("orderId") orderId: java.util.UUID,
        @Query("authenticated") authenticated: kotlin.Boolean,
        @Query("authorities[0].authority") authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority: kotlin.String,
        @Query("credentials") credentials: kotlin.Any,
        @Query("details") details: kotlin.Any,
        @Query("principal") principal: kotlin.Any
    ): Call<kotlin.Any>

    @GET("/v1/order")
    fun searchOrdersInRangeUsingGET(
        @Query("latitude") latitude: kotlin.Double,
        @Query("longitude") longitude: kotlin.Double,
        @Query("range") range: kotlin.Int
    ): Call<FluxUserOrderSearchResponseModel>

}
