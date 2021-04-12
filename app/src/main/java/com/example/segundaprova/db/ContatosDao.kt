package com.example.segundaprova.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query
import com.example.segundaprova.Contatos

@Dao
interface ContatosDao {

    @Insert
    fun add(c: Contatos): Long

    @Query("SELECT * FROM Contatos")
    fun listAll():MutableList<Contatos>

    @Delete
    fun remove(c: Contatos): Int
}