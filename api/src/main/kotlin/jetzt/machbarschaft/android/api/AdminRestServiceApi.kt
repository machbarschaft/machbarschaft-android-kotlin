package jetzt.machbarschaft.android.api

import jetzt.machbarschaft.android.api.model.PatchUserAdminDtoModel
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.PATCH
import retrofit2.http.Path
import retrofit2.http.Query

interface AdminRestServiceApi {
    @PATCH("/v1/admin/users/{userId}")
    fun updateUserAdminUsingPATCH(
        @Path("userId") userId: kotlin.String,
        @Body userPatch: PatchUserAdminDtoModel,
        @Query("rawStatusCode") rawStatusCode: kotlin.Int,
        @Query("statusCode") statusCode: kotlin.String
    ): Call<kotlin.Any>

}
