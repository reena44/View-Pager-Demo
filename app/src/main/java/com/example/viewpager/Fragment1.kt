package com.example.viewpager

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment


class Fragment1 : Fragment() {
    val COLOR = "color"
    val TEXT = "text"
    fun newInstance(text: String?, color: Int): Fragment? {
        val f = Fragment1()
        val args = Bundle()
        args.putInt(COLOR, color)
        args.putString(TEXT, text)
        f.setArguments(args)
        return f
    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.activity_main, container, false) }


}