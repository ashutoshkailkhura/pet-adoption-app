package com.egample.petadoptionapp.home

import androidx.annotation.StringRes
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.egample.petadoptionapp.R
import com.egample.petadoptionapp.ui.component.BoxWithImage
import com.egample.petadoptionapp.utils.DataGenerator

@Composable
fun HomeScreen() {
    Scaffold(
        topBar = { AppTopBar() },
        bottomBar = {})
    {
        HomeScreenMainContent(Modifier.padding(it))
    }
}

@Composable
fun HomeScreenMainContent(modifier: Modifier = Modifier) {
    Column(
        horizontalAlignment = Alignment.Start
    ) {
        Searchbar(Modifier.padding(8.dp))
        Spacer(modifier = Modifier.height(16.dp))
        HomeSection(title = R.string.categories) {
            PetCategoryRow(Modifier, DataGenerator.petCategories())
        }
        Spacer(Modifier.height(12.dp))
        HomeSection(title = R.string.nearby_pet) {
            NearByRow()
        }
        Spacer(Modifier.height(8.dp))
//        HomeSection(title = "Nearby pets") {
//            FavroiuteRow()
//        }
//        Spacer(Modifier.height(16.dp))
    }
}

@Composable
fun HomeSection(
    @StringRes title: Int,
    modifier: Modifier = Modifier,
    content: @Composable () -> Unit
) {
    Column(modifier) {
        Text(
            text = stringResource(title),
            style = TextStyle(
                fontWeight = FontWeight.SemiBold,
                fontSize = 22.sp,
                color = Color.Black
            ),
            modifier = Modifier
                .paddingFromBaseline(top = 40.dp, bottom = 8.dp)
                .padding(horizontal = 16.dp)

        )
        Spacer(modifier = Modifier.height(16.dp))
        content()
    }
}

@Composable
fun Searchbar(modifier: Modifier) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(55.dp)
            .padding(4.dp),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        TextField(
            value = "",
            onValueChange = {},
            leadingIcon = {
                Icon(
                    imageVector = Icons.Default.Search,
                    contentDescription = null
                )
            },
            colors = TextFieldDefaults.textFieldColors(
                backgroundColor = MaterialTheme.colors.surface
            ),
            placeholder = {
                Text(
                    text = "Search pet",
                )
            },
            modifier = modifier
                .weight(1f)
                .fillMaxHeight()
        )
        Spacer(modifier = Modifier.width(4.dp))
        BoxWithImage(
            drawable = R.drawable.filter,
            backgroundColor = R.color.light_Red,
        ) {

        }
    }
}

@Preview
@Composable
fun AppPreview() {
    HomeSection(title = R.string.categories) {

    }
}



