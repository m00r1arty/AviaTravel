package com.radzhabov.aviatravel.presentation.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ImageBitmap
import androidx.compose.ui.unit.dp

@Composable
fun ProfileScreen(name: String, email: String, avatar: ImageBitmap) {
    Column(
        modifier = Modifier.fillMaxSize(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Image(
            bitmap = avatar,
            contentDescription = "Profile avatar",
            modifier = Modifier.size(120.dp)
        )
        Text(text = name, style = MaterialTheme.typography.h5)
        Text(text = email, style = MaterialTheme.typography.subtitle1)
    }
}