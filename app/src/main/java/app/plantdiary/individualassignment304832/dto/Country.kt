package app.plantdiary.individualassignment304832.dto

import com.google.gson.annotations.SerializedName

//Use @SerializedName to be compatible with "Name" and "Code" in the json file
data class Country(@SerializedName("Code") var code: String,@SerializedName("Name") var name: String) {

    override fun toString(): String {
        return "$name $code"
    }
    //Override the default tostring of the data class to suit the test
}