package com.radzhabov.aviatravel.presentation.navigation

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.runtime.Composable
import androidx.navigation.NavController
import androidx.navigation.NavHostController
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import com.radzhabov.aviatravel.presentation.Screens
import com.radzhabov.aviatravel.presentation.login.Login
import com.radzhabov.aviatravel.presentation.profile.Profile
import com.radzhabov.aviatravel.presentation.profile.settings.Settings
import com.radzhabov.aviatravel.presentation.register.Register
import com.radzhabov.aviatravel.presentation.search.Search
import com.radzhabov.aviatravel.presentation.trace.Trace

@Composable
fun AppNavigation(
    navController: NavController
){
    val padding = PaddingValues()

    NavHost(
        navController = navController as NavHostController,
        startDestination = Screens.Login.route
    ){
        composable(route = Screens.Login.route){ Login(navController) }

        composable(route = Screens.Register.route ){ Register(navController) }

        composable(route = Screens.Search.route ){ Search(navController) }

        composable(route = Screens.Trace.route ){ Trace() }

        composable(route = Screens.Profile.route ){  Profile(padding, navController) }

        composable(route = Screens.BottomNavBar.route ){ BottomNavBar(navController) }

        composable(route = Screens.Settings.route ){ Settings() }

    }
}