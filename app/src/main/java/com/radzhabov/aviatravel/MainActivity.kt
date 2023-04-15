package com.radzhabov.aviatravel

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import com.radzhabov.aviatravel.presentation.*
import com.radzhabov.aviatravel.screens.presentation.navigation.AppNavigation
import com.radzhabov.aviatravel.screens.presentation.navigation.BottomNavBar

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppNavigation()
//            BottomNavBar()
        }
    }
}
