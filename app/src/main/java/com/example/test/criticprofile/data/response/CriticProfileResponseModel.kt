package com.example.test.criticprofile.data.response
import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class CriticProfileResponseModel (
        @SerializedName("results")
        @Expose
        val result: List<Result>
    )
