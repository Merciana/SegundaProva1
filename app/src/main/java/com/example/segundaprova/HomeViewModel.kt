package com.example.segundaprova

import android.app.Application
import androidx.lifecycle.AndroidViewModel
import androidx.lifecycle.LiveData
import androidx.room.Room
import com.example.segundaprova.db.Database

class HomeViewModel(application: Application) : AndroidViewModel(application) {

    var list : LiveData<List<Contatos>>

    init {
        val db: Database by lazy{
            Room.databaseBuilder(application.applicationContext,
                Database::class.java, "contatos.sqlite")
                .allowMainThreadQueries()
                .build()
        }
        list = db.contatosDao().listAll()
    }
}