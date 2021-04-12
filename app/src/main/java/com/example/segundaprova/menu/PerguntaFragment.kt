package com.example.segundaprova.menu

import android.os.Bundle
import android.view.*
import androidx.fragment.app.Fragment
import android.widget.Toast
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.fragment.findNavController
import androidx.navigation.fragment.navArgs
import androidx.navigation.ui.NavigationUI
import com.example.segundaprova.R
import com.example.segundaprova.databinding.FragmentPerguntaBinding

class PerguntaFragment : Fragment() {

    lateinit var binding: FragmentPerguntaBinding

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,savedInstanceState: Bundle?): View? {
        binding = DataBindingUtil.inflate(inflater,R.layout.fragment_pergunta,container, false)

        binding.button.setOnClickListener {
            //Navigation.findNavController(it).navigate(R.id.action_tituloFragment_to_perguntaFragment)
            Navigation.findNavController(it).navigate(PerguntaFragmentDirections.actionPerguntaFragmentToFormularioFragment("Contatos", 1L))
        }

        setHasOptionsMenu(true)
        return binding.root
    }

    override fun onCreateOptionsMenu(menu: Menu, inflater: MenuInflater) {
        super.onCreateOptionsMenu(menu, inflater)
        inflater.inflate(R.menu.drawer_menu, menu)
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        return NavigationUI.onNavDestinationSelected(item, this.findNavController()) || super.onOptionsItemSelected(item)
    }

}