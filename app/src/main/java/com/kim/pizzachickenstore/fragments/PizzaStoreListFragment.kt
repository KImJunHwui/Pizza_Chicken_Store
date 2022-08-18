package com.kim.pizzachickenstore.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kim.pizzachickenstore.DetailPizzaStoreListActivity
import com.kim.pizzachickenstore.datas.Store
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
        mPizzaStoreList.add( Store("B피자가게","2222-3333","https://cdn1.iconfinder.com/data/icons/cartoon-snack/128/pizza-128.png"))
        mPizzaStoreList.add( Store("C피자가게","3333-4444","https://cdn3.iconfinder.com/data/icons/food-set-3/91/Food_C219-128.png"))
        mPizzaStoreList.add( Store("D피자가게","4444-5555","https://cdn0.iconfinder.com/data/icons/fastfood-31/64/pizza-italian-food-fast-fastfood-cheese-piece-128.png"))

        mAdapter = PizzaStoreListAdapter(requireContext(), R.layout.pizza_store_list_item, mPizzaStoreList)
        pizzaListView.adapter = mAdapter

        pizzaListView.setOnItemClickListener { parent, view, position, id ->

            val pizzaStoreList = mPizzaStoreList[position]
            val myIntent = Intent(requireContext(), DetailPizzaStoreListActivity::class.java)
            myIntent.putExtra("pizza",pizzaStoreList)
            startActivity(myIntent)

        }

    }


}