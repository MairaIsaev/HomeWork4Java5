package com.example.homework4java5.utlis

data class UiState<T>(
    val isLoading : Boolean = true,
    val errorMessage:String? = null,
    val success: T? = null
)
