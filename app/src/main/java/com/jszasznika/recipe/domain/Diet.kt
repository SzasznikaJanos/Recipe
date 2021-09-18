package com.jszasznika.recipe.domain

import com.jszasznika.recipe.R
import com.jszasznika.recipe.ui.RecipeApplication

sealed class Diet(val dietName: String, val description: String, val imageRes: Int = -1) {

    companion object {
        fun getString(id: Int): String = RecipeApplication.instance?.getStringResource(id) ?: ""

        val values
            get() = listOf(
                GlutenFree,
                Ketogenic,
                Vegetarian,
                LactoVegetarian,
                OvoVegetarian,
                Vegan,
                Paleo,
                Pescetarian,
                Primal,
                Whole30
            )
    }


    object GlutenFree : Diet(
        getString(R.string.diet_gluten_free_name),
        getString(R.string.diet_gluten_free_description),
        R.drawable.ic_diet_gluten_free
    )

    object Ketogenic : Diet(
        getString(R.string.diet_ketogenic_name),
        getString(R.string.diet_ketogenic_description),
        R.drawable.ic_diet_keto
    )

    object Vegetarian : Diet(
        getString(R.string.diet_vegetarian_name),
        getString(R.string.diet_vegetarian_description),
        R.drawable.ic_diet_vegetarian
    )

    object LactoVegetarian : Diet(
        getString(R.string.diet_lacto_vegetarian_name),
        getString(R.string.diet_lacto_vegetarian_description),
        R.drawable.ic_diet_lacto_vegetarian
    )

    object OvoVegetarian : Diet(
        getString(R.string.diet_ovo_vegetarian_name),
        getString(R.string.diet_ovo_vegetarian_description),
        R.drawable.ic_diet_ovo_vegetarian
    )

    object Vegan : Diet(
        getString(R.string.diet_vegan_name),
        getString(R.string.diet_vegan_description),
        R.drawable.ic_diet_vegan
    )


    object Pescetarian : Diet(
        getString(R.string.diet_pescetarian_name),
        getString(R.string.diet_pescetarian_description),
        R.drawable.ic_diet_pescetarian
    )


    object Paleo : Diet(
        getString(R.string.diet_paleo_name),
        getString(R.string.diet_paleo_description),
        R.drawable.ic_diet_paleo
    )

    object Primal : Diet(
        getString(R.string.diet_primal_name),
        getString(R.string.diet_primal_description),
        R.drawable.ic_diet_primal
    )

    object Whole30 : Diet(
        getString(R.string.diet_whole30_name),
        getString(R.string.diet_whole30_description),
        R.drawable.ic_diet_whole30
    )
}