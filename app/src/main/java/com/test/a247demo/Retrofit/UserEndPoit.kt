package com.test.a247demo.Retrofit

import com.test.a247demo.Model.PopularMovies
import retrofit2.Call
import retrofit2.http.GET

interface UserEndPoit {

    @GET("users")
    fun getUser(): Call<PopularMovies>

}