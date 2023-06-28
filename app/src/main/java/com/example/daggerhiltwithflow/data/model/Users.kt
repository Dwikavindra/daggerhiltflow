package com.example.daggerhiltwithflow.data.model

data class Users(
    val page: Int,
    val per_page: Int,
    val total: Int,
    val total_pages: Int,
    val users: List<User>,
    val support: Support
)
