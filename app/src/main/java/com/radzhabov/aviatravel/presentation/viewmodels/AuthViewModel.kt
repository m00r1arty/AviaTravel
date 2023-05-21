package com.radzhabov.aviatravel.presentation.viewmodels

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.radzhabov.aviatravel.data.model.User
import com.radzhabov.aviatravel.data.repositories.UserRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class AuthViewModel @Inject constructor(
    private val userRepository: UserRepository
) : ViewModel() {

    private val user = MutableLiveData(User.defaultUser())

    fun login(): LiveData<Boolean?> {
        val resultOfSign = MutableLiveData<Boolean?>(null)

        viewModelScope.launch {
            user.value?.let {
                userRepository.login(it.email, it.password)
                resultOfSign.postValue(true)
            }
        }
        return resultOfSign
    }
    // Остальные функции ViewModel

    fun register() {
        viewModelScope.launch {
            user.value?.let {
                userRepository.register(it)
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