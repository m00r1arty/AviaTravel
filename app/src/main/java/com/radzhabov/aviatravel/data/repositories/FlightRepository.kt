package com.radzhabov.aviatravel.data.repositories

import com.radzhabov.aviatravel.data.mapper.mapFlightEntity
import com.radzhabov.aviatravel.data.model.Flight
import com.radzhabov.aviatravel.data.dao.FlightDao
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FlightRepository @Inject constructor(
    private val flightDao: FlightDao
) {

    suspend fun addNewFlight(flight: Flight) = withContext(IO) {
        return@withContext flightDao.addFlight(flight.mapFlightEntity())
    }

    // suspend fun getFlights()

}
