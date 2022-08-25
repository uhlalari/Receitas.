package com.example.receitas.ui

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.fragment.app.Fragment
import com.bumptech.glide.Glide
import com.example.receitas.R
import com.example.receitas.model.Receita


class ReceitasFragment(val lista: List<Receita>) : Fragment() {
    companion object {
        const val ARG_POSITION = "position"

        fun getInstance(position: Int, listaReceita: List<Receita>): Fragment {
            val receitasFragment = ReceitasFragment(listaReceita)
            val bundle = Bundle()
            bundle.putInt(ARG_POSITION, position)
            receitasFragment.arguments = bundle
            return receitasFragment
        }
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?,
    ): View? {
        return inflater.inflate(R.layout.receita_page, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        val position = requireArguments().getInt(ARG_POSITION)
        val receita = lista[position]
        view.findViewById<TextView>(R.id.titulo_receita).text = receita.titulo
        view.findViewById<ConstraintLayout>(R.id.page_recipes).setOnClickListener {
        }

        val image = view.findViewById<ImageView>(R.id.imagem_receita)

        Glide.with(image)//Image view
            .load(receita.imagem)// Url em formato string
            .fitCenter()// centralizar
            .into(image)// image view
        view.findViewById<TextView>(R.id.instructions).text = receita.instrucoes
        view.findViewById<TextView>(R.id.tempo_preparo).text =
            "Tempo de preparo:  ${receita.tempoDePreparo} minutos"
    }
}
