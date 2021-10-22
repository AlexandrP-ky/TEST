package com.example.test.criticprofile.domain

import io.reactivex.rxjava3.core.Single

interface CriticProfileRepository {
    fun getCriticProfile():Single<CriticProfileModel>
}