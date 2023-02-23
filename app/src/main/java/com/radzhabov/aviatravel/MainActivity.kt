package com.radzhabov.aviatravel

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.google.firebase.crashlytics.buildtools.reloc.com.google.common.reflect.TypeToken
import com.google.gson.Gson
import com.radzhabov.aviatravel.Model.Airlines
import com.radzhabov.aviatravel.Model.Airports
import com.radzhabov.aviatravel.Model.Cities
import com.radzhabov.aviatravel.Model.Counties
import com.radzhabov.aviatravel.Resource.ResourceHelper
import com.radzhabov.aviatravel.ui.theme.AviatravelTheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val gson = Gson()

        // Counties handlers
        val jsonFileStringCounties = ResourceHelper.getJsonDataFromAsset("/counties.json")
        val listCountiesType = object : TypeToken<Counties>() {}.type
        val counties: Counties = gson.fromJson(jsonFileStringCounties, listCountiesType)

        // Cities handlers
        val jsonFileStringCities = ResourceHelper.getJsonDataFromAsset("/cities.json")
        val listCitiesType = object : TypeToken<Cities>() {}.type
        val cities: Cities = gson.fromJson(jsonFileStringCities, listCitiesType)

        // Airlines handlers
        val jsonFileStringAirlines = ResourceHelper.getJsonDataFromAsset("/airlines.json")
        val listAirlinesType = object : TypeToken<Airlines>() {}.type
        val airlines: Airlines = gson.fromJson(jsonFileStringAirlines, listAirlinesType)

        // Airports handlers
        val jsonFileStringAirports = ResourceHelper.getJsonDataFromAsset("/airports.json")
        val listAirportsType = object : TypeToken<Airports>() {}.type
        val airports: Airports = gson.fromJson(jsonFileStringAirports, listAirportsType)

        setContent {

        }
    }
}
