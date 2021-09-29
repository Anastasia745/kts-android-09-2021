package com.example.unsplash

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter

class ViewPagerAdapter(
    val items: ArrayList<Fragment>,
    activity: MainActivity
): FragmentStateAdapter(activity) {
    override fun getItemCount(): Int = 1000

    override fun createFragment(position: Int): Fragment {
        when (position % 3) {
            0 -> {
                //  val homeFragment: HomeFragment = HomeFragment()
                return Onboarding()
            }
            1 -> {
                return Onboarding2()
            }
            2 -> {
                // val movieFragment = MovieFragment()
                return Onboarding3()
            }
            else -> return Onboarding()
        }
    }
}