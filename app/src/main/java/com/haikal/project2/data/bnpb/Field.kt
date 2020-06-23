package com.haikal.project2.data.bnpb


import com.google.gson.annotations.SerializedName

data class Field(
    @SerializedName("alias")
    val alias: String,
    @SerializedName("defaultValue")
    val defaultValue: Any,
    @SerializedName("domain")
    val domain: Any,
    @SerializedName("length")
    val length: Int,
    @SerializedName("name")
    val name: String,
    @SerializedName("sqlType")
    val sqlType: String,
    @SerializedName("type")
    val type: String
)