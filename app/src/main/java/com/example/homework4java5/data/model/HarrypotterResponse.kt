package com.example.homework4java5.data.model

import com.google.gson.annotations.SerializedName

data class HarrypotterResponse(
    @SerializedName("characters")
    val characters: List<CharactersItem>?,
    @SerializedName("spells")
    val spells: List<SpellsItem>?,
    @SerializedName("info")
    val info: List<InfoItem>?
)
