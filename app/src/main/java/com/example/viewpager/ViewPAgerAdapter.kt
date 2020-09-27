package com.example.viewpager

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import java.lang.reflect.Array.newInstance
import javax.xml.datatype.DatatypeFactory.newInstance
import javax.xml.validation.SchemaFactory.newInstance

class ViewPAgerAdapter(fm: FragmentManager) : FragmentPagerAdapter(fm) {

    private var  mFragmentList :List<Fragment> =  ArrayList()
    private var  mFragmentTitleList:List<String> =  ArrayList()
    fun add (title:String,color:Int){
        val fragment = Fragment1().newInstance(title, color)
    mFragmentList.add(fragment)
    mFragmentTitleList.add(title)
    }


    override fun getItem(position: Int): Fragment {
        return mFragmentList.get(position)
    }

    override fun getCount(): Int {
        return mFragmentList.size    }

    override fun getPageTitle(position: Int): CharSequence? {
            return mFragmentTitleList[position]

    }
}

private fun <E> List<E>.add(fragment: E?) {


}
