package com.radzhabov.aviatravel.data.mapper

import com.radzhabov.aviatravel.data.model.Airline
import com.radzhabov.aviatravel.data.dto.AirlineDTO

fun AirlineDTO.mapAirline() = Airline(
    name = this.name
)
