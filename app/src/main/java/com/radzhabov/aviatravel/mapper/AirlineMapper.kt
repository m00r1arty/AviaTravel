package com.radzhabov.aviatravel.mapper

import com.radzhabov.aviatravel.data.Airline
import com.radzhabov.aviatravel.model.AirlineDTO

fun AirlineDTO.mapAirline() = Airline(
    name = this.name
)
