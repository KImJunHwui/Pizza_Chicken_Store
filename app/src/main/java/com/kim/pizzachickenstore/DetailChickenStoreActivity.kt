package com.kim.pizzachickenstore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.kim.pizzachickenstore.datas.Store
import kotlinx.android.synthetic.main.activity_detail_chicken_store.*

class DetailChickenStoreActivity : BaseActivity() {

    lateinit var mChickenStore : Store

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_chicken_store)
        setupEvent()
        setvalues()
    }

    override fun setupEvent() {

    }

    override fun setvalues() {

       mChickenStore = intent.getSerializableExtra("chicken") as Store

       chickenDetailNameTxt.text = mChickenStore.name
       chickenDetailCallTxt.text = mChickenStore.phoneNum

       Glide.with(mContext).load(mChickenStore.logoUrl).into(chickenDetailImg)

    }


}