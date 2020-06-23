package com.haikal.project2.data.bnpb


import com.google.gson.annotations.SerializedName

data class Feature(
    @SerializedName("attributes")
    val attributes: Attributes,
    @SerializedName("geometry")
    val geometry: Geometry
)