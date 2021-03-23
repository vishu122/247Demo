package com.test.a247demo.Repository

import androidx.lifecycle.MutableLiveData
import com.test.a247demo.Model.PopularMovies
import com.test.a247demo.Model.Result
import com.test.a247demo.Retrofit.ServiceBuilder
import com.test.a247demo.Retrofit.UserEndPoit
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response


object NetworkRepository {

    val responseData = MutableLiveData<List<Result>>()


    fun getUsersList(): MutableLiveData<List<Result>> {

        val request =
            ServiceBuilder.buildService(UserEndPoit::class.java)
        val call = request.getUser()

        call.enqueue(object : Callback<PopularMovies> {
            override fun onResponse(call: Call<PopularMovies>, response: Response<PopularMovies>) {
                val data = response.body()

                val msg = data!!.data

                responseData.value = msg
            }

            override fun onFailure(call: Call<PopularMovies>, t: Throwable) {

            }
        })

        return responseData
    }


}