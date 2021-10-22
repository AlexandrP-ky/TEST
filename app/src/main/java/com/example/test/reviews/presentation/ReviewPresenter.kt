package com.example.test.reviews.presentation

import com.example.test.reviews.domain.ReviewInteractor
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers

class ReviewPresenter(view: ReviewView) {
    private val reviewInteractor = ReviewInteractor()
    private val reviewView: ReviewView = view

    fun getReviews() {
        reviewInteractor.getReviewList()
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe({ result ->
                reviewView.setData(result)
            }, { error ->
                error.printStackTrace()
            })
    }
}