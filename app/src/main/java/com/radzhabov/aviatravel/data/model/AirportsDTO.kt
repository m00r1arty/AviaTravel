package com.radzhabov.aviatravel.data.model

data class AirportsDTO(
    val airports: List<AirportDTO>
)

data class AirportDTO(
    val country_code: String,
    val iata_code: String,
    val icao_code: String,
    val lat: Double,
    val lng: Double,
    val name: String
)
