package com.radzhabov.aviatravel.mapper

import com.radzhabov.aviatravel.data.Country
import com.radzhabov.aviatravel.data.model.CountryDTO

fun CountryDTO.mapCountry() = Country(
    name = this.name,
    code = this.code
)
