package com.haikal.project2.data.bnpb


import com.google.gson.annotations.SerializedName

data class SpatialReference(
    @SerializedName("latestWkid")
    val latestWkid: Int,
    @SerializedName("wkid")
    val wkid: Int
)