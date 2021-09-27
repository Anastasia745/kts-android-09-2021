package com.example.unsplash

import android.util.Patterns
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel

class LoginViewModel(state: SavedStateHandle) : ViewModel() {

    companion object {
        private val KEY = "activeButton"
    }
    private val savedStateHandle = false

    var isValid = state.getLiveData(KEY,savedStateHandle)

    fun isValidForm(email : CharSequence?, password : CharSequence?){
        val isValidEmail = email != null && Patterns.EMAIL_ADDRESS.matcher(email).matches()
        val isValidPassword = password != null && password.length >= 8
        isValid.value = isValidEmail && isValidPassword
    }
}
