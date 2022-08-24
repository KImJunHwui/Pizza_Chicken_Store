package com.kim.pizzachickenstore

import android.Manifest
import android.content.Intent
import android.net.Uri
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Toast
import com.bumptech.glide.Glide
import com.gun0912.tedpermission.PermissionListener
import com.gun0912.tedpermission.normal.TedPermission
import com.kim.pizzachickenstore.datas.Store
import kotlinx.android.synthetic.main.activity_detail_pizza_store_list.*
import java.security.Permission

class DetailPizzaStoreListActivity : BaseActivity() {

    lateinit var mPizzaStore : Store

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_pizza_store_list)
        setupEvent()
        setvalues()

    }
    override fun setupEvent() {

       val permissionListener = object : PermissionListener{
           override fun onPermissionGranted() {

               pizzaCallBtn.setOnClickListener {

                   val myUri = Uri.parse("tel:${mPizzaStore.phoneNum}")
                   val myIntent = Intent(Intent.ACTION_CALL,myUri)
                   startActivity(myIntent)


               }

           }

           override fun onPermissionDenied(deniedPermissions: MutableList<String>?) {

               Toast.makeText(mContext, "확인 후 다시 시도 바랍니다.", Toast.LENGTH_SHORT).show()
           }


       }

        TedPermission.create()
            .setPermissionListener(permissionListener)
            .setDeniedMessage("[설정] 창을 확인 바랍니다.")
            .setPermissions(Manifest.permission.CALL_PHONE)
            .check()






    }

    override fun setvalues() {

        mPizzaStore = intent.getSerializableExtra("pizza") as Store

        pizzaDetailNameTxt.text = mPizzaStore.name
        pizzaDetailCallTxt.text = mPizzaStore.phoneNum

        Glide.with(mContext).load(mPizzaStore.logoUrl).into(pizzaDetailImg)

    }


}