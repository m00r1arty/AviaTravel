package com.radzhabov.aviatravel

import com.radzhabov.aviatravel.data.dao.UserDao
import com.radzhabov.aviatravel.data.entities.UserEntity

class MockUserDao : UserDao {
    private val users = mutableListOf<UserEntity>()

    override suspend fun login(email: String, password: String): UserEntity {
        return users.firstOrNull { it.email == email && it.password == password }
            ?: throw NoSuchElementException("No user found with email '$email' and password '$password'")
    }

    override suspend fun register(userEntity: UserEntity) {
        if (users.any { it.email == userEntity.email }) {
            throw IllegalArgumentException("User with email '${userEntity.email}' already exists")
        }
        users.add(userEntity)
    }
}