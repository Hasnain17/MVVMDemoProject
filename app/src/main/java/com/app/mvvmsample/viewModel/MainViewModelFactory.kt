package com.app.mvvmsample.viewModel

import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.app.mvvmsample.repository.GithubRepository

/**
 * @Author: Muhammad Hasnain Altaf
 * @Date: 08/01/2024
 */
class MainViewModelFactory:ViewModelProvider.Factory {
    @Throws(IllegalArgumentException::class)
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return MainViewModel(repository = GithubRepository()) as T
        throw IllegalArgumentException("Unknown ViewModel class")
    }

}