package com.example.unsplash

import android.content.ContentValues.TAG
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.Button
import androidx.fragment.app.Fragment
import androidx.viewpager2.widget.ViewPager2
import timber.log.Timber

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val application = Application()
        application.onCreate()
        Timber.d("MainActivity onCreate ${hashCode()}")

        val viewPager = findViewById<ViewPager2>(R.id.view_pager)

        //indicator.setViewPager(viewPager)
        val fragments: ArrayList<Fragment> = arrayListOf(
            Onboarding(),
            Onboarding2(),
            Onboarding3(),
        )
        val adapter = ViewPagerAdapter(fragments, this)
        viewPager.adapter = adapter
    }

    fun onClickStart(view: View)
    {
        val intent = Intent(this, SecondActivity::class.java)
        startActivity(intent)
    }

    override fun startActivity(intent: Intent?) {
        super.startActivity(intent)
        Timber.d("MainActivity startActivity ${hashCode()}")
    }

    override fun onResume() {
        super.onResume()
        Timber.d("MainActivity onResume ${hashCode()}")
    }

    override fun onPause() {
        super.onPause()
        Timber.d("MainActivity onPause ${hashCode()}")
    }

    override fun onStop() {
        super.onStop()
        Timber.d("MainActivity onStop ${hashCode()}")
    }

    override fun onDestroy() {
        super.onDestroy()
        Timber.d("MainActivity onDestroy ${hashCode()}")
    }
}