package jetzt.machbarschaft.android.model.testapi.data

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class UserResponse(
    @SerializedName("id") val id: String?,
    @SerializedName("first_name") val firstName: String?,
    @SerializedName("last_name") val lastName: String?,
    @SerializedName("email") val email: String?,
    @SerializedName("avatar") val avatarLink: String?
) : Parcelable {

    companion object {
        val EMPTY = UserResponse(
            "", "", "", "", ""
        )
    }

}