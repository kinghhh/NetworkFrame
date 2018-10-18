package com.example.networkframe.util;

import com.example.networkframe.bean.User;

import okhttp3.ResponseBody;
import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

/**
 * Created by Administrator on 2018/10/18.
 */

public interface Api {
    /**
     * 这个请求完整的请求url是http://10.10.10.108:9002/auth/login?username=100083101&password=123456
     * 请求方式GET
     * Retrofit请求用注解的方式申明
     * @Query代表的是参数
     */
    @GET("auth/login")
    Call<ResponseBody> login(@Query("username")String username, @Query("password")String password);
}
