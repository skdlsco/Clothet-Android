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
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

class RegisterActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_register)
        var retrofit: Retrofit = Retrofit.Builder()
                .baseUrl("http://soylatte.kr:8080")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        var apiRequest: APIRequest = retrofit.create(APIRequest::class.java)
        apiRequest.signUp("asdf", "asdf", "asdf").enqueue(object : Callback<ResponseBody> {
            override fun onFailure(call: Call<ResponseBody>?, t: Throwable?) {
                TODO("not implemented") //To change body of created functions use File | Settings | File Templates.
            }

            override fun onResponse(call: Call<ResponseBody>?, response: Response<ResponseBody>?) {
                Log.e("asdf", response?.body()?.string())
            }

        })
    }
}