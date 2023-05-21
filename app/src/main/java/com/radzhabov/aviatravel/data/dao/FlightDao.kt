package com.radzhabov.aviatravel.data.dao

import androidx.room.Dao
import androidx.room.Insert
import com.radzhabov.aviatravel.data.entities.FlightEntity

@Dao
interface FlightDao {

    @Insert
    suspend fun addFlight(flightEntity: FlightEntity)

}