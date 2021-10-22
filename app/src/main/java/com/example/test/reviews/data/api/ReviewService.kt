package com.example.test.reviews.data.api

import com.example.test.reviews.data.response.ReviewResponse
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET

interface ReviewService {
    @GET("reviews/search.json?api-key=ornQiFOZGXsmZH2lx1Fbl2KApsIXWGbM")
    fun getReviews(): Single<ReviewResponse>
}