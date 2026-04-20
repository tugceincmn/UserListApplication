package com.example.userlistapplication.data.remote

import com.example.userlistapplication.data.model.User
import retrofit2.http.GET

interface ApiService {
    @GET("users")
    suspend fun getUsers(): List<User>
}