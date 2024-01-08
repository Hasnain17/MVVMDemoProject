package com.app.mvvmsample.network

/**
 * @Author: Muhammad Hasnain Altaf
 * @Date: 08/01/2024
 */
import com.app.mvvmsample.data.GithubResponseModel
import retrofit2.Call
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

interface ApiEndPoint {
    @GET("search/repositories")
    suspend fun getAllRepo(@Query("q")q:String):Response<GithubResponseModel>
}