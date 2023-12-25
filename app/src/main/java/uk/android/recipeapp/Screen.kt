package uk.android.recipeapp

sealed class Screen(val route: String) {
    data object RecipeScreen: Screen("recipe_screen")
    data object DetailScreen: Screen("detail_screen")
}