package kr.wonjun.clothet

import okhttp3.ResponseBody
import retrofit2.Call
import retrofit2.http.Field
import retrofit2.http.FormUrlEncoded
import retrofit2.http.POST

/**
 * Created by eka on 2017. 9. 2..
 */
interface APIRequest {

    @FormUrlEncoded
    @POST("/auth/signup")
    fun signUp(@Field("id") id: String, @Field("ps") ps: String, @Field("name") name: String): Call<ResponseBody>

    @FormUrlEncoded
    @POST("/auth/login")
    fun login(@Field("id") id: String, @Field("ps") ps: String): Call<ResponseBody>
}