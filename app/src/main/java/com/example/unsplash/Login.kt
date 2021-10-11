package com.example.unsplash

import android.content.Intent
import android.graphics.Color
import androidx.lifecycle.ViewModelProvider
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.view.isVisible
import androidx.core.widget.addTextChangedListener
import androidx.fragment.app.viewModels
import androidx.navigation.fragment.findNavController
import com.google.android.material.textfield.TextInputEditText
import net.openid.appauth.AuthorizationException
import net.openid.appauth.AuthorizationResponse
import timber.log.Timber
import by.kirich1409.viewbindingdelegate.viewBinding
import com.example.unsplash.databinding.LoginFragmentBinding
import com.example.unsplash.utils.toast

class Login : Fragment(R.layout.login_fragment){

    private val loginViewModel: LoginViewModel by viewModels()
    private val binding by viewBinding(LoginFragmentBinding::bind)

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






    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)
        bindViewModel()
    }

    override fun onActivityResult(requestCode: Int, resultCode: Int, data: Intent?) {
        if (requestCode == AUTH_REQUEST_CODE && data != null) {
            val tokenExchangeRequest = AuthorizationResponse.fromIntent(data)
                ?.createTokenExchangeRequest()
            val exception = AuthorizationException.fromIntent(data)
            when {
                tokenExchangeRequest != null && exception == null ->
                    loginViewModel.onAuthCodeReceived(tokenExchangeRequest)
                exception != null -> loginViewModel.onAuthCodeFailed(exception)
            }
        } else {
            super.onActivityResult(requestCode, resultCode, data)
        }
    }

    private fun bindViewModel() {
        binding.OAuthButton.setOnClickListener { loginViewModel.openLoginPage() }
        loginViewModel.loadingLiveData.observe(viewLifecycleOwner, ::updateIsLoading)
        loginViewModel.openAuthPageLiveData.observe(viewLifecycleOwner, ::openAuthPage)
        loginViewModel.toastLiveData.observe(viewLifecycleOwner, ::toast)

        loginViewModel.authSuccessLiveData.observe(viewLifecycleOwner) {
            findNavController().navigate(R.id.action_login_to_OAuthFragment)
        }
    }

    private fun updateIsLoading(isLoading: Boolean) = with(binding) {
        OAuthButton.isVisible = !isLoading
    }

    private fun openAuthPage(intent: Intent) {
        startActivityForResult(intent, AUTH_REQUEST_CODE)
    }

    companion object {
        private const val AUTH_REQUEST_CODE = 342
    }
}