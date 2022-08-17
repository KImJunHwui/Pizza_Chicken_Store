package com.kim.pizzachickenstore.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import com.kim.pizzachickenstore.Datas.Store
import com.kim.pizzachickenstore.R

class PizzaStoreListAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : List<Store>) : ArrayAdapter<Store>(mContext, resId, mList) {

    val inf = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow = convertView

        if(tempRow == null){

            tempRow = inf.inflate(R.layout.pizza_store_list_item, null)
        }

        val row = tempRow!!

        val pizzaData = mList[position]

        val pizzaNameTxt = row.findViewById<TextView>(R.id.pizzaNameTxt)
        val pizzaUrlImg = row.findViewById<ImageView>(R.id.pizzaUrlImg)

        pizzaNameTxt.text = pizzaData.name

        Glide.with(mContext).load(pizzaData.logoUrl).into(pizzaUrlImg)

        return row

    }
}