package com.example.test.criticprofile.data.response

import com.google.gson.annotations.SerializedName

data class Result(
    @SerializedName("display_name")
    val display_name: String?,
    @SerializedName("status")
    val status: String?,
    @SerializedName("bio")
    val bio: String?
)