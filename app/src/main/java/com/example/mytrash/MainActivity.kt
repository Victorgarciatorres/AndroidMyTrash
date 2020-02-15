package com.example.mytrash

import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity(), ProductFragment.OnFragmentInteractionListener {
    override fun onFragmentInteraction(uri: Uri) {
        TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setSupportActionBar(toolbar)

        val adapter = ViewPagerAdapter(supportFragmentManager)
        adapter.addFragment(HomeActivity(), "Home")
        adapter.addFragment(MapActivity(), "Map")
        adapter.addFragment(UserActivity(), "User")
        viewPager.adapter = adapter
        tabs.setupWithViewPager(viewPager)
    }
}
