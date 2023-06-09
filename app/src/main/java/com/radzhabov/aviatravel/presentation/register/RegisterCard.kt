package com.radzhabov.aviatravel.presentation.register

import android.widget.Toast
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
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
import androidx.compose.material.icons.filled.Person
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
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.NavController
import androidx.navigation.compose.rememberNavController
import com.radzhabov.aviatravel.data.dao.UserDao
import com.radzhabov.aviatravel.data.db.AppDatabase
import com.radzhabov.aviatravel.data.repositories.UserRepository
import com.radzhabov.aviatravel.presentation.Screens
import com.radzhabov.aviatravel.presentation.theme.CalmBlue
import com.radzhabov.aviatravel.presentation.theme.DarkBlue
import com.radzhabov.aviatravel.presentation.theme.MiddleBlue
import com.radzhabov.aviatravel.presentation.theme.SapphireBlue
import com.radzhabov.aviatravel.presentation.viewmodels.AuthViewModel

//@SuppressLint("UnusedMaterialScaffoldPaddingParameter")
@Composable
fun RegisterCard(
    userDao: UserDao,
    navController: NavController
) {
    val context = LocalContext.current
    val userRepository = UserRepository(userDao)
    val registerViewModel: AuthViewModel = viewModel(factory = AuthViewModel.AuthViewModelFactory(userRepository))
    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    val errorMessage = remember { mutableStateOf("") }

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
                    text = "Create new account",
                    fontSize = 24.sp,
                    color = DarkBlue,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 30.dp, start = 16.dp)
                )

                Text(
                    text = "Be always with us",
                    fontSize = 14.sp,
                    color = MiddleBlue,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 30.dp, start = 16.dp)
                )

                OutlinedTextField(
                    value = name,
                    onValueChange = { name = it },
                    label = { Text(text = "Username") },
                    trailingIcon = { Icon(Icons.Filled.Person, contentDescription = "Username", tint = DarkBlue) },
                    placeholder = { Text(text = "Enter your username") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp, bottom = 13.dp),
                    shape = RoundedCornerShape(16.dp),
                    keyboardOptions = KeyboardOptions(
                        imeAction = ImeAction.Next,
                        keyboardType = KeyboardType.Text
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

                OutlinedTextField(
                    value = email,
                    onValueChange = { email = it },
                    label = { Text(text = "Email") },
                    trailingIcon = { Icon(Icons.Filled.Email, contentDescription = "Email", tint = DarkBlue) },
                    placeholder = { Text(text = "Enter your email") },
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp, bottom = 13.dp),
                    shape = RoundedCornerShape(16.dp),
                    keyboardOptions = KeyboardOptions(
                        imeAction = ImeAction.Next,
                        keyboardType = KeyboardType.Email
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
                        .padding(start = 18.dp, bottom = 18.dp)
                ) {
                    Text(
                        text = "Already have an account?",
                        fontSize = 10.sp,
                        color = Color.Black,
                        fontWeight = FontWeight.SemiBold,
                    )

                    ClickableText(
                        text = AnnotatedString("Log in"),
                        style = TextStyle(
                            color = SapphireBlue,
                            fontSize = 10.sp,
                        ),
                        modifier = Modifier
                            .padding(start = 10.dp),
                        onClick = { navController.navigate(Screens.Login.route) },
                    )
                }

                Button(
                    onClick = {
                        if(name.isEmpty() || email.isEmpty() || password.isEmpty()) {
                            errorMessage.value = "All fields are required"
                        } else {
                            registerViewModel.register(name, email, password)
                            Toast.makeText(
                                context,
                                "A new user is registered",
                                Toast.LENGTH_SHORT
                            ).show()
                            navController.navigate(Screens.Login.route)
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
                        text = "Sign up",
                        modifier = Modifier
                            .padding(top = 5.dp, bottom = 5.dp),
                        fontSize = 18.sp
                    )
                }

            }
        }
    }
}
