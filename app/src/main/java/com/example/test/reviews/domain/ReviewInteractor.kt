package com.example.test.reviews.domain


import com.example.test.reviews.data.repository.ReviewRepositoryImpl
import io.reactivex.rxjava3.core.Single

class ReviewInteractor() {
    private var repository: ReviewRepository = ReviewRepositoryImpl()
    fun getReviewList(): Single<List<Reviews>> {

        return repository.getReviewList()
    }
}