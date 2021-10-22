package com.example.test.reviews.presentation

import com.example.test.reviews.domain.Reviews

interface ReviewView {
    fun setData(results: List<Reviews>)
}