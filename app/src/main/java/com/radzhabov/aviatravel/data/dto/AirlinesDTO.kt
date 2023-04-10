package com.radzhabov.aviatravel.data.dto

data class AirlinesDTO(
    val airlines: List<AirlineDTO>
)

data class AirlineDTO(
    val iata_code: String,
    val icao_code: String,
    val name: String
)