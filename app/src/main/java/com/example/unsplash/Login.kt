package com.example.unsplash

import android.graphics.Color
import android.os.Bundle
import android.util.Patterns
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.core.widget.addTextChangedListener
import androidx.navigation.fragment.findNavController
import com.google.android.material.textfield.TextInputEditText

// TODO: Rename parameter arguments, choose names that match
// the fragment initialization parameters, e.g. ARG_ITEM_NUMBER
private const val ARG_PARAM1 = "param1"
private const val ARG_PARAM2 = "param2"

/**
 * A simple [Fragment] subclass.
 * Use the [Login.newInstance] factory method to
 * create an instance of this fragment.
 */
class Login : Fragment() {
    // TODO: Rename and change types of parameters
    private var param1: String? = null
    private var param2: String? = null

    private var email: TextInputEditText? = null
    private var password: TextInputEditText? = null
    private var signIn: Button? = null
    private var isValidEmail  = false
    private var isValidPassword = false

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        arguments?.let {
            param1 = it.getString(ARG_PARAM1)
            param2 = it.getString(ARG_PARAM2)
        }
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        email = view.findViewById(R.id.emailText)
        password = view.findViewById(R.id.passwordText)
        signIn = view.findViewById(R.id.signIn)
        activeButton()
        Listener()
    }

    private fun Listener() {
        email?.addTextChangedListener {
            checkEmail()
        }
        password?.addTextChangedListener {
            checkPassword()
        }

        signIn?.setOnClickListener {
            activeButton()
            if (checkEmail() && checkPassword())
                findNavController().navigate(R.id.action_login_to_main)
        }
    }

    private fun checkEmail(): Boolean {
        isValidEmail  = Patterns.EMAIL_ADDRESS.matcher(email?.text.toString()).matches()
        activeButton()
        return isValidEmail
    }

    private fun checkPassword(): Boolean {
        isValidPassword = password?.text!!.length >= 8
        activeButton()
        return isValidPassword
    }

    private fun activeButton() {
        if (isValidEmail && isValidPassword)
            signIn?.setBackgroundColor(Color.BLACK)
        else
            signIn?.setBackgroundColor(Color.GRAY)
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_login, container, false)
    }

    companion object {
        /**
         * Use this factory method to create a new instance of
         * this fragment using the provided parameters.
         *
         * @param param1 Parameter 1.
         * @param param2 Parameter 2.
         * @return A new instance of fragment Login.
         */
        // TODO: Rename and change types and number of parameters
        @JvmStatic
        fun newInstance(param1: String, param2: String) =
            Login().apply {
                arguments = Bundle().apply {
                    putString(ARG_PARAM1, param1)
                    putString(ARG_PARAM2, param2)
                }
            }
    }
}