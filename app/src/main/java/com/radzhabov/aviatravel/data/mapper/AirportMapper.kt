package com.radzhabov.aviatravel.data.mapper

import com.radzhabov.aviatravel.data.model.Airport
import com.radzhabov.aviatravel.data.dto.AirportDTO

fun AirportDTO.mapAirport() = Airport(
    country_code = this.country_code,
    name = this.name
)
