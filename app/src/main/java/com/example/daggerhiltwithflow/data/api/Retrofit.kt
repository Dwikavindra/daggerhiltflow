package com.example.daggerhiltwithflow.data.api

import com.example.daggerhiltwithflow.data.repo.UserRepo
import com.example.daggerhiltwithflow.data.repo.UserRepoImplementation
import com.example.daggerhiltwithflow.domain.GetLatestUser
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@Module
@InstallIn
object Retrofit {
    private const val BASE_URL = "https://reqres.in/api/"

    private fun getRetrofit() = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .build()

    @Singleton
    @Provides
    private fun networkService(): UserService = getRetrofit().create(UserService::class.java)

    @Singleton
    @Provides
    private fun provideUserRepository(userService: UserService): UserRepo {
        return UserRepoImplementation(userService)
    }

    @Singleton
    @Provides
    private fun getLatestUser(userRepo: UserRepo): GetLatestUser {
        return GetLatestUser(userRepo)
    }
}