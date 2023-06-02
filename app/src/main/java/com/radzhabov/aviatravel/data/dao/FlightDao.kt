package com.radzhabov.aviatravel.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.radzhabov.aviatravel.data.entities.FlightEntity
import com.radzhabov.aviatravel.data.model.Flight

@Dao
interface FlightDao {

    @Query("SELECT * FROM flights")
    fun getAllFlights(): List<FlightEntity>

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addFlights(flightEntities: List<FlightEntity>)

    @Insert(onConflict = OnConflictStrategy.IGNORE)
    fun addFlight(flightEntity: List<FlightEntity>)

}