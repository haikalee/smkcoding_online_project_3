package com.haikal.project2.data.bnpb


import com.google.gson.annotations.SerializedName

data class Indonesia(
    @SerializedName("features")
    val features: List<Feature>,
    @SerializedName("fields")
    val fields: List<Field>,
    @SerializedName("geometryType")
    val geometryType: String,
    @SerializedName("globalIdFieldName")
    val globalIdFieldName: String,
    @SerializedName("objectIdFieldName")
    val objectIdFieldName: String,
    @SerializedName("spatialReference")
    val spatialReference: SpatialReference,
    @SerializedName("uniqueIdField")
    val uniqueIdField: UniqueIdField
)