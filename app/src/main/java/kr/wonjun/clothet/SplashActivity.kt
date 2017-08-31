package com.clothet

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import kotlinx.android.synthetic.main.activity_splash.*
import kr.wonjun.clothet.R
import org.jetbrains.anko.startActivity

class SplashActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)
        splash_btn_register.setOnClickListener {
            startActivity<RegisterActivity>()
        }
        splash_btn_login.setOnClickListener {

        }
    }
}
