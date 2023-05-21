package com.radzhabov.aviatravel.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase
import com.radzhabov.aviatravel.data.dao.FlightDao
import com.radzhabov.aviatravel.data.dao.UserDao
import com.radzhabov.aviatravel.data.entities.FlightEntity
import com.radzhabov.aviatravel.data.entities.UserEntity

@Database(
    version = 1,
    exportSchema = false,
    entities = [
        UserEntity::class,
        FlightEntity::class
    ]
)
abstract class AppDatabase: RoomDatabase() {

    abstract fun userDao(): UserDao
    abstract fun flightDao(): FlightDao

    companion object {
        private var instance: AppDatabase? = null

        fun getInstance(context: Context): AppDatabase {
            return instance ?: synchronized(this) {
                instance ?: Room.databaseBuilder(
                    context.applicationContext,
                    AppDatabase::class.java,
                    "app_database"
                ).build().also { instance = it }
            }

        }
    }
}