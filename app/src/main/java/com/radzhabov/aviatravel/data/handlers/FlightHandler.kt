package com.radzhabov.aviatravel.data.handlers

import com.google.firebase.crashlytics.buildtools.reloc.com.google.common.reflect.TypeToken
import com.radzhabov.aviatravel.data.dto.FlightsDTO
import com.radzhabov.aviatravel.data.mapper.mapFlights
import com.radzhabov.aviatravel.data.resource.ResourceHelper

// Airports handlers
val jsonFileStringFlights = ResourceHelper.getJsonDataFromAsset("/flights.json")
val listFlightsType = object : TypeToken<FlightsDTO>() {}.type
val flights: FlightsDTO = gson.fromJson(jsonFileStringFlights, listFlightsType)
val flightsList = flights.flights.map { dto ->
    dto.mapFlights()
}
