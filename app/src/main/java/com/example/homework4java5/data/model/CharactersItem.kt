package com.example.homework4java5.data.model

import com.google.gson.annotations.SerializedName

data class CharactersItem(
    @SerializedName("hogwartsStudent")
    val hogwartsStudent: Boolean = false,
    @SerializedName("character")
    val character: String = "",
    @SerializedName("interpreted_by")
    val interpretedBy: String = "",
    @SerializedName("nickname")
    val nickname: String = "",
    @SerializedName("hogwartsHouse")
    val hogwartsHouse: String = ""
)

