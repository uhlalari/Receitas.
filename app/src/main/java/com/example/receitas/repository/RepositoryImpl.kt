package com.example.receitas.repository


import com.example.receitas.api.ReceitasService.Companion.receitasService
import com.example.receitas.model.Receita
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext


class RepositoryImpl : Repository {
    override suspend fun getListaReceita(): RepositoryStatus<List<Receita>> {

        return withContext(Dispatchers.IO){
            try {
                val listaReceita = receitasService.getRandomRecipes().recipes
                RepositoryStatus.Sucesso(listaReceita)
            }catch (t : Throwable){
                RepositoryStatus.Erro(t)
            }
        }
    }
}
