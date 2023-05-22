package com.radzhabov.aviatravel.presentation.trace

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.radzhabov.aviatravel.presentation.theme.DarkBlue

@Composable
fun Trace() {
    val url = "https://www.flightradar24.com/"

    Column(
        Modifier
            .background(DarkBlue)
            .padding(bottom = 56.dp)
    ) {
        TraceCard(url = url)

        Spacer(modifier = Modifier.padding(100.dp))

    }
}