package com.radzhabov.aviatravel.authscreens.login.presentation

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.radzhabov.aviatravel.R
import com.radzhabov.aviatravel.authscreens.Screens
import com.radzhabov.aviatravel.presentation.ui.theme.*

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
                modifier = Modifier.padding(end = 16.dp)
            ) {

                Text(
                    text = "Welcome back",
                    fontSize = 24.sp,
                    color = DarkBlue,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 30.dp, start = 16.dp)
                )

                Text(
                    text = "Hello again, you’ve been missed!",
                    fontSize = 14.sp,
                    color = MiddleBlue,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 30.dp, start = 16.dp)
                )

                OutlinedTextField(
                    value = "",
                    shape = RoundedCornerShape(11.dp),
                    onValueChange = { /* TODO */ },
                    label = { Text(text = "Email") },
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Email
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp, bottom = 13.dp)
                )

                Image(
                    colorFilter = ColorFilter.tint(MiddleGray),
                    imageVector = ImageVector.vectorResource(id = R.drawable.ic_line),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(start = 16.dp, bottom = 15.dp)
                        .fillMaxWidth()
                )

                OutlinedTextField(
                    value = "",
                    shape = RoundedCornerShape(11.dp),
                    onValueChange = { /* TODO */ },
                    label = { Text(text = "Password") },
                    visualTransformation = PasswordVisualTransformation(),
                    keyboardOptions = KeyboardOptions(
                        keyboardType = KeyboardType.Password
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp, bottom = 16.dp)
                )

                Image(
                    colorFilter = ColorFilter.tint(MiddleGray),
                    imageVector = ImageVector.vectorResource(id = R.drawable.ic_line),
                    contentDescription = null,
                    modifier = Modifier
                        .padding(start = 16.dp, bottom = 15.dp)
                        .fillMaxWidth()
                )

                Row(
                    horizontalArrangement = Arrangement.Start,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 18.dp)
                ) {
                    Text(
                        text = "Don't have an account?",
                        fontSize = 10.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.SemiBold,
                    )
                    ClickableText(
                        text = AnnotatedString("Sign up"),
                        style = TextStyle(
                            color = SapphireBlue,
                            fontSize = 10.sp,
                        ),
                        modifier = Modifier
                            .fillMaxWidth()
                            .padding(start = 10.dp),
                        onClick = { navController.navigate(Screens.Register.route) },
                    )
                }

                Spacer(modifier = Modifier.padding(20.dp))

                LoginWithExternalService(
                    text = "Sign in with Google",
                    imageResourceId = R.drawable.ic_google
                )

                Spacer(modifier = Modifier.padding(10.dp))

                LoginWithExternalService(
                    text = "Sign in with Apple",
                    imageResourceId = R.drawable.ic_apple
                )

                Spacer(modifier = Modifier.padding(15.dp))

                Button(
                    onClick = {  },
                    shape = RoundedCornerShape(11.dp),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = DarkBlue,
                        contentColor = Color.White
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp)
                ) {
                    Text(
                        text = "Sign in",
                        fontSize = 18.sp
                    )
                }
            }
        }
    }
}