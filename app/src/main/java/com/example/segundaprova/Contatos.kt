package com.example.segundaprova

import  androidx.room.PrimaryKey

data class Contatos(var nome:String, var imagem:Int) {
    @PrimaryKey(autoGenerate = true) var id:Long = 0
}