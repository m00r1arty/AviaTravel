package com.radzhabov.aviatravel.presentation

sealed class Screens(val route: String) {
    object Login: Screens("login")
    object Register: Screens("register")
    object Home: Screens("home")
    object Search: Screens("search")
    object Trace: Screens("trace")
    object Profile: Screens("profile")
    object Settings: Screens("settings")
    object BottomNavBar: Screens("bottom")
}