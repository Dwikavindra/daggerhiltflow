package com.example.daggerhiltwithflow.domain

import com.example.daggerhiltwithflow.data.model.Users
import com.example.daggerhiltwithflow.data.repo.UserRepo
import javax.inject.Inject


//domain layer use it for formatting the data when gained from the Repo
class GetLatestUser @Inject constructor(
    private val userRepository: UserRepo
) {
    suspend fun getLatest(): Users {
        return userRepository.getLatestUser()
    }
}