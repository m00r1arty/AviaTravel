package com.radzhabov.aviatravel.screens.data.model

data class User (
    var name: String,
    var email: String,
    var password: String
){
    companion object {
        fun defaultUser() = User(name = "", email = "", password = "")
    }
}