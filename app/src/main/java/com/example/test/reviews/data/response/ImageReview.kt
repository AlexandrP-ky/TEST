package com.example.test.reviews.data.response

import com.google.gson.annotations.SerializedName

data class ImageReview(
    @SerializedName("src")
    val imageUrl: String?
)