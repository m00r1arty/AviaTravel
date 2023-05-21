package com.radzhabov.aviatravel.data.model

data class User (
    var name: String,
    var email: String,
    var password: String
){
    companion object {
        fun defaultUser() = User(name = "", email = "", password = "")
    }
}