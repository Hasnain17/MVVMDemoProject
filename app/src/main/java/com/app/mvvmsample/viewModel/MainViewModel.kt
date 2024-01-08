package com.app.mvvmsample.viewModel

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.app.mvvmsample.data.DataAdapter
import com.app.mvvmsample.data.GithubResponseModel
import com.app.mvvmsample.data.MyData
import com.app.mvvmsample.repository.GithubRepository
import  com.app.mvvmsample.ui.Result

import kotlinx.coroutines.launch

/**
 * @Author: Muhammad Hasnain Altaf
 * @Date: 08/01/2024
 */class MainViewModel (private val repository: GithubRepository):ViewModel() {
     private val _githubResponseData=MutableLiveData<Result<GithubResponseModel>>()
    val githubResponseData:LiveData<Result<GithubResponseModel>> =_githubResponseData

    var dataAdapter:DataAdapter= DataAdapter()
    init {
        makeApiCall()
    }

    fun getAdapter():DataAdapter{
        return dataAdapter
    }

    fun setAdapterData(data:ArrayList<MyData>){
        dataAdapter.setData(data)
        dataAdapter.notifyDataSetChanged()
    }

    private fun makeApiCall(input:String?=null)=viewModelScope.launch {
        try {
            val response=repository.getAllRepository("kotlin")
            if (response.isSuccessful){
                _githubResponseData.value= Result.Success(response.body()!!)
            }
            else{
                _githubResponseData.value = Result.Error(response.message())
            }
        }
        catch (e:Exception){
            e.printStackTrace().toString()
            _githubResponseData.value=Result.ErrorException(e)
        }
    }
}