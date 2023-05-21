package com.radzhabov.aviatravel.presentation.logo

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.radzhabov.aviatravel.R

@Composable
fun WorldLogo() {
    Image(
        colorFilter = ColorFilter.tint(Color.White),
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_world),
        contentDescription = null,
        modifier = Modifier
            .padding(5.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun WorldLogoPreview() {
    WorldLogo()
}