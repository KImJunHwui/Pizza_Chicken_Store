package com.kim.pizzachickenstore.fragments

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.fragment.app.FragmentManager
import com.kim.pizzachickenstore.Datas.Store
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
        mChickenStoreList.add(Store("A치킨가게","9999-8888","https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMjA3MjNfMTM5%2FMDAxNjU4NTMyNDI2ODc3._0ZEeOvEhZqmWXPZh9vu5ezJ3fWifFlnjoZ9T6tx2wUg.NREgD2APme1-EoeVcpCiuRTIwbZisqAmhHNWdcxPS_Qg.JPEG.wjd153486%2FIMG_1545.jpg&type=sc960_832"))
        mChickenStoreList.add(Store("A치킨가게","9999-8888","https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMjA3MjNfMTM5%2FMDAxNjU4NTMyNDI2ODc3._0ZEeOvEhZqmWXPZh9vu5ezJ3fWifFlnjoZ9T6tx2wUg.NREgD2APme1-EoeVcpCiuRTIwbZisqAmhHNWdcxPS_Qg.JPEG.wjd153486%2FIMG_1545.jpg&type=sc960_832"))
        mChickenStoreList.add(Store("A치킨가게","9999-8888","https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMjA3MjNfMTM5%2FMDAxNjU4NTMyNDI2ODc3._0ZEeOvEhZqmWXPZh9vu5ezJ3fWifFlnjoZ9T6tx2wUg.NREgD2APme1-EoeVcpCiuRTIwbZisqAmhHNWdcxPS_Qg.JPEG.wjd153486%2FIMG_1545.jpg&type=sc960_832"))
        mChickenStoreList.add(Store("A치킨가게","9999-8888","https://search.pstatic.net/common/?src=http%3A%2F%2Fblogfiles.naver.net%2FMjAyMjA3MjNfMTM5%2FMDAxNjU4NTMyNDI2ODc3._0ZEeOvEhZqmWXPZh9vu5ezJ3fWifFlnjoZ9T6tx2wUg.NREgD2APme1-EoeVcpCiuRTIwbZisqAmhHNWdcxPS_Qg.JPEG.wjd153486%2FIMG_1545.jpg&type=sc960_832"))

        mChickenAdapter = ChickenStoreListAdapter(requireContext(), R.layout.chicken_store_list_item,mChickenStoreList)
        chickenStoreListView.adapter = mChickenAdapter

    }


}