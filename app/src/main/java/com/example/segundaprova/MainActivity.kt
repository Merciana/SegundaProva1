package com.example.segundaprova

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.databinding.DataBindingUtil
import androidx.navigation.Navigation
import androidx.navigation.ui.NavigationUI
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.room.Room
import com.example.segundaprova.databinding.ActivityMainBinding
import com.example.segundaprova.db.Database

class MainActivity : AppCompatActivity() {

    lateinit var binding: ActivityMainBinding

    val db: Database by lazy {
        Room.databaseBuilder(this, Database::class.java, "contatos.sqlite")
            .allowMainThreadQueries()
            .build()
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)

        val navController = Navigation.findNavController(this, R.id.homeFragment)
        NavigationUI.setupActionBarWithNavController(this, navController, binding.drawerLayout)
        NavigationUI.setupWithNavController(binding.navView,navController)

        var c1 = Contatos("ID", R.drawable.ic_launcher_foreground)
        var c2 = Contatos("ID", R.drawable.ic_launcher_foreground)
        var c3 = Contatos("ID", R.drawable.ic_launcher_foreground)

        with(db.contatosDao()) {
            add(c1)
            add(c2)
            add(c3)
        }

        var listaContatos: MutableList<Contatos> = db.contatosDao().listAll()

        var adapter = ContatosAdapter(this, listaContatos)
        recyclerview.adapter = adapter

        var layout = LinearLayoutManager(this, LinearLayoutManager.VERTICAL, false)

        recyclerview.layoutManager = layout
    }

    override fun onSupportNavigateUp(): Boolean {
        val navController = Navigation.findNavController(this, R.id.homeFragment)
        return NavigationUI.navigateUp(navController, binding.drawerLayout)
    }
}