package com.radzhabov.aviatravel.data.dto

//class FlightsDTO : ArrayList<FlightDTO>()
//
//data class FlightDTO(
//    val airport: String,
//    val city: String,
//    val code: String,
//    val country: String
//)

data class FlightsDTO(
    val flights: List<FlightDTO>
)

data class FlightDTO(
    val airport: String,
    val city: String,
    val code: String,
    val country: String
)