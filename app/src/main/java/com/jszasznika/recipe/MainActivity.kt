package com.jszasznika.recipe

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.ExperimentalFoundationApi
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import com.jszasznika.recipe.repository.SpoonacularService
import com.jszasznika.recipe.ui.RecipeApp
import com.jszasznika.recipe.ui.theme.RecipeTheme

class MainActivity : ComponentActivity() {
    @OptIn(ExperimentalFoundationApi::class)
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)


        setContent {
                RecipeTheme {
                    RecipeApp()
                }
        }
    }
}

@OptIn(ExperimentalFoundationApi::class)
@Preview(showBackground = true)
@Composable
fun DefaultPreview() {
    RecipeTheme {
        RecipeApp()
    }
}