package jetzt.machbarschaft.android.model.testapi.data


import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize


/**
 * This class was created by hand and needs to be replaced with the automatic created class from OPEN API Code Generator. :)
 * TODO replace
 */

@Parcelize
data class CreateUserResponse(
    @SerializedName("firstName") val firstName: String?,
    @SerializedName("lastName") val lastName: String?,
    @SerializedName("street") val street: String?,
    @SerializedName("zipCode") val zipCode: String?,
    @SerializedName("city") val city: String?,
    @SerializedName("email") val email: String?,
    @SerializedName("phone") val phone: String?,
    @SerializedName("source") val source: String?
) : Parcelable {

    companion object {
        val EMPTY = CreateUserResponse(
            firstName = "first Name", lastName = "lastName", street = "",
            zipCode = "", city = "", email = "", phone = "", source = ""
        )
    }

}