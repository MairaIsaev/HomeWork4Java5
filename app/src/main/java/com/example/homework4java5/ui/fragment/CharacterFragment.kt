package com.example.homework4java5.ui.fragment

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.viewModels
import com.example.homework4java5.data.model.CharactersItem
import com.example.homework4java5.databinding.FragmentCharacterBinding
import com.example.homework4java5.ui.adapter.CharacterAdapter

class CharacterFragment : Fragment() {

    private var _binding: FragmentCharacterBinding? = null
    private val binding: FragmentCharacterBinding get() = _binding!!
    private val adapter = CharacterAdapter.CharacterAdapter()
    private val viewModel by viewModels<CharacterViewModel>()

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentCharacterBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        subscribe()
        initialize()
    }

    private fun subscribe() {
        viewModel.characterLiveData.observe(viewLifecycleOwner) {
            Log.e("bleach", "subscribe: ${it.success}")
            adapter.setCharacter(it.success!!)
        }
    }

    private fun initialize() = with(binding) {
        rvCharacter.adapter = adapter
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}