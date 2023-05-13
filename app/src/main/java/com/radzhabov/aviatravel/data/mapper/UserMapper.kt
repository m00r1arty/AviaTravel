package com.radzhabov.aviatravel.data.mapper

import com.radzhabov.aviatravel.screens.data.entities.UserEntity
import com.radzhabov.aviatravel.screens.data.model.User

fun UserEntity.mapUser() = User(
    name = this.name,
    email = this.email,
    password = this.password
)

fun User.mapUserEntity() = UserEntity(
    name = this.name,
    email = this.email,
    password = this.password
)