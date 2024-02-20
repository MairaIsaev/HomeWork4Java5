package com.example.homework4java5.data.model

import com.google.gson.annotations.SerializedName

data class InfoItem(
    @SerializedName("type")
    val type: String = "",
    @SerializedName("content")
    val content: String = ""
)
