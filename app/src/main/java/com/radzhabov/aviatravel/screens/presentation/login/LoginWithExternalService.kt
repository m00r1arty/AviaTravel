package com.radzhabov.aviatravel.screens.presentation.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.size
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.unit.dp
import com.radzhabov.aviatravel.screens.presentation.ui.theme.DarkBlue

@Composable
fun LoginWithExternalService(
    imageResourceId: Int
) {
    Image(
        modifier = Modifier
            .size(width = 34.dp, height = 35.dp)
            .clickable {  },
        colorFilter = ColorFilter.tint(DarkBlue),
        imageVector = ImageVector.vectorResource(id = imageResourceId),
        contentDescription = null,
    )
}