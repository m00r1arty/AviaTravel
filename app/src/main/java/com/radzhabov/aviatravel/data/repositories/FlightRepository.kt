package com.radzhabov.aviatravel.data.repositories

import com.radzhabov.aviatravel.data.model.Flight
import com.radzhabov.aviatravel.data.dao.FlightDao
import com.radzhabov.aviatravel.data.entities.FlightEntity
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class FlightRepository @Inject constructor(
    private val flightDao: FlightDao
) {

    suspend fun addFlights(flight: List<Flight>) = withContext(IO) {
        return@withContext flightDao.addFlight(flight.map {flight ->
            FlightEntity(
                airport = flight.airport,
                city = flight.city,
                code = flight.code,
                country = flight.country
            )
        })
    }

    suspend fun getFlights(): List<FlightEntity> = withContext(Dispatchers.IO) {
        return@withContext flightDao.getAllFlights()
    }

}
