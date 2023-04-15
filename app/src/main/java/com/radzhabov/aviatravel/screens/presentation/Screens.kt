package com.radzhabov.aviatravel.screens.presentation

sealed class Screens(val route: String) {
    object Login: Screens("login")
    object Register: Screens("register")
    object Home: Screens("home")
    object Search: Screens("search")
    object Profile: Screens("profile")
    object BottomNavBar: Screens("bottom")
}