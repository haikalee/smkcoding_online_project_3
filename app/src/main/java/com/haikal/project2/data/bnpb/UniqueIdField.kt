package com.haikal.project2.data.bnpb


import com.google.gson.annotations.SerializedName

data class UniqueIdField(
    @SerializedName("isSystemMaintained")
    val isSystemMaintained: Boolean,
    @SerializedName("name")
    val name: String
)