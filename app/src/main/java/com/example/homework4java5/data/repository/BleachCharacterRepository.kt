package com.example.homework4java5.data.repository

import android.os.Handler
import com.example.homework4java5.data.model.CharactersItem
import com.example.homework4java5.data.model.HarrypotterResponse
import com.example.homework4java5.data.remote.RetrofitClient
import retrofit2.Call
import retrofit2.Response
import javax.security.auth.callback.Callback

class BleachCharacterRepository {

    private val apiServise = RetrofitClient.bleachCharacterApi

    fun getCharacter(
        onResponse: (character: List<CharactersItem>) -> Unit,
        onFailure: (t: Throwable) -> Unit
    ) {
        apiServise.getCharacter().enqueue(object : retrofit2.Callback<HarrypotterResponse> {

            override fun onResponse(
                call: Call<HarrypotterResponse>,
                response: Response<HarrypotterResponse>
            ) {
                if (response.isSuccessful && response.body() != null)
                    onResponse(response.body()?.characters!!)
            }

            override fun onFailure(call: Call<HarrypotterResponse>, t: Throwable) {
                onFailure(t)

            }
        })
    }
}