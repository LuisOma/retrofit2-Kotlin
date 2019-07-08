package mx.com.retrofit2.data.api

import mx.com.retrofit2.data.model.Metereologia
import retrofit2.Call
import retrofit2.http.GET


interface ApiTiempo {

    @GET("data/2.5/forecast?id=524901&appid=b1b15e88fa797225412429c1c50c122a1")
    abstract fun getTiempo(): Call<Metereologia>
}
