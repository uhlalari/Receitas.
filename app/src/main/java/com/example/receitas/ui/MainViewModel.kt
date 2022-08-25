package com.example.receitas.ui

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.receitas.model.Receita
import com.example.receitas.model.ResponseFirebase
import com.example.receitas.repository.Repository
import com.example.receitas.repository.RepositoryImpl
import com.example.receitas.repository.RepositoryStatus
import com.google.firebase.firestore.FirebaseFirestore
import com.google.gson.Gson
import kotlinx.coroutines.launch

class MainViewModel(private val repository: Repository = RepositoryImpl()) : ViewModel() {

    val gson = Gson()

    //Variavel que armazena os dados que vem do repository
    private val _receitaListResponse = MutableLiveData<List<Receita>>()

    //Variavel que a View vai observar e liveData n pode ser alterada
    val listaReceitas: LiveData<List<Receita>>
        get() = _receitaListResponse // Adicionando o retorno do repository na variavel observada pela View

    private val _error = MutableLiveData<Throwable>()
    val error: LiveData<Throwable>
        get() = _error

    fun getReceitas() = viewModelScope.launch {
        val bancoDeDados = FirebaseFirestore.getInstance()
        bancoDeDados.collection("Receitas").document("Lari")
            .addSnapshotListener { value, error ->
                var listaFirebase = gson.toJson(value?.data).toString()
                var lista = gson.fromJson(listaFirebase, ResponseFirebase::class.java)
                _receitaListResponse.value = lista.receitas
            }
        /*repository.getListaReceita().apply {
            when (this) {
                is RepositoryStatus.Sucesso -> _receitaListResponse.value = listaMok
                is RepositoryStatus.Erro -> _error.value = error
            }
        }*/
    }
}
