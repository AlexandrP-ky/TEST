package com.example.test.critics.presentation

import com.example.test.critics.domain.Critic

interface CriticView {
    fun setData(result: List<Critic>)
}