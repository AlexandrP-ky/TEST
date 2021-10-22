package com.example.test.critics.data.response

import com.google.gson.annotations.SerializedName

data class Multimedia(
    @SerializedName("resource")
    val resource: Resource?
)