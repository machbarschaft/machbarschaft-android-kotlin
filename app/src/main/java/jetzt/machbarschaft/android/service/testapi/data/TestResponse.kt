package jetzt.machbarschaft.android.service.testapi.data

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class TestResponse(
    @SerializedName("id") val id: String?,
    @SerializedName("name") val name: String?,
    @SerializedName("email") val email: String?,
    @SerializedName("username") val username: String?
) : Parcelable {

    companion object {
        val EMPTY = TestResponse(
            "", "", "", ""
        )
    }

}