package com.radzhabov.aviatravel.presentation.screen

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.text.ClickableText
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.radzhabov.aviatravel.presentation.ui.theme.DarkBlue

@Composable
fun AuthWithExternalService(
    text: String,
    imageResourceId: Int
) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 120.dp, end = 100.dp)
    ) {
        Image(
            colorFilter = ColorFilter.tint(DarkBlue),
            imageVector = ImageVector.vectorResource(id = imageResourceId),
            contentDescription = null,
        )

        ClickableText(
            text = AnnotatedString(text),
            style = TextStyle(
                color = Color.Black,
                fontSize = 12.sp,
            ),
            modifier = Modifier
                .padding(start = 10.dp),
            onClick = {  },
        )
    }
}