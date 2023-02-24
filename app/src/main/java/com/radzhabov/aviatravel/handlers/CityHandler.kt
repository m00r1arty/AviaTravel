package com.radzhabov.aviatravel.handlers

import com.google.firebase.crashlytics.buildtools.reloc.com.google.common.reflect.TypeToken
import com.radzhabov.aviatravel.mapper.mapCity
import com.radzhabov.aviatravel.model.CitiesDTO
import com.radzhabov.aviatravel.resource.ResourceHelper

// Cities handlers
val jsonFileStringCities = ResourceHelper.getJsonDataFromAsset("/cities.json")
val listCitiesType = object : TypeToken<CitiesDTO>() {}.type
val cities: CitiesDTO = gson.fromJson(jsonFileStringCities, listCitiesType)
val citiesList = cities.cities.map { dto ->
    dto.mapCity()
}