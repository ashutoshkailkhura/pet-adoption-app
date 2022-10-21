package com.egample.petadoptionapp.home

import androidx.annotation.DrawableRes
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.foundation.lazy.items
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.egample.petadoptionapp.R
import com.egample.petadoptionapp.home.data.Category
import com.egample.petadoptionapp.ui.component.BoxWithImage
import com.egample.petadoptionapp.utils.DataGenerator

@Composable
fun PetCategoryRow(modifier: Modifier = Modifier, categories: List<Category>) {

    var selectedCategory by remember { mutableStateOf(1) }

    LazyRow(
        modifier = modifier,
        horizontalArrangement = Arrangement.spacedBy(16.dp),
        contentPadding = PaddingValues(horizontal = 16.dp),
    ) {
        items(categories) { category ->
            PetCategoryElement(
                selected = (selectedCategory == category.id),
                image = category.image,
                name = category.name,
                onClick = {
                    selectedCategory = category.id
                }
            )
        }
    }
}


@Composable
fun PetCategoryElement(
    selected: Boolean,
    @DrawableRes image: Int,
    name: String,
    onClick: () -> Unit
) {
    Surface(
        modifier = Modifier
            .height(65.dp)
            .width(130.dp)
            .clip(RoundedCornerShape(16.dp))
            .clickable { onClick() },
    ) {
        Row(
            verticalAlignment = Alignment.CenterVertically,
            horizontalArrangement = Arrangement.SpaceEvenly,
            modifier = Modifier
                .fillMaxSize()
                .background(
                    color = colorResource(if (selected) R.color.dark_red else R.color.white),
                )
        ) {
            BoxWithImage(
                drawable = image,
                backgroundColor = if (selected) R.color.white else R.color.light_Red,
                onClick = {}
            )
            Text(
                text = name,
                style = TextStyle(
                    fontWeight = FontWeight.SemiBold,
                    color = if (selected) Color.White else Color.Black,
                ),
            )
        }
    }
}

@Preview
@Composable
fun PetCategoryElementSelectedPreview() {
    PetCategoryElement(
        selected = true,
        image = R.drawable.cat,
        name = "Dogs",
        onClick = {}
    )
}

@Preview
@Composable
fun PetCategoryElementNotSelectedPreview() {
    PetCategoryElement(
        selected = false,
        image = R.drawable.fish,
        name = "Fish",
        onClick = {}
    )
}

@Preview
@Composable
fun PetCategoryElementRowPreview() {
    PetCategoryRow(
        Modifier,
        DataGenerator.petCategories()
    )
}