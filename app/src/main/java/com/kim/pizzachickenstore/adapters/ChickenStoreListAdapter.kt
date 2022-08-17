package com.kim.pizzachickenstore.adapters

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ImageView
import android.widget.TextView
import com.kim.pizzachickenstore.Datas.Store
import com.kim.pizzachickenstore.R

class ChickenStoreListAdapter(
    val mContext : Context,
    val resId : Int,
    val mList : List<Store>) : ArrayAdapter<Store>(mContext, resId, mList) {

        val inflater = LayoutInflater.from(mContext)

    override fun getView(position: Int, convertView: View?, parent: ViewGroup): View {

        var tempRow2 = convertView

        if(tempRow2 == null){

            tempRow2 = inflater.inflate(R.layout.chicken_store_list_item, null)
        }

        val row2 = tempRow2!!

        val chickenData = mList[position]

        val chickenTxt = row2.findViewById<TextView>(R.id.chickenTxt)
        val chickenImg = row2.findViewById<ImageView>(R.id.chickenImg)




        return row2

    }
}