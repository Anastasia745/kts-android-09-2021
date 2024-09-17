package com.example.unsplash

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import timber.log.Timber

class Onboarding : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.d("Onboarding onCreate ${hashCode()}")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        val view = inflater.inflate(R.layout.fragment_onboarding, container, false)
        view.findViewById<Button>(R.id.buttonLogin).setOnClickListener { Navigation.findNavController(view).navigate(R.id.login)}
        Timber.d("Onboarding onCreateView ${hashCode()}")
        return view
    }

    override fun onDestroyView()
    {
        super.onDestroyView()
        Timber.d("Onboarding onDestroyView ${hashCode()}")
    }

}