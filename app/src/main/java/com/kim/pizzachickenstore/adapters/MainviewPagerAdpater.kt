package com.kim.pizzachickenstore.adapters

import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.FragmentPagerAdapter
import com.kim.pizzachickenstore.fragments.ChickenStoreListFragment
import com.kim.pizzachickenstore.fragments.PizzaStoreListFragment

class MainviewPagerAdpater(fm : FragmentManager) : FragmentPagerAdapter(fm) {


    override fun getPageTitle(position: Int): CharSequence? {
        return when(position){

            1 -> "피자가게"
            else -> "치킨가게"
        }
    }

    override fun getCount(): Int {
        return 2
    }

    override fun getItem(position: Int): Fragment {
        return when(position){

            1-> PizzaStoreListFragment()
            else -> ChickenStoreListFragment()
        }

    }


}