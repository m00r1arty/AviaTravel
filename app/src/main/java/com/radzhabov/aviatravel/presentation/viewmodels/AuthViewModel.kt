package com.radzhabov.aviatravel.presentation.viewmodels

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.radzhabov.aviatravel.data.model.User
import com.radzhabov.aviatravel.data.repositories.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import kotlinx.coroutines.withContext
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(
    private val userRepository: UserRepository
) : ViewModel() {
    private val _user = MutableStateFlow(User.defaultUser())
    val user: StateFlow<User> = _user.asStateFlow()

    suspend fun login(email: String, password: String): Boolean {
        val resultOfSign = MutableStateFlow<Boolean>(false)
        withContext(Dispatchers.IO) {
            val user = userRepository.login(email, password)
            resultOfSign.value = (user != null)
        }
        return resultOfSign.value
    }

    fun register(name: String, email: String, password: String) {
        viewModelScope.launch {
            user.value.let {
                userRepository.register(User(name, email, password))
            }
        }
    }

    class AuthViewModelFactory(
        private val userRepository: UserRepository,
    ) : ViewModelProvider.Factory {
        override fun <T : ViewModel> create(modelClass: Class<T>): T {
            if (modelClass.isAssignableFrom(AuthViewModel::class.java)) {
                return AuthViewModel(userRepository) as T
            }
            throw IllegalArgumentException("Unknown ViewModel class")
        }
    }
}