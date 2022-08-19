package com.kim.pizzachickenstore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.bumptech.glide.Glide
import com.kim.pizzachickenstore.datas.Store
import kotlinx.android.synthetic.main.activity_detail_pizza_store_list.*

class DetailPizzaStoreListActivity : BaseActivity() {

    lateinit var mPizzaStore : Store

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_pizza_store_list)
        setupEvent()
        setvalues()

    }
    override fun setupEvent() {

    }

    override fun setvalues() {

        mPizzaStore = intent.getSerializableExtra("pizza") as Store

        pizzaDetailNameTxt.text = mPizzaStore.name
        pizzaDetailCallTxt.text = mPizzaStore.phoneNum

        Glide.with(mContext).load(mPizzaStore.logoUrl).into(pizzaDetailImg)

    }


}