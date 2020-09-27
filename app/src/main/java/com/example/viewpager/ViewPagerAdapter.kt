package com.example.viewpager;

import android.text.Layout
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter

class ViewPagerAdapter(fm: FragmentManager?) : FragmentPagerAdapter(fm!!) {

    override fun getItem(position: Int): Fragment {
        when (position) {
            0 -> return Fragment1() //ChildFragment1 at position 0
            1 -> return Fragment2() //ChildFragmen  t2 at position 1
            2 -> return Fragment3() //ChildFragment3 at position 2
        }
        return Fragment1()

    }
    override fun getCount(): Int {
        return 3
    }

}