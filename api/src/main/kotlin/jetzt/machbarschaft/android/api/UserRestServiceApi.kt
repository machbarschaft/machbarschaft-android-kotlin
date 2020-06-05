package jetzt.machbarschaft.android.api

import jetzt.machbarschaft.android.api.model.CreateUserDtoModel
import jetzt.machbarschaft.android.api.model.FluxUserOrderAcceptedResponseModel
import jetzt.machbarschaft.android.api.model.FluxUserOrderResponseModel
import jetzt.machbarschaft.android.api.model.UpdateUserDtoModel
import retrofit2.Call
import retrofit2.http.*

interface UserRestServiceApi {
    @POST("/v1/user")
    fun createUserUsingPOST(@Body createUserDto: CreateUserDtoModel): Call<kotlin.Any>

    @DELETE("/v1/user")
    fun deleteOwnUserUsingDELETE(
        @Query("authenticated") authenticated: kotlin.Boolean,
        @Query("authorities[0].authority") authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority: kotlin.String,
        @Query("credentials") credentials: kotlin.Any,
        @Query("details") details: kotlin.Any,
        @Query("principal") principal: kotlin.Any
    ): Call<Unit>

    @GET("/v1/user/orders-accepted")
    fun getDriverOrdersUsingGET(
        @Query("authenticated") authenticated: kotlin.Boolean,
        @Query("authorities[0].authority") authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority: kotlin.String,
        @Query("credentials") credentials: kotlin.Any,
        @Query("details") details: kotlin.Any,
        @Query("principal") principal: kotlin.Any
    ): Call<FluxUserOrderAcceptedResponseModel>

    @GET("/v1/user/orders")
    fun getOrdersForUserUsingGET(
        @Query("authenticated") authenticated: kotlin.Boolean,
        @Query("authorities[0].authority") authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority: kotlin.String,
        @Query("credentials") credentials: kotlin.Any,
        @Query("details") details: kotlin.Any,
        @Query("principal") principal: kotlin.Any
    ): Call<FluxUserOrderResponseModel>

    @GET("/v1/user")
    fun getUserUsingGET(
        @Query("authenticated") authenticated: kotlin.Boolean,
        @Query("authorities[0].authority") authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority: kotlin.String,
        @Query("credentials") credentials: kotlin.Any,
        @Query("details") details: kotlin.Any,
        @Query("principal") principal: kotlin.Any
    ): Call<kotlin.Any>

    @PUT("/v1/user")
    fun updateOwnUserUsingPUT(
        @Body updateUserDto: UpdateUserDtoModel,
        @Query("authenticated") authenticated: kotlin.Boolean,
        @Query("authorities[0].authority") authoritiesLeftSquareBracket0RightSquareBracketPeriodAuthority: kotlin.String,
        @Query("credentials") credentials: kotlin.Any,
        @Query("details") details: kotlin.Any,
        @Query("principal") principal: kotlin.Any
    ): Call<kotlin.Any>

}
