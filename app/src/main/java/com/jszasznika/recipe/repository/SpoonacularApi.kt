package com.jszasznika.recipe.repository

import retrofit2.http.GET
import retrofit2.http.QueryMap


interface SpoonacularApi {

    @GET("recipes/complexSearch?apiKey=${SpoonacularService.API_KEY}")
    suspend fun complexSearch(@QueryMap query: Map<String, @JvmSuppressWildcards Any>):Any
}
