package com.example.test.critics.data.api

import com.example.test.critics.data.response.CriticResponse
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET
import retrofit2.http.Query

interface CriticService {
    @GET("critics/all.json?api-key=GW5a0tJfWOcfQ7k3dpQizIsrmpZ33Bmm")
    fun getCritics(): Single<CriticResponse>
}