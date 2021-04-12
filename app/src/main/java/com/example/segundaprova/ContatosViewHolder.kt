package com.example.segundaprova

import android.view.View
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView

class ContatosViewHolder(v:View) : RecyclerView.ViewHolder(v) {

    val textViewNome: TextView
    val img: ImageView

    init {
        textViewNome = v.findViewById(R.id.IDContatos)
        img = v.findViewById(R.id.imagContatos)

    }
}