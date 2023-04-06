package com.radzhabov.aviatravel.handlers

import com.google.firebase.crashlytics.buildtools.reloc.com.google.common.reflect.TypeToken
import com.radzhabov.aviatravel.mapper.mapAirport
import com.radzhabov.aviatravel.data.model.AirportsDTO
import com.radzhabov.aviatravel.resource.ResourceHelper

// Airports handlers
val jsonFileStringAirports = ResourceHelper.getJsonDataFromAsset("/airports.json")
val listAirportsType = object : TypeToken<AirportsDTO>() {}.type
val airports: AirportsDTO = gson.fromJson(jsonFileStringAirports, listAirportsType)
val airportsList = airports.airports.map { dto ->
    dto.mapAirport()
}