package com.radzhabov.aviatravel.di

import android.content.Context
import androidx.compose.material.SnackbarHostState
import com.radzhabov.aviatravel.data.dao.FlightDao
import com.radzhabov.aviatravel.data.dao.UserDao
import com.radzhabov.aviatravel.data.db.AppDatabase
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.qualifiers.ApplicationContext
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@Module
@InstallIn(SingletonComponent::class)
object AppModule {

    @Provides
    @Singleton
    fun provideDatabase(@ApplicationContext appContext: Context) =
        AppDatabase.getInstance(appContext)

    @Provides
    @Singleton
    fun provideUserDao(appDatabase: AppDatabase): UserDao =
        appDatabase.userDao()

    @Provides
    @Singleton
    fun provideFlightDao(appDatabase: AppDatabase): FlightDao =
        appDatabase.flightDao()


}