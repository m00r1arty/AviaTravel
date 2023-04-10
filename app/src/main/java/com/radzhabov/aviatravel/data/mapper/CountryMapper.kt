package com.radzhabov.aviatravel.data.mapper

import com.radzhabov.aviatravel.data.model.Country
import com.radzhabov.aviatravel.data.dto.CountryDTO

fun CountryDTO.mapCountry() = Country(
    name = this.name,
    code = this.code
)
