package com.jszasznika.recipe.domain

sealed class SortingOption {
   object Empty:SortingOption()
   object MetaScore:SortingOption()
   object Popularity:SortingOption()
   object Healthiness:SortingOption()
   object Price:SortingOption()
   object Time:SortingOption()
   object Random:SortingOption()
   object MaxUsedIngredients:SortingOption()
   object MinMissingIngredients:SortingOption()
   object Alcohol:SortingOption()
   object Caffeine:SortingOption()
   object Copper:SortingOption()
   object Energy:SortingOption()
   object Calories:SortingOption()
   object Calcium:SortingOption()
   object Carbohydrates:SortingOption()
   object Carbs:SortingOption()
   object Choline:SortingOption()
   object Cholesterol:SortingOption()
   object TotalFat:SortingOption()
   object Fluoride:SortingOption()
   object TransFat:SortingOption()
   object SaturatedFat:SortingOption()
   object MonoUnSaturatedFat:SortingOption()
   object PolyUnSaturatedFat:SortingOption()
   object Fiber:SortingOption()
   object Folate:SortingOption()
   object FolicAcid:SortingOption()
   object Iodine:SortingOption()
   object Iron:SortingOption()
   object Magnesium:SortingOption()
   object Manganese:SortingOption()
   object Vitaminb3:SortingOption()
   object Niacin:SortingOption()
   object Vitaminb5:SortingOption()
   object PantothenicAcid:SortingOption()
   object Phosphorus:SortingOption()
   object Potassium:SortingOption()
   object Protein:SortingOption()
   object Vitaminb2:SortingOption()
   object Riboflavin:SortingOption()
   object Selenium:SortingOption()
   object Sodium:SortingOption()
   object Vitaminb1:SortingOption()
   object ThiAmin:SortingOption()
   object VitaminA:SortingOption()
   object VitaminB6:SortingOption()
   object VitaminB12:SortingOption()
   object VitaminC:SortingOption()
   object VitaminD:SortingOption()
   object VitaminE:SortingOption()
   object VitaminK:SortingOption()
   object Sugar:SortingOption()
   object Zinc:SortingOption()
}