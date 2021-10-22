package com.example.test.critics.data.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CriticResponse(
    @SerializedName("results")
    @Expose
    val result: List<Result>
)