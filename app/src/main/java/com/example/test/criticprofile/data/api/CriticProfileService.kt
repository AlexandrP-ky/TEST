package com.example.test.criticprofile.data.api

import com.example.test.criticprofile.data.response.CriticProfileResponseModel
import io.reactivex.rxjava3.core.Single
import retrofit2.http.GET

interface CriticProfileService {
    @GET("critics/all.json?api-key=GW5a0tJfWOcfQ7k3dpQizIsrmpZ33Bmm")
    fun getCriticProfile(): Single<CriticProfileResponseModel>
}