package com.example.test.critics.data.response

import com.google.gson.annotations.SerializedName

data class Resource(
    @SerializedName("src")
    val src: String?
)