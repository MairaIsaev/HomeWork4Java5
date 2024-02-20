package com.example.homework4java5.data.model

import com.google.gson.annotations.SerializedName

data class SpellsItem(
    @SerializedName("spell")
    val spell: String = "",
    @SerializedName("use")
    val use: String = ""
)
