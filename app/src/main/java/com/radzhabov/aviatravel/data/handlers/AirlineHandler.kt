package com.radzhabov.aviatravel.data.handlers

import com.google.firebase.crashlytics.buildtools.reloc.com.google.common.reflect.TypeToken
import com.radzhabov.aviatravel.data.mapper.mapAirline
import com.radzhabov.aviatravel.data.dto.AirlinesDTO
import com.radzhabov.aviatravel.data.resource.ResourceHelper

// Airlines handlers
val jsonFileStringAirlines = ResourceHelper.getJsonDataFromAsset("/airlines.json")
val listAirlinesType = object : TypeToken<AirlinesDTO>() {}.type
val airlines: AirlinesDTO = gson.fromJson(jsonFileStringAirlines, listAirlinesType)
val airlinesList = airlines.airlines.map { dto ->
    dto.mapAirline()
}