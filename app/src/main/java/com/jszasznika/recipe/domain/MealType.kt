package com.jszasznika.recipe.domain

sealed class MealType {
    object MainCourse :MealType()
    object SideDish :MealType()
    object Dessert :MealType()
    object Appetizer :MealType()
    object Salad :MealType()
    object Bread :MealType()
    object Breakfast :MealType()
    object Soup :MealType()
    object Beverage :MealType()
    object Sauce :MealType()
    object Marinade :MealType()
    object FingerFood :MealType()
    object Snack :MealType()
    object Drink :MealType()
}