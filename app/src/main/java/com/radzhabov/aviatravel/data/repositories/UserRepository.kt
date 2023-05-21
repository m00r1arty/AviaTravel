package com.radzhabov.aviatravel.data.repositories

import com.radzhabov.aviatravel.data.mapper.mapUser
import com.radzhabov.aviatravel.data.mapper.mapUserEntity
import com.radzhabov.aviatravel.data.dao.UserDao
import com.radzhabov.aviatravel.data.model.User
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class UserRepository @Inject constructor(
    private val userDao: UserDao
) {
    suspend fun login(email: String, password: String) = withContext(IO) {
        val userEntity = userDao.login(email, password)
        return@withContext userEntity.mapUser()
    }

    suspend fun register(user: User) = withContext(IO) {
        return@withContext userDao.register(user.mapUserEntity())
    }

}
