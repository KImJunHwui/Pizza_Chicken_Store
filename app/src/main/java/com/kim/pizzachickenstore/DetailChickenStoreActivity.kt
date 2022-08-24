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
import kotlinx.android.synthetic.main.activity_detail_chicken_store.*

class DetailChickenStoreActivity : BaseActivity() {

    lateinit var mChickenStore : Store

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_detail_chicken_store)
        setupEvent()
        setvalues()
    }

    override fun setupEvent() {

        val permissionListener2 =  object : PermissionListener{
            override fun onPermissionGranted() {

                chickenCallBtn.setOnClickListener {

                    val myUri = Uri.parse("tel:${mChickenStore.phoneNum}")
                    val myIntent = Intent(Intent.ACTION_CALL, myUri)
                    startActivity(myIntent)

                }

            }

            override fun onPermissionDenied(deniedPermissions: MutableList<String>?) {

                Toast.makeText(mContext, "[설정]창에 다시 확인 바랍니다.", Toast.LENGTH_SHORT).show()


            }

        }

        TedPermission.create()
            .setPermissionListener(permissionListener2)
            .setDeniedMessage("[설정]창에서 다시 확인 바랍니다.")
            .setPermissions(Manifest.permission.CALL_PHONE)
            .check()

    }

    override fun setvalues() {

       mChickenStore = intent.getSerializableExtra("chicken") as Store

       chickenDetailNameTxt.text = mChickenStore.name
       chickenDetailCallTxt.text = mChickenStore.phoneNum

       Glide.with(mContext).load(mChickenStore.logoUrl).into(chickenDetailImg)

    }


}