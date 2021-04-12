package com.example.segundaprova

import android.content.Context
import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class ContatosAdapter(var c: Context, var contatos:List<Contatos>) : RecyclerView.Adapter<ContatosViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ContatosViewHolder {

        val view = LayoutInflater.from(c).inflate(R.layout.contatos_card, parent, false);
        return ContatosViewHolder(view)
    }

    override fun getItemCount(): Int {
        return contatos.size
    }

    override fun onBindViewHolder(holder: ContatosViewHolder, position: Int) {
        val contatoescolhido = contatos[position]
        holder.textViewNome.text = contatoescolhido.nome
        holder.img.setImageResource(contatoescolhido.imagem)
    }

}