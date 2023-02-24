package com.radzhabov.aviatravel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import com.google.firebase.crashlytics.buildtools.reloc.com.google.common.reflect.TypeToken
import com.google.gson.Gson
import com.radzhabov.aviatravel.mapper.mapAirline
import com.radzhabov.aviatravel.mapper.mapAirport
import com.radzhabov.aviatravel.mapper.mapCity
import com.radzhabov.aviatravel.mapper.mapCountry
import com.radzhabov.aviatravel.model.*
import com.radzhabov.aviatravel.resource.ResourceHelper


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val gson = Gson()

        // Counties handlers
        val jsonFileStringCounties = ResourceHelper.getJsonDataFromAsset("/counties.json")
        val listCountiesType = object : TypeToken<CountriesDTO>() {}.type
        val countries: CountriesDTO = gson.fromJson(jsonFileStringCounties, listCountiesType)
        val countriesList = countries.countries.map { dto ->
            dto.mapCountry()
        }

        // Cities handlers
        val jsonFileStringCities = ResourceHelper.getJsonDataFromAsset("/cities.json")
        val listCitiesType = object : TypeToken<CitiesDTO>() {}.type
        val cities: CitiesDTO = gson.fromJson(jsonFileStringCities, listCitiesType)
        val citiesList = cities.cities.map { dto ->
            dto.mapCity()
        }


        // Airlines handlers
        val jsonFileStringAirlines = ResourceHelper.getJsonDataFromAsset("/airlines.json")
        val listAirlinesType = object : TypeToken<AirlinesDTO>() {}.type
        val airlines: AirlinesDTO = gson.fromJson(jsonFileStringAirlines, listAirlinesType)
        val airlinesList = airlines.airlines.map { dto ->
            dto.mapAirline()
        }

        // Airports handlers
        val jsonFileStringAirports = ResourceHelper.getJsonDataFromAsset("/airports.json")
        val listAirportsType = object : TypeToken<AirportsDTO>() {}.type
        val airports: AirportsDTO = gson.fromJson(jsonFileStringAirports, listAirportsType)
        val airportsList = airports.airports.map { dto ->
            dto.mapAirport()
        }

        setContent {

        }
    }
}
