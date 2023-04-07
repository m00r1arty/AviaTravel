package com.radzhabov.aviatravel.presentation.screen

sealed class Screens(val route: String) {
    object Login: Screens("login")
    object Register: Screens("register")
}