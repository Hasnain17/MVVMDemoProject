package com.app.mvvmsample.ui

/**
 * @Author: Muhammad Hasnain Altaf
 * @Date: 08/01/2024
 */

sealed class Result<out T : Any> {

    data class Success<out T : Any>(val data: T) : Result<T>()
    data class ErrorException(val exception: java.lang.Exception): Result<Nothing>()
    data class Error(
        val errorMessage: String,
    ) : Result<Nothing>()
}