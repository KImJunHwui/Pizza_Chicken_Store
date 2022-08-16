package com.kim.pizzachickenstore.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.kim.pizzachickenstore.Datas.Store
import com.kim.pizzachickenstore.R
import com.kim.pizzachickenstore.adapters.PizzaStoreListAdapter
import kotlinx.android.synthetic.main.fragment_pizza_store_list.*

class PizzaStoreListFragment : Fragment() {

    val mPizzaStoreList = ArrayList<Store>()

    lateinit var mAdapter : PizzaStoreListAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_pizza_store_list,container, false)
    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        mPizzaStoreList.add( Store("A피자가게","1111-2222","https://cdn3.iconfinder.com/data/icons/street-food-and-food-trucker-1/64/pizza-fast-food-bake-bread-128.png"))

        mAdapter = PizzaStoreListAdapter(requireContext(), R.layout.pizza_store_list_item, mPizzaStoreList)
        pizzaListView.adapter = mAdapter

    }


}