package com.radzhabov.aviatravel.presentation

import android.annotation.SuppressLint
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.ui.platform.LocalContext
import androidx.lifecycle.viewmodel.compose.viewModel
import androidx.navigation.compose.rememberNavController
import com.radzhabov.aviatravel.data.db.AppDatabase
import com.radzhabov.aviatravel.data.handlers.flightsList
import com.radzhabov.aviatravel.data.repositories.FlightRepository
import com.radzhabov.aviatravel.presentation.*
import com.radzhabov.aviatravel.presentation.navigation.AppNavigation
import com.radzhabov.aviatravel.presentation.viewmodels.MainViewModel
import dagger.hilt.android.AndroidEntryPoint

@AndroidEntryPoint
class MainActivity : ComponentActivity() {
    @SuppressLint("UnusedMaterialScaffoldPaddingParameter")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val context = LocalContext.current
            val database = AppDatabase.getInstance(context)
            val flightDao = database.flightDao()

            val flightRepository = FlightRepository(flightDao)
            val mainViewModel: MainViewModel = viewModel(factory = MainViewModel.MainViewModelFactory(flightRepository))

            mainViewModel.loadFlights(flightsList)
            val navController = rememberNavController()
            AppNavigation(navController)
//            NavGraph()
        }
    }
}
