package com.lello.gokkucan.zhongguoshu

import android.content.Intent
import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_yeni.*

class yeni : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_yeni)

        hadibakalim.setOnClickListener {
            val intent = Intent(this, Peppe::class.java)
            startActivity(intent)
        }

    }
}
