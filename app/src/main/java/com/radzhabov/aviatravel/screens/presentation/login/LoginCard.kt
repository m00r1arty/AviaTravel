package com.radzhabov.aviatravel.screens.presentation.login

import androidx.compose.foundation.Image
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.runtime.*
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.ColorFilter
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.res.vectorResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.radzhabov.aviatravel.R
import com.radzhabov.aviatravel.screens.presentation.Screens
import com.radzhabov.aviatravel.screens.presentation.ui.theme.*

@Composable
fun LoginCard(navController: NavController) {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }

    Card(
        backgroundColor = CalmBlue,
        modifier = Modifier.fillMaxSize(),
        shape = RoundedCornerShape(size = 20.dp),
    ) {
        Card(
            backgroundColor = Color.White,
            modifier = Modifier
                .padding(15.dp)
                .shadow(
                    elevation = 8.dp,
                    ambientColor = CalmBlue,
                    spotColor = DarkBlue
                ),
            shape = RoundedCornerShape(size = 15.dp),
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
                    value = email,
                    onValueChange = { email = it },
                    label = { Text(text = "Email") },
                    trailingIcon = { Icon(Icons.Filled.Email, contentDescription = "Email", tint = DarkBlue) },
                    placeholder = { Text(text = "Enter your email") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp, bottom = 13.dp),
//                    shape = CutCornerShape(topStart = 0.dp, topEnd = 0.dp, bottomStart = 8.dp, bottomEnd = 8.dp),
                    shape = RoundedCornerShape(16.dp),
                    keyboardOptions = KeyboardOptions(
                        imeAction = ImeAction.Next,
                        keyboardType = KeyboardType.Email
                    ),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        textColor = DarkBlue,
                        cursorColor = Color.Blue,
                        leadingIconColor = Color.Gray,
                        trailingIconColor = Color.Gray,
                        focusedBorderColor = Color.Blue,
                        unfocusedBorderColor = Color.Gray,
                        errorBorderColor = Color.Red,
                    )
                )

                OutlinedTextField(
                    value = password,
                    onValueChange = { password = it },
                    label = { Text(text = "Password") },
                    trailingIcon = { Icon(Icons.Filled.Lock, contentDescription = "Password", tint = DarkBlue) },
                    placeholder = { Text(text = "Enter your password") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp, bottom = 13.dp),
                    shape = RoundedCornerShape(16.dp),
                    visualTransformation = PasswordVisualTransformation(),
                    keyboardOptions = KeyboardOptions(
                        imeAction = ImeAction.Done,
                        keyboardType = KeyboardType.Password
                    ),
                    colors = TextFieldDefaults.outlinedTextFieldColors(
                        textColor = Color.Black,
                        cursorColor = Color.Blue,
                        leadingIconColor = Color.Gray,
                        trailingIconColor = Color.Gray,
                        focusedBorderColor = Color.Blue,
                        unfocusedBorderColor = Color.Gray,
                        errorBorderColor = Color.Red,
                    )
                )

                Row(
                    horizontalArrangement = Arrangement.End,
                    modifier = Modifier
                        .fillMaxWidth()
                        .align(Alignment.End)
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
                            .padding(start = 10.dp),
                        onClick = { navController.navigate(Screens.Register.route) },
                    )
                }

                Spacer(modifier = Modifier.padding(20.dp))

                Button(
                    onClick = { navController.navigate(Screens.BottomNavBar.route) {
                        launchSingleTop = true
                        restoreState = true
                    }},
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

                Text(
                    text = "Or sign in with",
                    textAlign = TextAlign.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 15.dp, bottom = 15.dp),
                    fontSize = 10.sp,
                    color = MiddleGray,
                    fontWeight = FontWeight.SemiBold,
                )

                Row(
                    horizontalArrangement = Arrangement.Center,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 10.dp),
                ) {
                    Image(
                        modifier = Modifier
                            .padding(vertical = 3.dp)
                            .size(width = 30.dp, height = 32.dp)
                            .clickable {  },
                        colorFilter = ColorFilter.tint(DarkBlue),
                        imageVector = ImageVector.vectorResource(id = R.drawable.ic_google),
                        contentDescription = null,
                    )

                    Spacer(modifier = Modifier.padding(10.dp))

                    Image(
                        modifier = Modifier
                            .size(width = 34.dp, height = 35.dp)
                            .clickable {  },
                        colorFilter = ColorFilter.tint(DarkBlue),
                        imageVector = ImageVector.vectorResource(id = R.drawable.ic_apple),
                        contentDescription = null,
                    )
                }
            }
        }
    }
}

@Preview(showBackground = true)
@Composable
fun LoginCardPreview () {
    val navController = rememberNavController()
    LoginCard(navController)
}