package com.example.daggerhiltwithflow.data.repo

import com.example.daggerhiltwithflow.data.api.UserService
import com.example.daggerhiltwithflow.data.model.Users

class UserRepoImplementation(private val api: UserService) : UserRepo {

    override suspend fun getLatestUser(): Users {
        return api.getUsers()
    }
}