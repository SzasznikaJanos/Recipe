package com.jszasznika.recipe.repository

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object SpoonacularService {

     const val API_KEY = "94703d3ba7ce4098a46b382e8aca2411"

    private const val BASE_URL = "https://api.spoonacular.com/"

    val client: SpoonacularApi by lazy {
        Retrofit.Builder()
            .baseUrl(BASE_URL)
            .addConverterFactory(GsonConverterFactory.create())
            .build()
            .create(SpoonacularApi::class.java)
    }
}
