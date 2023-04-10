package com.radzhabov.aviatravel.authscreens.register.presentation

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.radzhabov.aviatravel.presentation.logo.AppLogo
import com.radzhabov.aviatravel.presentation.logo.WorldLogo
import com.radzhabov.aviatravel.presentation.ui.theme.DarkBlue

@Composable
fun RegisterScreen(navController: NavController) {
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
                    .size(160.dp)
            ) {
                AppLogo()

                WorldLogo()
            }
        }
        RegisterCard(navController)
    }
}