package com.example.daggerhiltwithflow.data.repo

import com.example.daggerhiltwithflow.data.model.Users

interface UserRepo {
    suspend fun getLatestUser(): Users
}