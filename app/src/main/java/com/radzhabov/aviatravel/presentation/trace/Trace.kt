package com.radzhabov.aviatravel.presentation.trace

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import com.radzhabov.aviatravel.presentation.ListCountry

@Composable
fun Trace(padding: PaddingValues) {
    Box(Modifier.padding(padding)) {
        ListCountry()
    }
}