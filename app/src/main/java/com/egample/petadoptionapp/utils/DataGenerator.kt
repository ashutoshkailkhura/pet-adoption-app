package com.egample.petadoptionapp.utils

import com.egample.petadoptionapp.R
import com.egample.petadoptionapp.home.data.Category

object DataGenerator {

    fun petCategories(): List<Category> {
        return listOf(
            Category(1, "Dog", R.drawable.dog),
            Category(2, "Cat", R.drawable.cat),
            Category(3, "Fish", R.drawable.fish),
            Category(4, "Mouse", R.drawable.mouse),
            Category(5, "Bird", R.drawable.bird),
        )
    }
}