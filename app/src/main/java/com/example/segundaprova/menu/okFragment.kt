package com.example.segundaprova.menu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.segundaprova.R
import com.example.segundaprova.databinding.FragmentOkBinding

class okFragment : Fragment() {

    lateinit var binding: FragmentOkBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment

        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_ok, container, false)

        binding.novamente.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_okFragment_to_formularioFragment)
        }

        return binding.root
    }

}