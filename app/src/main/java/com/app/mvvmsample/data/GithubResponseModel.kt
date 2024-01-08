package com.app.mvvmsample.data

/**
 * @Author: Muhammad Hasnain Altaf
 * @Date: 08/01/2024
 */
data class GithubResponseModel(val items:ArrayList<MyData>)

data class MyData(val name:String,val description:String,val created_at:String,val owner:Owner)

data class Owner(val avatar_url:String)
