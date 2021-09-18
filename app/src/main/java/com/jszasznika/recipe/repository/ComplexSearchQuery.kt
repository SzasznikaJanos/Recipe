package com.jszasznika.recipe.repository

import com.jszasznika.recipe.domain.Diet

class ComplexSearchQuery(searchText:String) {

     val query = mutableMapOf<String, Any>(
        "offset" to 0,
        "number" to 100,
        "instructionsRequired" to false,
        "fillIngredients" to false,
        "addRecipeInformation" to false
    )

    init {
        validateQueryInput(searchText)

         query.apply {
            put("query",searchText)
        }
    }




    fun skipResults(count: Int) = apply {
        query["offset"] = count
    }

    fun resultsCount(count: Int) = apply {
        query["number"] = count
    }


    fun diet(diet: Diet) = apply {
        query["diet"] = diet.dietName
    }

    fun newQuery(searchText: String): ComplexSearchQuery {
        validateQueryInput(searchText)
        return apply {
            with(query) {
                clear()
                put("query",searchText)
                putAll(defaultMap)

            }
        }
    }

    private fun validateQueryInput(searchText: String) {
        if (searchText.isBlank()) throw IllegalArgumentException("Query is blank...")
    }

    private val defaultMap = mutableMapOf<String, Any>(
        "offset" to 0,
        "number" to 100,
        "instructionsRequired" to false,
        "fillIngredients" to false,
        "addRecipeInformation" to false
    )
}