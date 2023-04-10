package com.radzhabov.aviatravel.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import com.radzhabov.aviatravel.authscreens.login.presentation.LoginScreen
import com.radzhabov.aviatravel.authscreens.register.presentation.RegisterScreen
import com.radzhabov.aviatravel.authscreens.Screens


@Composable
fun AppNavigation(){
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screens.Login.route
    ){
        composable(route = Screens.Login.route){
            LoginScreen(navController)
        }

        composable(route = Screens.Register.route ){
            RegisterScreen(navController)
        }
    }
}