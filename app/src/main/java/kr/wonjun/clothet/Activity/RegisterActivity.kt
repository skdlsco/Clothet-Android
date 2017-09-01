package kr.wonjun.clothet.Activity

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import kr.wonjun.clothet.APIRequest
import kr.wonjun.clothet.R
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)

        APIRequest.apiRequest.signUp("asdf", "asdf", "asdf").enqueue(object : Callback<ResponseBody> {
            override fun onFailure(call: Call<ResponseBody>?, t: Throwable?) {
                Log.e("asdf", "asdf" + t?.message)
            }

            override fun onResponse(call: Call<ResponseBody>?, response: Response<ResponseBody>?) {
                finish()
            }

        })
    }
}