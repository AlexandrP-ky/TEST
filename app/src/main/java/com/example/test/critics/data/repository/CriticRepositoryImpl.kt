package com.example.test.critics.data.repository

import com.example.test.RetrofitInstance
import com.example.test.critics.data.api.CriticService
import com.example.test.critics.data.response.CriticResponse
import com.example.test.critics.domain.Critic
import com.example.test.critics.data.response.Result
import com.example.test.critics.domain.CriticRepository
import io.reactivex.rxjava3.core.Single

class CriticRepositoryImpl(): CriticRepository {


    override fun getCriticList(): Single<List<Critic>> {
        val retrofitInstance =
            RetrofitInstance.getRetrofitInstance().create(CriticService::class.java)
        return retrofitInstance.getCritics().map { mapToListCritics(it) }
    }

    private fun mapToListCritics(response: CriticResponse): List<Critic> {
        return response.result.map { mapToCritics(it) }
    }

    private fun mapToCritics(results: Result): Critic {
        return Critic(
            results.display_name,
            results.multimedia?.resource?.src
        )
    }

}