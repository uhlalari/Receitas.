package com.example.receitas.api

import com.example.receitas.api.const.API_KEY
import com.example.receitas.api.const.API_URL
import com.example.receitas.model.RespostaRandom
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.GET

interface ReceitasService {
    @GET("random?${API_KEY}&number=20")
    suspend fun getRandomRecipes(): RespostaRandom

    companion object {
        val receitasService: ReceitasService by lazy {
            val endpoint = Retrofit.Builder()
                .baseUrl(API_URL)
                .addConverterFactory(GsonConverterFactory.create())
                .build()

            endpoint.create(ReceitasService::class.java)
        }
    }
}
