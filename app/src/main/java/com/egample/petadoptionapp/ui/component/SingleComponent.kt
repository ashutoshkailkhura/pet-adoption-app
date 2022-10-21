package com.egample.petadoptionapp.ui.component

import androidx.annotation.ColorRes
import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.egample.petadoptionapp.R

@Composable
fun BoxWithImage(
    @DrawableRes drawable: Int,
    @ColorRes backgroundColor: Int,
    onClick: () -> Unit
) {
    Box(
        modifier = Modifier
            .size(55.dp)
            .clip(RoundedCornerShape(16.dp))
            .background(
                color = colorResource(backgroundColor),
            )
            .clickable { onClick() },
    ) {
        Image(
            painter = painterResource(drawable),
            contentDescription = null,
            modifier = Modifier
                .align(Alignment.Center)
                .padding(8.dp)
        )
    }
}

@Preview
@Composable
fun BoxWithImagePreview() {
    BoxWithImage(
        drawable = R.drawable.user_avatar_one,
        backgroundColor = R.color.light_Red,
        onClick = {}
    )
}