package com.kim.pizzachickenstore.fragments

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.kim.pizzachickenstore.DetailChickenStoreActivity
import com.kim.pizzachickenstore.datas.Store
import com.kim.pizzachickenstore.R
import com.kim.pizzachickenstore.adapters.ChickenStoreListAdapter
import kotlinx.android.synthetic.main.fragment_chicken_store_list.*

class ChickenStoreListFragment : Fragment() {

    val mChickenStoreList = ArrayList<Store>()

    lateinit var mChickenAdapter : ChickenStoreListAdapter

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_chicken_store_list, container, false)

    }

    override fun onActivityCreated(savedInstanceState: Bundle?) {
        super.onActivityCreated(savedInstanceState)

        mChickenStoreList.add(Store("A치킨가게","9999-8888","https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMjA3MjNfMTM5%2FMDAxNjU4NTMyNDI2ODc3._0ZEeOvEhZqmWXPZh9vu5ezJ3fWifFlnjoZ9T6tx2wUg.NREgD2APme1-EoeVcpCiuRTIwbZisqAmhHNWdcxPS_Qg.JPEG.wjd153486%2FIMG_1545.jpg&type=sc960_832"))
        mChickenStoreList.add(Store("B치킨가게","8888-7777","https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMjA3MjlfNDYg%2FMDAxNjU5MDMwOTg0MzM3.PGp6AXUr86nnmcANLeC5FyuZPQWW-Tmdqs8eIv7CWuYg.sez5SyjUWs4jNVw1wWDevbmHlX_AolmDAC6LpfWMux8g.JPEG.thisisaaa%2F20220728%25A3%25DF190524.jpg&type=sc960_832"))
        mChickenStoreList.add(Store("C치킨가게","7777-6666","https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMjA3MTRfMTMg%2FMDAxNjU3Nzg1NzU1NzUx.J6vVIW_LMoxMswdq0o1l8mEmC7rLDA0fCsTWL4Z0wUAg.5OaSn4x0ycNcAOOIDGF4B2GDUl8SPqBq01_VTX2d1Oog.PNG.kkcho0815%2F%25C8%25AD%25B8%25E9_%25C4%25B8%25C3%25B3_2022-07-14_165358.png&type=sc960_832"))
        mChickenStoreList.add(Store("D치킨가게","6666-5555","https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMTEwMjVfMjI1%2FMDAxNjM1MTY1MjgxMDI1.CnwpKsWvREyPbkcskeJlJocU5Zky52X6bIuxJdg3SXAg.gecdmnYZurU--zJVxf9YDmP1zVKyysbrwkseRaZSSsEg.JPEG.flffltndus%2FIMG_2026.JPG&type=sc960_832"))
        mChickenStoreList.add(Store("E치킨가게","5555-6666","https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMjAyMDNfMTA4%2FMDAxNjQzODYxODM3Nzkx.m4P70g1Y6IrHnZ_OUJvh_pEq91Rvo85oLuqRrx9g_xIg.mJ_ca1whZrOLUXA15cTbHRxqqC4VsA0QFY4e8Bv9dgQg.JPEG.godgreenday%2FSGY_3644.jpg&type=sc960_832"))

        mChickenAdapter = ChickenStoreListAdapter(requireContext(), R.layout.chicken_store_list_item,mChickenStoreList)
        chickenStoreListView.adapter = mChickenAdapter

        chickenStoreListView.setOnItemClickListener { parent, view, position, id ->

            val clickedchicken = mChickenStoreList[position]

            val myIntent = Intent(requireContext(), DetailChickenStoreActivity::class.java)
            myIntent.putExtra("chicken",clickedchicken)
            startActivity(myIntent)

        }

    }


}