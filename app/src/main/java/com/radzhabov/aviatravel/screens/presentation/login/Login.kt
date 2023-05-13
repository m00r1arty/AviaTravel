package com.radzhabov.aviatravel.screens.presentation.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.radzhabov.aviatravel.screens.presentation.logo.AppLogo
import com.radzhabov.aviatravel.screens.presentation.logo.WorldLogo
import com.radzhabov.aviatravel.screens.presentation.ui.theme.DarkBlue

@Composable
fun Login(navController: NavController) {
    Column(
        Modifier.background(DarkBlue)
    ) {
        Card(
            backgroundColor = DarkBlue,
            modifier = Modifier
                .fillMaxWidth(),
        ) {
            Row(
                modifier = Modifier
                    .size(150.dp)
            ) {
                AppLogo()

                WorldLogo()
            }
        }
        LoginCard(navController)
    }
}

@Preview(showBackground = true)
@Composable
fun LoginPreview () {
    val navController = rememberNavController()
    Login(navController)
}