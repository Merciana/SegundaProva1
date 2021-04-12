package com.example.segundaprova.menu

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.fragment.navArgs
import com.example.segundaprova.R
import com.example.segundaprova.databinding.FragmentFormularioBinding
import com.example.segundaprova.databinding.FragmentPerguntaBinding

class formularioFragment : Fragment() {

    lateinit var binding: FragmentFormularioBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?): View? {
        // Inflate the layout for this fragment
        binding = DataBindingUtil.inflate(inflater, R.id.formularioFragment, container, false)

        binding.GResposta.setOnClickListener {
            if(binding.Formulario.checkedRadioButtonId == R.id.FA){
                Navigation.findNavController(it).navigate(R.id.action_formularioFragment_to_okFragment)
            }else{
                Navigation.findNavController(it).navigate(R.id.action_formularioFragment_to_errouFragment)
            }
        }

        val args:FormularioFragmentArgs by navArgs()

        Toast.makeText(context, "${args.mensagem} o id: ${args.id}", Toast.LENGTH_SHORT).show()

        return binding.root
    }

}