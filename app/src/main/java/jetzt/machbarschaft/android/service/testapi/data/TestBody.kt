package jetzt.machbarschaft.android.service.testapi.data

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class TestBody(
    @SerializedName("id") val id: String?,
    @SerializedName("dateOfBirth") val dateOfBirth: String?
) : Parcelable {
    companion object {
        val EMPTY = TestBody(
            "", ""
        )
    }
}