package com.radzhabov.aviatravel.presentation.profile

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.radzhabov.aviatravel.presentation.theme.DarkBlue

@Composable
fun ProfileCard() {
    Button(
        onClick = { },
        shape = RoundedCornerShape(16.dp),
        colors = ButtonDefaults.buttonColors(
            backgroundColor = DarkBlue,
            contentColor = Color.White
        ),
        modifier = Modifier
            .fillMaxWidth()
            .padding(start = 32.dp, end = 16.dp)

    ) {
        Text(
            text = "Sign in",
            modifier = Modifier
                .padding(top = 5.dp, bottom = 5.dp),
            fontSize = 18.sp
        )
    }
}
