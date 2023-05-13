package com.radzhabov.aviatravel.screens.presentation.register

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
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController
import com.radzhabov.aviatravel.screens.data.db.AppDatabase
import com.radzhabov.aviatravel.screens.presentation.logo.AppLogo
import com.radzhabov.aviatravel.screens.presentation.logo.WorldLogo
import com.radzhabov.aviatravel.screens.presentation.ui.theme.DarkBlue
import dagger.hilt.android.AndroidEntryPoint


@Composable
fun Register(
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
                    .size(160.dp)
            ) {
                AppLogo()

                WorldLogo()
            }
        }
        RegisterCard(db.userDao(), navController)
    }
}
