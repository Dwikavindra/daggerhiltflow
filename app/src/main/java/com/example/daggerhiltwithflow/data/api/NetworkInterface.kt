package com.example.daggerhiltwithflow.data.api

import com.example.daggerhiltwithflow.data.model.Users
import retrofit2.http.GET

interface NetworkService {
    @GET("users")
    suspend fun getUsers(): Users

}