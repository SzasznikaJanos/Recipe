package com.jszasznika.recipe.domain

sealed class Intolerance {
   object Dairy:Intolerance()
   object Egg:Intolerance()
   object Gluten:Intolerance()
   object Grain:Intolerance()
   object Peanut:Intolerance()
   object Seafood:Intolerance()
   object Sesame:Intolerance()
   object Shellfish:Intolerance()
   object Soy:Intolerance()
   object Sulfite:Intolerance()
   object TreeNut:Intolerance()
   object Wheat:Intolerance()
}