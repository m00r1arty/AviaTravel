package com.radzhabov.aviatravel.presentation.login

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.foundation.text.ClickableText
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.TextFieldDefaults
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Email
import androidx.compose.material.icons.filled.Lock
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.input.ImeAction
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import com.radzhabov.aviatravel.data.dao.FlightDao
import com.radzhabov.aviatravel.data.dao.UserDao
import com.radzhabov.aviatravel.data.handlers.flightsList
import com.radzhabov.aviatravel.data.repositories.FlightRepository
import com.radzhabov.aviatravel.data.repositories.UserRepository
import com.radzhabov.aviatravel.presentation.Screens
import com.radzhabov.aviatravel.presentation.theme.CalmBlue
import com.radzhabov.aviatravel.presentation.theme.DarkBlue
import com.radzhabov.aviatravel.presentation.theme.MiddleBlue
import com.radzhabov.aviatravel.presentation.theme.SapphireBlue
import com.radzhabov.aviatravel.presentation.viewmodels.AuthViewModel
import com.radzhabov.aviatravel.presentation.viewmodels.MainViewModel
import kotlinx.coroutines.runBlocking

@Composable
fun LoginCard(
    userDao: UserDao,
    flightDao: FlightDao,
    navController: NavController
) {
    val context = LocalContext.current
    val userRepository = UserRepository(userDao)
    val flightRepository = FlightRepository(flightDao )
    val loginViewModel: AuthViewModel =
        viewModel(factory = AuthViewModel.AuthViewModelFactory(userRepository))
    val mainViewModel: MainViewModel =
        viewModel(factory = MainViewModel.MainViewModelFactory(flightRepository))
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
                    trailingIcon = {
                        Icon(
                            Icons.Filled.Email,
                            contentDescription = "Email",
                            tint = DarkBlue
                        )
                    },
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
                    trailingIcon = {
                        Icon(
                            Icons.Filled.Lock,
                            contentDescription = "Password",
                            tint = DarkBlue
                        )
                    },
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
                    onClick = {
                        if (email.isEmpty() || password.isEmpty()) {
                            Toast.makeText(
                                context,
                                "All fields are required",
                                Toast.LENGTH_SHORT
                            ).show()
                        } else {
                            runBlocking {
                                val isChecked = loginViewModel.login(email, password)
                                if (isChecked) {
                                    navController.navigate(Screens.BottomNavBar.route) {
                                        launchSingleTop = true
                                        restoreState = true
                                    }
                                    Toast.makeText(
                                        context,
                                        "Log in $email",
                                        Toast.LENGTH_SHORT
                                    ).show()
                                } else {
                                    Toast.makeText(
                                        context,
                                        "Login failed!",
                                        Toast.LENGTH_SHORT
                                    ).show()
                                }
                                mainViewModel.loadFlights(flightsList)
                            }
                        }
                    },
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
        }
    }
}
