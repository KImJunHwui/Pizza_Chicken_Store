package com.kim.pizzachickenstore

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.kim.pizzachickenstore.datas.Store

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



    }


}