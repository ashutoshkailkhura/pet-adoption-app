package com.egample.petadoptionapp.home

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Icon
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.egample.petadoptionapp.R

@Composable
fun NearByRow(modifier: Modifier = Modifier) {

}

@Composable
fun NearByElement() {
    Surface(
        modifier = Modifier
            .height(120.dp)
            .width(90.dp)
            .clip(RoundedCornerShape(16.dp))
    ) {
        Column(

        ) {
            Image(
                painter = painterResource(id = R.drawable.dog),
                contentDescription = ""
            )
            Row(
                horizontalArrangement = Arrangement.Center,
                verticalAlignment = Alignment.CenterVertically
            ) {
                Icon(
                    painter = painterResource(id = R.drawable.location_pin),
                    contentDescription = "",
                    modifier = Modifier.size(18.dp)
                )
                Spacer(modifier = Modifier.size(6.dp))
                Text(
                    text = "4KM away",
                    style = TextStyle(
                        fontWeight = FontWeight.Bold,
                    )
                )
            }

        }
    }
}


@Preview
@Composable
fun NearByRowPreview() {
    NearByRow()
}

@Preview
@Composable
fun NearByElementPreview() {
    NearByElement()
}

