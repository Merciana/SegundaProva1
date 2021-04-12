package com.example.segundaprova.menu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import com.example.segundaprova.R
import com.example.segundaprova.databinding.FragmentErrouBinding

class errouFragment : Fragment() {

    lateinit var binding: FragmentErrouBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.layout.fragment_errou, container,false)

        binding.Tentar2.setOnClickListener {
            Navigation.findNavController(it).navigate(R.id.action_formularioFragment_to_errouFragment)
        }
        return binding.root
    }

}