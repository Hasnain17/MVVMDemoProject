package com.app.mvvmsample.network

import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

/**
 * @Author: Muhammad Hasnain Altaf
 * @Date: 08/01/2024
 */
class RetrofitClient {
    companion object{
        private const val baseUrl = "https://api.github.com/"
        fun getRetrofitInstance():Retrofit{
            return Retrofit.Builder().baseUrl(baseUrl).addConverterFactory(GsonConverterFactory.create()).build()
            }
        }
    }
