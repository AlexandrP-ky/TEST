package com.example.test.criticprofile.data.repository

import com.example.test.RetrofitInstance
import com.example.test.criticprofile.data.api.CriticProfileService
import com.example.test.criticprofile.data.response.CriticProfileResponseModel
import com.example.test.criticprofile.data.response.Result
import com.example.test.criticprofile.domain.CriticProfileModel
import com.example.test.criticprofile.domain.CriticProfileRepository
import io.reactivex.rxjava3.core.Single

class CriticProfileRepositoryImpl(): CriticProfileRepository {

    override fun getCriticProfile(): Single<CriticProfileModel> {
        val retrofitInstance =
            RetrofitInstance.getRetrofitInstance().create(CriticProfileService::class.java)
        TODO()
    }
    private fun mapToCriticProfileModel(results: CriticProfileResponseModel): CriticProfileModel{
        val res = results.result[0]
        return CriticProfileModel(
            res.display_name,
            res.status,
            res.bio
        )
    }
}