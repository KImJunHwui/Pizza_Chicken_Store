package com.kim.pizzachickenstore

import androidx.appcompat.app.AppCompatActivity

abstract class BaseActivity : AppCompatActivity() {

    val mContext = this

    abstract fun setupEvent()
    abstract fun setvalues()
}