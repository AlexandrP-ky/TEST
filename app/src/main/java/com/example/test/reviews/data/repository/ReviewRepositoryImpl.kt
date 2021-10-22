package com.example.test.reviews.data.repository

import com.example.test.RetrofitInstance
import com.example.test.reviews.data.api.ReviewService
import com.example.test.reviews.data.response.Results
import com.example.test.reviews.data.response.ReviewResponse
import com.example.test.reviews.domain.ReviewRepository
import com.example.test.reviews.domain.Reviews
import io.reactivex.rxjava3.core.Single

class ReviewRepositoryImpl() : ReviewRepository {


    override fun getReviewList(): Single<List<Reviews>> {
        val retrofitInstance =
            RetrofitInstance.getRetrofitInstance().create(ReviewService::class.java)
        return retrofitInstance.getReviews().map { mapToListReviews(it) }
    }

    private fun mapToListReviews(response: ReviewResponse): List<Reviews> {
        return response.result.map { mapToReviews(it) }
    }

    private fun mapToReviews(results: Results): Reviews {
        return Reviews(
            results.title,
            results.summary,
            results.byline,
            results.multimedia?.imageUrl,
            results.link?.url
        )
    }
}