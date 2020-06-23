package com.haikal.project2.data.bnpb


import com.google.gson.annotations.SerializedName

data class Geometry(
    @SerializedName("x")
    val x: Double,
    @SerializedName("y")
    val y: Double
)