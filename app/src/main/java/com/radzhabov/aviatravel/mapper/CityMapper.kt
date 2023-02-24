package com.radzhabov.aviatravel.mapper

import com.radzhabov.aviatravel.data.City
import com.radzhabov.aviatravel.model.CityDTO

fun CityDTO.mapCity() = City(
    country_code = this.country_code,
    city_code = this.city_code,
    name = this.name
)
