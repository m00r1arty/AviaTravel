package com.radzhabov.aviatravel.presentation.search

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
import com.radzhabov.aviatravel.data.db.AppDatabase
import com.radzhabov.aviatravel.presentation.logo.AppLogo
import com.radzhabov.aviatravel.presentation.logo.WorldLogo
import com.radzhabov.aviatravel.presentation.theme.DarkBlue

@Composable
fun Search(
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
        SearchCard(navController)
    }
}
