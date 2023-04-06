package com.radzhabov.aviatravel

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.radzhabov.aviatravel.presentation.*
import com.radzhabov.aviatravel.presentation.screen.LoginCard
import com.radzhabov.aviatravel.presentation.logo.AppLogo
import com.radzhabov.aviatravel.presentation.logo.WorldLogo
import com.radzhabov.aviatravel.presentation.navigation.AppNavigation
//import com.radzhabov.aviatravel.presentation.navigation.MyApp
import com.radzhabov.aviatravel.presentation.ui.theme.DarkBlue

class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppNavigation()
            // MyApp()
        }
    }
}
