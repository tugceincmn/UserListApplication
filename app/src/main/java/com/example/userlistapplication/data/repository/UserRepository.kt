package com.example.userlistapplication.data.repository

import com.example.userlistapplication.data.remote.RetrofitInstance

class UserRepository {
    private val apiService = RetrofitInstance.api
    suspend fun getUsers() = apiService.getUsers()
}