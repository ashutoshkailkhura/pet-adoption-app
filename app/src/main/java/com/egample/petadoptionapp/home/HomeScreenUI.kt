package com.egample.petadoptionapp.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.egample.petadoptionapp.R

@Composable
fun HomeScreen() {
    Scaffold(topBar = { AppTopBar() }, bottomBar = {}) {

    }
}

@Composable
fun AppTopBar() {
    Surface(
        modifier = Modifier.padding(top = 8.dp, bottom = 8.dp)
    ) {
        Row(
            modifier = Modifier
                .fillMaxWidth()
                .height(55.dp),
            horizontalArrangement = Arrangement.SpaceAround,
            verticalAlignment = Alignment.CenterVertically
        ) {
            UserAvatar()
            UserLocationView()
            UserNotification()
        }
    }
}

@Composable
fun UserNotification() {
    Surface(
        shape = MaterialTheme.shapes.small,
        modifier = Modifier
            .size(55.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(
                color = colorResource(id = R.color.white),
            ),
    ) {
        Image(
            painter = painterResource(id = R.drawable.notification_off),
            contentDescription = null,
            modifier = Modifier.padding(12.dp)
        )
    }
}

@Composable
fun UserLocationView() {
    Row(
        horizontalArrangement = Arrangement.Center, verticalAlignment = Alignment.CenterVertically
    ) {
        Icon(
            painter = painterResource(id = R.drawable.location_pin),
            contentDescription = "",
            modifier = Modifier.size(18.dp)
        )
        Spacer(modifier = Modifier.size(6.dp))
        Text(
            text = "Raipur Dehradun",
            style = TextStyle(
                fontWeight = FontWeight.Bold,
            )
        )
        Icon(
            imageVector = Icons.Default.ArrowDropDown,
            contentDescription = "",
        )
    }
}

@Composable
fun UserAvatar() {
    Box(
        modifier = Modifier
            .size(55.dp)
            .clip(RoundedCornerShape(10.dp))
            .background(
                color = colorResource(id = R.color.light_Red),
            ),
    ) {
        Image(
            painter = painterResource(id = R.drawable.user_avatar_one),
            contentDescription = null,
            modifier = Modifier.padding(12.dp)
        )
    }
}


@Preview
@Composable
fun TopAppBarPreview() {
    AppTopBar()
}



