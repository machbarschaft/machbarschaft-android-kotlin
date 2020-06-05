package jetzt.machbarschaft.android.model.testapi.data

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.android.parcel.Parcelize

@Parcelize
data class TestResponse(
    @SerializedName("page") val page: Int?,
    @SerializedName("per_page") val perPage: Int?,
    @SerializedName("total") val total: Int?,
    @SerializedName("total_pages") val totalPages: Int?,
    @SerializedName("data") val data: List<UserResponse>?
) : Parcelable {

    companion object {
        val EMPTY = TestResponse(
            -1, -1, -1, -1, null
        )
    }

}