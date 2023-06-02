package com.radzhabov.aviatravel.presentation.login

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.size
import androidx.compose.material.Card
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.radzhabov.aviatravel.data.db.AppDatabase
import com.radzhabov.aviatravel.presentation.logo.AppLogo
import com.radzhabov.aviatravel.presentation.logo.WorldLogo
import com.radzhabov.aviatravel.presentation.theme.DarkBlue

@Composable
fun Login(
    navController: NavController
) {
    val context = LocalContext.current
    val db = remember { AppDatabase.getInstance(context) }

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
        LoginCard(db.userDao(), db.flightDao(), navController)
    }
}

@Preview(showBackground = true)
@Composable
fun LoginPreview () {
    val navController = rememberNavController()
    Login(navController)
}