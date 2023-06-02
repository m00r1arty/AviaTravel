package com.radzhabov.aviatravel.presentation.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.radzhabov.aviatravel.data.model.Flight
import com.radzhabov.aviatravel.data.repositories.FlightRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MainViewModel @Inject constructor(
    private val flightRepository: FlightRepository
) : ViewModel() {
    private val _flight = MutableStateFlow(Flight.defaultFlight())
    val flight: StateFlow<Flight> = _flight.asStateFlow()

    fun loadFlights(flights: List<Flight>) {
        viewModelScope.launch {
//            val flightsList = flightRepository.getFlights()
            flight.value.let {
                flightRepository.addFlights(flights)
            }
        }
    }


    class MainViewModelFactory(
        private val flightRepository: FlightRepository
    ) : ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(MainViewModel::class.java)) {
                return MainViewModel(flightRepository) as T
            }
            throw IllegalArgumentException("Unknown ViewModel class")
        }
    }
}