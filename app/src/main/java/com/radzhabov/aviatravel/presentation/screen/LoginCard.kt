package com.radzhabov.aviatravel.presentation.screen

import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.radzhabov.aviatravel.presentation.ui.theme.CalmBlue
import com.radzhabov.aviatravel.presentation.ui.theme.DarkBlue

@Composable
fun LoginCard(navController: NavController) {

    Card(
        backgroundColor = CalmBlue,
        modifier = Modifier.fillMaxSize(),
        shape = RoundedCornerShape(size = 30.dp),
    ) {
        Card(
            backgroundColor = Color.White,
            modifier = Modifier.padding(15.dp),
            shape = RoundedCornerShape(size = 25.dp),
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top,
                modifier = Modifier.padding(horizontal = 16.dp)
            ) {

                // Add your app logo here
                Text(
                    text = "LOGIN",
                    fontSize = 36.sp,
                    color = DarkBlue,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .padding(top = 30.dp, bottom = 15.dp)
                )

                // Add email text field
                OutlinedTextField(
                    value = "",
                    onValueChange = { /* TODO */ },
                    label = { Text(text = "Email") },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Email
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 16.dp)
                )

                // Add password text field
                OutlinedTextField(
                    value = "",
                    onValueChange = { /* TODO */ },
                    label = { Text(text = "Password") },
                    visualTransformation = PasswordVisualTransformation(),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Password
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 16.dp)
                )

                // Add login button
                Button(
                    onClick = { navController.navigate(Screens.Register.route) },
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = DarkBlue,
                        contentColor = Color.White
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(vertical = 16.dp)
                ) {
                    Text(text = "Sign in")
                }
            }
        }
    }
}