package com.radzhabov.aviatravel.authscreens

sealed class Screens(val route: String) {
    object Login: Screens("login")
    object Register: Screens("register")
}