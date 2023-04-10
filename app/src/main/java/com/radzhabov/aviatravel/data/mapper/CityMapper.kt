package com.radzhabov.aviatravel.data.mapper

import com.radzhabov.aviatravel.data.model.City
import com.radzhabov.aviatravel.data.dto.CityDTO

fun CityDTO.mapCity() = City(
    country_code = this.country_code,
    city_code = this.city_code,
    name = this.name
)
