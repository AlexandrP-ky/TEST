package com.example.test.reviews.domain

import io.reactivex.rxjava3.core.Single

interface ReviewRepository {

     fun getReviewList(): Single<List<Reviews>>
}
