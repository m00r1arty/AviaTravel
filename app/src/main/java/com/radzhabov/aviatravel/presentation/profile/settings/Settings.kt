package com.radzhabov.aviatravel.presentation.profile.settings

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
import com.radzhabov.aviatravel.presentation.logo.AppLogo
import com.radzhabov.aviatravel.presentation.logo.WorldLogo
import com.radzhabov.aviatravel.presentation.theme.DarkBlue

@Composable
fun Settings() {
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
        SettingsCard()
    }
}


@Preview
@Composable
fun SettingsScreenPreview() {
    Settings()
}