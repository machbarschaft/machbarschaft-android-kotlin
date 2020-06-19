package jetzt.machbarschaft.android.service.testapi.data

import com.google.gson.annotations.SerializedName


/**
 * This class was created by hand and needs to be replaced with the automatic created class from OPEN API Code Generator. :)
 * TODO replace
 */

class CreateUserBody {
    /**
     */
    @SerializedName("firstName")
    var firstName: String? = null

    /**
     */
    @SerializedName("lastName")
    var lastName: String? = null

    /**
     */
    @SerializedName("street")
    var street: String? = null

    /**
     */
    @SerializedName("streetNo")
    var streetNo: String? = null

    /**
     */
    @SerializedName("zipCode")
    var zipCode: String? = null

    /**
     */
    @SerializedName("city")
    var city: String? = null

    /**
     */
    @SerializedName("email")
    var email: String? = null

    @SerializedName("location")
    var location: GeoPoint? = null

    class GeoPoint {
        constructor(longitude: Double?, latitude: Double?) {
            this.longitude = longitude
            this.latitude = latitude
        }
        var longitude: Double? = null
        var latitude: Double? = null
    }

    /**
     */
    @SerializedName("phone")
    var phone: String? = null

    enum class SourceEnum {
        HOTLINE, APP
    }

    /**
     */
    @SerializedName("source")
    var source: SourceEnum? = null

    constructor(
        firstName: String?,
        lastName: String?,
        street: String?,
        streetNo: String?,
        zipCode: String?,
        city: String?,
        location: GeoPoint?,
        email: String?,
        phone: String?,
        source: SourceEnum?
    ) {
        this.firstName = firstName
        this.lastName = lastName
        this.street = street
        this.streetNo = streetNo
        this.zipCode = zipCode
        this.city = city
        this.location = location
        this.email = email
        this.phone = phone
        this.source = source
    }


    override fun equals(o: Any?): Boolean {
        if (this === o) {
            return true
        }
        if (o == null || javaClass != o.javaClass) {
            return false
        }
        val createUserDto = o as CreateUserBody
        return (if (firstName == null) createUserDto.firstName == null else firstName == createUserDto.firstName) &&
                (if (lastName == null) createUserDto.lastName == null else lastName == createUserDto.lastName) &&
                (if (street == null) createUserDto.street == null else street == createUserDto.street) &&
                (if (streetNo == null) createUserDto.streetNo == null else streetNo == createUserDto.streetNo) &&
                (if (zipCode == null) createUserDto.zipCode == null else zipCode == createUserDto.zipCode) &&
                (if (city == null) createUserDto.city == null else city == createUserDto.city) &&
                (if (email == null) createUserDto.email == null else email == createUserDto.email) &&
                (if (phone == null) createUserDto.phone == null else phone == createUserDto.phone) &&
                if (source == null) createUserDto.source == null else source == createUserDto.source
    }



    override fun toString(): String {
        val sb = StringBuilder()
        sb.append("class CreateUserDto {\n")
        sb.append("  firstName: ").append(firstName).append("\n")
        sb.append("  lastName: ").append(lastName).append("\n")
        sb.append("  street: ").append(street).append("\n")
        sb.append("  streetNo: ").append(streetNo).append("\n")
        sb.append("  zipCode: ").append(zipCode).append("\n")
        sb.append("  city: ").append(city).append("\n")
        sb.append("  email: ").append(email).append("\n")
        sb.append("  phone: ").append(phone).append("\n")
        sb.append("  source: ").append(source).append("\n")
        sb.append("}\n")
        return sb.toString()
    }
}