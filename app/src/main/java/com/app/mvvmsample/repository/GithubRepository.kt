package com.app.mvvmsample.repository

import android.app.DownloadManager.Query
import com.app.mvvmsample.network.ApiEndPoint
import com.app.mvvmsample.network.RetrofitClient

/**
 * @Author: Muhammad Hasnain Altaf
 * @Date: 08/01/2024
 */
class GithubRepository {
    private val retrofit=RetrofitClient.getRetrofitInstance().create(ApiEndPoint::class.java)
    suspend fun getAllRepository(query: String)=retrofit.getAllRepo(query)
}