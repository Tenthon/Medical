package com.medical.medical.model


import com.google.gson.annotations.SerializedName

data class Resppnse(

    @field:SerializedName("message")
    val message: String? = null,

    @field:SerializedName("status")
    val status: Int? = null
)
