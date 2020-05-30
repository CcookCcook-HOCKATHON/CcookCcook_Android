package com.example.ccookccook

import com.example.ccookccook.RecipeData

internal class RecipeDummy {
    fun recipeList() : List<RecipeData>{
        return listOf(
            RecipeData(
                img_src = "https://theweekly.co.kr/wp-content/uploads/2018/12/2555-5-1b.jpg",
                txt_recipe = "중국 음식"
            ),
            RecipeData(
                img_src = "https://theweekly.co.kr/wp-content/uploads/2018/12/2555-5-1b.jpg",
                txt_recipe = "한국 음식"
            ),
            RecipeData(
                img_src = "https://theweekly.co.kr/wp-content/uploads/2018/12/2555-5-1b.jpg",
                txt_recipe = "미국 음식"
            ),
            RecipeData(
                img_src = "https://theweekly.co.kr/wp-content/uploads/2018/12/2555-5-1b.jpg",
                txt_recipe = "국 음식"
            ),
            RecipeData(
                img_src = "https://theweekly.co.kr/wp-content/uploads/2018/12/2555-5-1b.jpg",
                txt_recipe = "밥국 음식"
            )
        )
    }
}