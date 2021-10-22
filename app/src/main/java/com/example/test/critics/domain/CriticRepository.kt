package com.example.test.critics.domain

import io.reactivex.rxjava3.core.Single

interface CriticRepository {
    fun getCriticList():Single<List<Critic>>
}