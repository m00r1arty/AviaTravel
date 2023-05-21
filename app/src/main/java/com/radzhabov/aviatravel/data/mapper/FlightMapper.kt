package com.radzhabov.aviatravel.data.mapper

import com.radzhabov.aviatravel.data.dto.FlightDTO
import com.radzhabov.aviatravel.data.model.Flight
import com.radzhabov.aviatravel.data.entities.FlightEntity

fun FlightDTO.mapFlights() = Flight (
    airport = this.airport,
    city = this.city,
    code = this.code,
    country = this.country
)

fun Flight.mapFlightEntity() = FlightEntity (
    airport = this.airport,
    city = this.city,
    code = this.code,
    country = this.country
)
