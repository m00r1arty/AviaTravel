package com.radzhabov.aviatravel.Model

data class Airlines(
    val airlines: List<Airline>
)

data class Airline(
    val iata_code: String,
    val icao_code: String,
    val name: String
)