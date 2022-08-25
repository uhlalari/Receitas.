package com.example.receitas.ui

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.viewpager2.widget.ViewPager2
import com.example.receitas.R
import com.example.receitas.model.Receita
import com.google.firebase.FirebaseApp
import com.google.firebase.firestore.FirebaseFirestore


class MainActivity : AppCompatActivity() {
    val context = this

    // Chamando a View Model
    val viewModel: MainViewModel = MainViewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        supportActionBar?.apply { hide() }

        //Executa a função que altera a variável dentro do viewmodel
        viewModel.getReceitas()

        //Observa variavel
        viewModel.listaReceitas.observe(this) {
            val receitasAdapter = ReceitasAdapter(context, it.size, it)
            findViewById<ViewPager2>(R.id.receitasViewPager).adapter = receitasAdapter
        }

        //Observa variavel
        viewModel.error.observe(this) {
        }

    }
}
