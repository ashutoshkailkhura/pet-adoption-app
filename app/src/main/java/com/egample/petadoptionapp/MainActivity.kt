package com.egample.petadoptionapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.egample.petadoptionapp.home.HomeScreen
import com.egample.petadoptionapp.ui.theme.PetAdoptionAppTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            PetAdoptionAppTheme {
                HomeScreen()
            }
        }
    }
}