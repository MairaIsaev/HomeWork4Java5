package com.example.homework4java5.data.remote.api

import com.example.homework4java5.data.model.HarrypotterResponse
import retrofit2.Call
import retrofit2.http.GET

private const val CHARACTER = "database.json"

interface BleachCharacterApi {

    @GET(CHARACTER)
    fun getCharacter(): Call<HarrypotterResponse>
}