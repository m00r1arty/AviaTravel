package com.radzhabov.aviatravel.data.handlers

import com.google.firebase.crashlytics.buildtools.reloc.com.google.common.reflect.TypeToken
import com.google.gson.Gson
import com.radzhabov.aviatravel.data.mapper.mapCountry
import com.radzhabov.aviatravel.data.dto.CountriesDTO
import com.radzhabov.aviatravel.data.resource.ResourceHelper

val gson = Gson()

// Countries handlers
val jsonFileStringCounties = ResourceHelper.getJsonDataFromAsset("/counties.json")
val listCountriesType = object : TypeToken<CountriesDTO>() {}.type
val countries: CountriesDTO = gson.fromJson(jsonFileStringCounties, listCountriesType)
val countriesList = countries.countries.map { dto ->
    dto.mapCountry()
}
