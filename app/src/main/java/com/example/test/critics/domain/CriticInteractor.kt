package com.example.test.critics.domain

import com.example.test.critics.data.repository.CriticRepositoryImpl
import io.reactivex.rxjava3.core.Single

class CriticInteractor {

    private var repository: CriticRepository = CriticRepositoryImpl()
    fun getCriticList(): Single<List<Critic>> {

        return repository.getCriticList()
    }
}