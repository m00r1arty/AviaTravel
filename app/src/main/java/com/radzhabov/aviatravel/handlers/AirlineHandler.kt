package com.radzhabov.aviatravel.handlers

import com.google.firebase.crashlytics.buildtools.reloc.com.google.common.reflect.TypeToken
import com.radzhabov.aviatravel.mapper.mapAirline
import com.radzhabov.aviatravel.data.model.AirlinesDTO
import com.radzhabov.aviatravel.resource.ResourceHelper

// Airlines handlers
val jsonFileStringAirlines = ResourceHelper.getJsonDataFromAsset("/airlines.json")
val listAirlinesType = object : TypeToken<AirlinesDTO>() {}.type
val airlines: AirlinesDTO = gson.fromJson(jsonFileStringAirlines, listAirlinesType)
val airlinesList = airlines.airlines.map { dto ->
    dto.mapAirline()
}