package com.radzhabov.aviatravel.data.handlers

import com.google.firebase.crashlytics.buildtools.reloc.com.google.common.reflect.TypeToken
import com.radzhabov.aviatravel.data.mapper.mapAirport
import com.radzhabov.aviatravel.data.dto.AirportsDTO
import com.radzhabov.aviatravel.data.resource.ResourceHelper

// Airports handlers
val jsonFileStringAirports = ResourceHelper.getJsonDataFromAsset("/airports.json")
val listAirportsType = object : TypeToken<AirportsDTO>() {}.type
val airports: AirportsDTO = gson.fromJson(jsonFileStringAirports, listAirportsType)
val airportsList = airports.airports.map { dto ->
    dto.mapAirport()
}