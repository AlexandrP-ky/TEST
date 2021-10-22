package com.example.test.critics.presentation

import com.example.test.critics.domain.CriticInteractor
import io.reactivex.rxjava3.android.schedulers.AndroidSchedulers
import io.reactivex.rxjava3.schedulers.Schedulers

class CriticPresenter(view: CriticView) {
    private val criticInteractor = CriticInteractor()
    private val criticView: CriticView = view

    fun getCritics() {
        criticInteractor.getCriticList()
            .observeOn(AndroidSchedulers.mainThread())
            .subscribeOn(Schedulers.io())
            .subscribe({ result ->
                criticView.setData(result)
            }, { error ->
                error.printStackTrace()
            })
    }
}