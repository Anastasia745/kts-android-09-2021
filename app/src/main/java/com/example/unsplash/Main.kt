package com.example.unsplash

import android.os.Bundle
import android.util.Log
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import timber.log.Timber

class Main : Fragment() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        Timber.d("Main onCreate ${hashCode()}")
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        Timber.d("Main onCreateView ${hashCode()}")
        return inflater.inflate(R.layout.fragment_main, container, false)
    }

    override fun onDestroyView()
    {
        super.onDestroyView()
        Timber.d("Main onDestroyView ${hashCode()}")
    }
}