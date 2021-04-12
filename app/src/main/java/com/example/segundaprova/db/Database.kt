package com.example.segundaprova.db

import androidx.room.Database
import androidx.room.RoomDatabase
import com.example.segundaprova.Contatos

@Database(entities = arrayOf(Contatos::class), version = 1)
abstract class Database : RoomDatabase() {
    abstract fun contatosDao() : ContatosDao
}