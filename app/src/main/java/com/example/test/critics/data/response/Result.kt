package com.example.test.critics.data.response

import com.google.gson.annotations.SerializedName

data class Result(
    @SerializedName("display_name")
    val display_name: String?,
    @SerializedName("multimedia")
    val multimedia: Multimedia?
)