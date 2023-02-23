package com.radzhabov.aviatravel.Model

data class Cities(
    val cities: List<City>
)

data class City(
    val city_code: String,
    val country_code: String,
    val lat: Double,
    val lng: Double,
    val name: String
)
