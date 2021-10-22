package com.example.test.reviews.data.response

import com.google.gson.annotations.Expose
import com.google.gson.annotations.SerializedName

data class ReviewResponse(
    @SerializedName("results")
    @Expose
    val result: List<Results>
)