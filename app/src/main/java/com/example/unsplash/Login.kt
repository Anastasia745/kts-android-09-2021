package com.example.unsplash

import android.graphics.Color
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.google.android.material.textfield.TextInputEditText
import timber.log.Timber

class Login : Fragment(R.layout.login_fragment){

    private val loginViewModel: LoginViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        val email = view.findViewById<TextInputEditText>(R.id.emailText)
        val password = view.findViewById<TextInputEditText>(R.id.passwordText)
        val signIn = view.findViewById<Button>(R.id.signIn)

        email.addTextChangedListener {
            loginViewModel.isValidForm(email.text,password.text)
        }
        password.addTextChangedListener {
            loginViewModel.isValidForm(email.text,password.text)
        }

        loginViewModel.isValid.observe(viewLifecycleOwner) {
            if(loginViewModel.isValid.value == true) {
                signIn.isEnabled = true
                signIn?.setBackgroundColor(Color.BLACK)
            }
            else
            {
                signIn.isEnabled = false
                signIn?.setBackgroundColor(Color.GRAY)
            }
        }

        signIn.setOnClickListener{
            findNavController().navigate(R.id.action_login_to_main)
        }
        Timber.d("Login onViewCreated ${hashCode()}")
    }

    override fun onResume() {
        super.onResume()
        Timber.d("Login onResume ${hashCode()}")
    }

    override fun onPause() {
        super.onPause()
        Timber.d("Login onPause ${hashCode()}")
    }

    override fun onStop() {
        super.onStop()
        Timber.d("Login onStop ${hashCode()}")
    }

    override fun onDestroyView()
    {
        super.onDestroyView()
        Timber.d("Login onDestroyView ${hashCode()}")
    }
}