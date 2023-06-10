package com.radzhabov.aviatravel.data.handlers

import com.google.firebase.crashlytics.buildtools.reloc.com.google.common.reflect.TypeToken
import com.radzhabov.aviatravel.data.dto.FlightsDTO
import com.radzhabov.aviatravel.data.mapper.mapFlights
import com.radzhabov.aviatravel.data.resource.ResourceHelper

class FlightHandler {
    // Airports handlers
    private val jsonFileStringFlights = ResourceHelper.getJsonDataFromAsset("/flights.json")
    private val listFlightsType = object : TypeToken<FlightsDTO>() {}.type
    private val flights: FlightsDTO = gson.fromJson(jsonFileStringFlights, listFlightsType)

    fun FlightsList() = flights.flights.map { dto ->
        dto.mapFlights()
    }

}