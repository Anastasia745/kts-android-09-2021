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

        Timber.d("Onboarding onCreateView ${hashCode()}")
        return inflater.inflate(R.layout.fragment_onboarding, container, false)
    }

    override fun onResume() {
        super.onResume()
        Timber.d("Onboarding onResume ${hashCode()}")
    }

    override fun onPause() {
        super.onPause()
        Timber.d("Onboarding onPause ${hashCode()}")
    }

    override fun onStop() {
        super.onStop()
        Timber.d("Onboarding onStop ${hashCode()}")
    }

    override fun onDestroyView()
    {
        super.onDestroyView()
        Timber.d("Onboarding onDestroyView ${hashCode()}")
    }

}