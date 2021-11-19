package com.example.unsplash.networking.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.example.unsplash.MainActivity
import com.example.unsplash.fragments.OnboardingFragment
import com.example.unsplash.fragments.OnboardingFragment2
import com.example.unsplash.fragments.OnboardingFragment3

class ViewPagerAdapter(
    val items: ArrayList<Fragment>,
    activity: MainActivity
): FragmentStateAdapter(activity) {
    override fun getItemCount(): Int = 1000

    override fun createFragment(position: Int): Fragment {
        when (position % 3) {
            0 -> {
                //  val homeFragment: HomeFragment = HomeFragment()
                return OnboardingFragment()
            }
            1 -> {
                return OnboardingFragment2()
            }
            2 -> {
                // val movieFragment = MovieFragment()
                return OnboardingFragment3()
            }
            else -> return OnboardingFragment()
        }
    }
}