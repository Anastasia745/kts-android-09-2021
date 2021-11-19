package com.example.unsplash

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.navigation.Navigation
import by.kirich1409.viewbindingdelegate.viewBinding
import timber.log.Timber

class OnboardingFragment : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.d("OnboardingFragment onCreate ${hashCode()}")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        Timber.d("OnboardingFragment onCreateView ${hashCode()}")
        DatastoreRepository.KEY to "no"
        return inflater.inflate(R.layout.fragment_onboarding, container, false)
    }

    override fun onResume() {
        super.onResume()
        Timber.d("OnboardingFragment onResume ${hashCode()}")
    }

    override fun onPause() {
        super.onPause()
        Timber.d("OnboardingFragment onPause ${hashCode()}")
    }

    override fun onStop() {
        super.onStop()
        Timber.d("OnboardingFragment onStop ${hashCode()}")
    }

    override fun onDestroyView()
    {
        super.onDestroyView()
        Timber.d("OnboardingFragment onDestroyView ${hashCode()}")
    }

}