package com.example.receitas.repository

import com.example.receitas.model.Receita

sealed class RepositoryStatus<out R> {
    class Sucesso(val listaDeReceitas: List<Receita>) : RepositoryStatus<List<Receita>>()
    class Erro(val error: Throwable) : RepositoryStatus<Nothing>()
}

interface Repository {
    suspend fun getListaReceita(): RepositoryStatus<List<Receita>>
}

