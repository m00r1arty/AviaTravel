package com.radzhabov.aviatravel.data.entities

import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "flights")
data class FlightEntity(
    @PrimaryKey(autoGenerate = true) @ColumnInfo(name = "id") val id: Int = 0,
    @ColumnInfo(name = "airport") val airport: String,
    @ColumnInfo(name = "city") val city: String,
    @ColumnInfo(name = "code") val code: String,
    @ColumnInfo(name = "country") val country: String,
)
