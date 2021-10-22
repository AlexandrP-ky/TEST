package com.example.test.reviews.data.response

import com.google.gson.annotations.SerializedName

data class Results(
    @SerializedName("headline")
    val title: String?,
    @SerializedName("summary_short")
    val summary: String?,
    @SerializedName("byline")
    val byline: String?,
    @SerializedName("multimedia")
    val multimedia: ImageReview?,
    @SerializedName("link")
    val link: Link?
)