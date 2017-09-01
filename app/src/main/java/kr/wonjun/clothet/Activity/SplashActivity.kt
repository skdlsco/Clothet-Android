package kr.wonjun.clothet.Activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import android.view.animation.Animation
import android.view.animation.AnimationUtils
import android.widget.ImageView
import android.widget.LinearLayout
import kotlinx.android.synthetic.main.activity_splash.*
import kr.wonjun.clothet.APIRequest
import kr.wonjun.clothet.InfoDialog
import kr.wonjun.clothet.Model.InfoData
import kr.wonjun.clothet.PayingDialog
import kr.wonjun.clothet.R
import okhttp3.ResponseBody
import org.jetbrains.anko.startActivity
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class SplashActivity : AppCompatActivity() {
    lateinit var anim: Animation
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_splash)

        initApp()
        splash_btn_register.setOnClickListener {
            startActivity<RegisterActivity>()
        }
        splash_btn_login.setOnClickListener {
            APIRequest.apiRequest.login("asdf", "asdf").enqueue(object : Callback<ResponseBody> {
                override fun onFailure(call: Call<ResponseBody>?, t: Throwable?) {
                }

                override fun onResponse(call: Call<ResponseBody>?, response: Response<ResponseBody>?) {
                    Log.e("asdf", response!!.message())
                    startActivity<MainActivity>()
                    finish()
                }

            })
            startActivity<MainActivity>()
        }
    }

    private fun initApp(): Unit {
        translateIcon()
        alphaLayout()
    }

    private fun translateIcon(): Unit {


        val icon: ImageView = findViewById(R.id.splash_img)
        anim = AnimationUtils.loadAnimation(this, R.anim.translate)
        anim.reset()


        icon.clearAnimation()
        icon.startAnimation(anim)

        val thread: Thread = Thread {
            var term = 0
            while (term < 3000) {
                Thread.sleep(60)
                term += 100
            }
        }
        thread.start()
    }

    private fun alphaLayout(): Unit {

        val animlayout: LinearLayout = findViewById(R.id.splash_container)

        anim = AnimationUtils.loadAnimation(this, R.anim.alpha)
        anim.reset()

        animlayout.clearAnimation()
        animlayout.startAnimation(anim)

        val thread: Thread = Thread {
            try {
                var term = 0
                while (term < 3000) {
                    Thread.sleep(60)
                    term += 100
                }
            } catch (e: InterruptedException) {
            } finally {
            }
        }
        thread.start()
    }
}

