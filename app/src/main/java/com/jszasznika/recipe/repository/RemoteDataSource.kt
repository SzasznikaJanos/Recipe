package com.jszasznika.recipe.repository


class RemoteDataSource(private val spoonacularApi: SpoonacularApi) {

    suspend fun complexSearch(query: Map<String, Any>) =
        kotlin.runCatching { spoonacularApi.complexSearch(query) }

}

