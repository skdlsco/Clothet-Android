package kr.wonjun.clothet

import kr.wonjun.clothet.Model.PostData
import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.GET
import retrofit2.http.POST

/**
 * Created by eka on 2017. 9. 2..
 */
interface APIRequest {

    @FormUrlEncoded
    @POST("/auth/register")
    fun signUp(@Field("id") id: String, @Field("ps") ps: String, @Field("name") name: String): Call<ResponseBody>

    @FormUrlEncoded
    @POST("/auth/login")
    fun login(@Field("id") id: String, @Field("ps") ps: String): Call<ResponseBody>

    @GET("/fb/list")
    fun fbList(): Call<ResponseBody>

    companion object {
        val retrofit: Retrofit = Retrofit.Builder()
                .baseUrl("http://soylatte.kr:8080")
                .addConverterFactory(GsonConverterFactory.create())
                .build()
        val apiRequest: APIRequest = retrofit.create(APIRequest::class.java)
    }
}