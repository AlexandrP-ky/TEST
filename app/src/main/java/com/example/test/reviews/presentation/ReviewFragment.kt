package com.example.test.reviews.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.example.test.databinding.FragmentReviewsBinding
import com.example.test.reviews.domain.Reviews

class ReviewFragment : Fragment(), ReviewView {

    private var _binding: FragmentReviewsBinding? = null
    private val binding get() = _binding!!

    private var _presenter: ReviewPresenter? = null
    private val presenter get() = _presenter!!


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _presenter = ReviewPresenter(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentReviewsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter.getReviews()
    }

    override fun setData(results: List<Reviews>) {
        binding.recyclerViewReview.layoutManager = LinearLayoutManager(
            context,
            LinearLayoutManager.VERTICAL,
            false
        )
        binding.recyclerViewReview.adapter = ReviewAdapter(results)
    }
}