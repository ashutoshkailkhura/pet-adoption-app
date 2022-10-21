package com.egample.petadoptionapp.home

import androidx.compose.foundation.layout.*
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowDropDown
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import com.egample.petadoptionapp.R
import com.egample.petadoptionapp.ui.component.BoxWithImage


@Composable
fun AppTopBar() {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .height(55.dp)
            .padding(4.dp),
        horizontalArrangement = Arrangement.SpaceAround,
        verticalAlignment = Alignment.CenterVertically
    ) {
        UserAvatar()
        UserLocationView()
        UserNotification()
    }

}

@Composable
fun UserNotification() {
    BoxWithImage(
        drawable = R.drawable.notification_off,
        backgroundColor = R.color.white,
    ) {

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
    BoxWithImage(
        drawable = R.drawable.user_avatar_one,
        backgroundColor = R.color.light_Red,
    ) {

    }
}

