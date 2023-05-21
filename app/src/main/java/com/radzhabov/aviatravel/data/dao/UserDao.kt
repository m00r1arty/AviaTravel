package com.radzhabov.aviatravel.data.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.Query
import com.radzhabov.aviatravel.data.entities.UserEntity

@Dao
interface UserDao {
    @Query("SELECT * FROM users WHERE email = :email AND password = :password")
    suspend fun login(email: String, password: String): UserEntity

    @Insert
    suspend fun register(userEntity: UserEntity)


}