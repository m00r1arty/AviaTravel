package com.radzhabov.aviatravel.Model


data class Airports(
    val airports: List<Airport>
)

data class Airport(
    val country_code: String,
    val iata_code: String,
    val icao_code: String,
    val lat: Double,
    val lng: Double,
    val name: String
)