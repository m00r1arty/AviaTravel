package com.radzhabov.aviatravel.mapper

import com.radzhabov.aviatravel.data.Airport
import com.radzhabov.aviatravel.model.AirportDTO

fun AirportDTO.mapAirport() = Airport(
    country_code = this.country_code,
    name = this.name
)
