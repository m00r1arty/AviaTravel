package com.radzhabov.aviatravel.data.model

data class Flight(
    val airport: String,
    val city: String,
    val code: String,
    val country: String
) {
    companion object {
        fun defaultFlight() = Flight(airport = "", city = "", code = "", country = "")
    }
}