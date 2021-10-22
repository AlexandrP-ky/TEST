package com.example.test.critics.presentation

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.GridLayoutManager
import com.example.test.critics.domain.Critic
import com.example.test.databinding.FragmentCriticsBinding

class CriticFragment : Fragment(), CriticView {

    private var _binding: FragmentCriticsBinding? = null

    // This property is only valid between onCreateView and
    // onDestroyView.
    private val binding get() = _binding!!

    private var _presenter: CriticPresenter? = null
    private val presenter get() = _presenter!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        _presenter = CriticPresenter(this)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentCriticsBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        presenter.getCritics()
    }


    override fun setData(result: List<Critic>) {
        binding.recyclerViewCritic.layoutManager = GridLayoutManager(context, 2)
        binding.recyclerViewCritic.adapter = CriticAdapter(result)
    }
}