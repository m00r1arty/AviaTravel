package com.radzhabov.aviatravel.screens.presentation.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import com.radzhabov.aviatravel.screens.presentation.login.presentation.Login
import com.radzhabov.aviatravel.screens.presentation.register.presentation.Register
import com.radzhabov.aviatravel.screens.presentation.Screens
import com.radzhabov.aviatravel.screens.presentation.search.Search
import com.radzhabov.aviatravel.screens.presentation.home.Home
import com.radzhabov.aviatravel.screens.presentation.profile.Profile

@Composable
fun AppNavigation(){
    val navController = rememberNavController()
    val padding = PaddingValues()

    NavHost(
        navController = navController,
        startDestination = Screens.Login.route
    ){
        composable(route = Screens.Login.route){
            Login(navController)
        }

        composable(route = Screens.Register.route ){
            Register(navController)
        }

        composable(route = Screens.Home.route ){
            Home(padding)
        }

        composable(route = Screens.Search.route ){
            Search(padding)
        }

        composable(route = Screens.Profile.route ){
            Profile(padding)
        }

        composable(route = Screens.BottomNavBar.route ){
            BottomNavBar()
        }

    }
}