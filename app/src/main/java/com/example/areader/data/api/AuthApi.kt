package com.example.areader.data.api

import com.example.areader.data.request.auth.SingInAuthRequest
import com.example.areader.data.request.auth.SingUpAuthRequest
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.POST

interface AuthApi {
    @POST("singUp")
    suspend fun singUp(
        @Body body: SingUpAuthRequest
    ): Unit

    @POST("singIn")
    suspend fun singIn(
        @Body body: SingInAuthRequest
    ): String

    @GET("Authenticate")
    suspend fun authenticate(
        @Header("Authorization") token: String
    ): Unit
}