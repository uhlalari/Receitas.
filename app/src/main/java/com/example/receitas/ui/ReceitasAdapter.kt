package com.example.receitas.ui

import androidx.appcompat.app.AppCompatActivity
import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.receitas.model.Receita

class ReceitasAdapter(
    activity: AppCompatActivity,
    val itemsCount: Int,
    val listaReceitas: List<Receita>
) : FragmentStateAdapter(activity) {

    override fun getItemCount(): Int {
        return itemsCount
    }

    override fun createFragment(position: Int): Fragment {
        return ReceitasFragment.getInstance(position, listaReceitas)
    }
}

