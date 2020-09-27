package com.example.viewpager

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Layout
import android.widget.TabWidget
import androidx.viewpager.widget.ViewPager
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupViewPager(view_pager);
        tab_layout.setupWithViewPager(view_pager)
    }
    fun  setupViewPager( viewPager: ViewPager) {
        var adapter =  ViewPAgerAdapter(supportFragmentManager)
        adapter.add(resources.getString(R.string.first), resources.getColor(R.color.colorAccent));
        adapter.add(resources.getString(R.string.second), resources.getColor(R.color.colorPrimary));
        adapter.add(resources.getString(R.string.third), resources.getColor(R.color.colorPrimaryDark));
        viewPager.adapter = adapter;
    }
}

