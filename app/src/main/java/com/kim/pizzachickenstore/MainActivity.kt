package com.kim.pizzachickenstore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kim.pizzachickenstore.adapters.MainviewPagerAdpater
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : BaseActivity() {

    lateinit var mvpa : MainviewPagerAdpater

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        setupEvent()
        setvalues()

    }

    override fun setupEvent() {

    }

    override fun setvalues() {

        mvpa = MainviewPagerAdpater(supportFragmentManager)
        mainViewPager.adapter = mvpa

        mainTabLayout.setupWithViewPager(mainViewPager)

    }


}