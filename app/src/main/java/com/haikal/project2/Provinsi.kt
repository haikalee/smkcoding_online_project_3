package com.haikal.project2

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import com.haikal.project2.data.Api
import com.haikal.project2.data.bnpb.Attributes
import com.haikal.project2.data.bnpb.Feature
import com.haikal.project2.rvadapter.CoronaProvinsiIndonesiaAdapter
import com.haikal.project2.util.dismissLoading
import com.haikal.project2.util.showLoading
import kotlinx.android.synthetic.main.activity_provinsi.*
import org.w3c.dom.Attr
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class Provinsi : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_provinsi)
        showLoading(this, sw_provinsi)
        fetchJson()
        supportActionBar?.setDisplayHomeAsUpEnabled(true)
    }

    private fun fetchJson() {
        val call: Call<List<Attributes>> = Api.servicesBnpb.getBnpbProvinsi()
        call.enqueue(object: Callback<List<Attributes>> {
            override fun onFailure(call: Call<List<Attributes>>, t: Throwable) {
                dismissLoading(sw_provinsi)
                print(t.printStackTrace())
            }
            override fun onResponse(call: Call<List<Attributes>>, response: Response<List<Attributes>>) {
                dismissLoading(sw_provinsi)
                showData(response.body()!!)
            }
        })
    }

    private fun showData(dataProvinsi: List<Attributes>) {
        rv_provinsi.apply {
            layoutManager = LinearLayoutManager(context)
            adapter = CoronaProvinsiIndonesiaAdapter(context, dataProvinsi)
        }
    }
}
