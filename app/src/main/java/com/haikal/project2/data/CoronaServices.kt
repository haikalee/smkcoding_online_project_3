package com.haikal.project2.data

import com.haikal.project2.data.bnpb.Attributes
import com.haikal.project2.data.bnpb.Feature
import com.haikal.project2.data.mathdro.indonesia.Indonesia
import com.haikal.project2.data.mathdro.global.GlobalDataItem
import com.haikal.project2.data.mathdro.global.GlobalDetail
import retrofit2.Call
import retrofit2.http.GET

interface CoronaServices {
    @GET("confirmed")
    fun getMathdroDataGlobal(): Call<List<GlobalDataItem>>

    @GET("https://covid19.mathdro.id/api/")
    fun getMathdroGlobal(): Call<GlobalDetail>

    @GET("countries/indonesia")
    fun getMathdroIndonesia(): Call<Indonesia>

    @GET("https://services5.arcgis.com/VS6HdKS0VfIhv8Ct/arcgis/rest/services/COVID19_Indonesia_per_Provinsi/FeatureServer/0/query?where=1%3D1&outFields=*&outSR=4326&f=json")
    fun getBnpbProvinsi(): Call<List<Attributes>>
}