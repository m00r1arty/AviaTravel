package com.radzhabov.aviatravel.screens.presentation.logo

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
fun AppLogo() {
    Image(
        colorFilter = ColorFilter.tint(Color.White),
        imageVector = ImageVector.vectorResource(id = R.drawable.ic_app_logo),
        //painter = painterResource(id = R.drawable.ic_app_logo),
        contentDescription = null,
        modifier = Modifier
            .padding(start = 20.dp, top = 20.dp, end = 20.dp, bottom = 100.dp)
    )
}

@Preview(showBackground = true)
@Composable
fun AppLogoPreview() {
    AppLogo()
}