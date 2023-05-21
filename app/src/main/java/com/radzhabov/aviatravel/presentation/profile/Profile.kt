package com.radzhabov.aviatravel.presentation.profile

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

@Composable
fun Profile(padding: PaddingValues) {
    Box(Modifier.padding(padding)) {
        Text("profile page")
    }
}