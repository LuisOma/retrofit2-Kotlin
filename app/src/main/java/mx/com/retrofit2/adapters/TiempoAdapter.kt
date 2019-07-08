package mx.com.retrofit2.adapters

import android.support.v7.widget.RecyclerView
import android.util.Log
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import kotlinx.android.synthetic.main.list_item_tiempo.view.*
import mx.com.retrofit2.R
import mx.com.retrofit2.data.model.Tiempo
import java.text.SimpleDateFormat
import java.util.*


class TiempoAdapter (val metereologia: ArrayList<Tiempo>): RecyclerView.Adapter<TiempoAdapter.TiempoViewHolder>() {
    override fun onBindViewHolder(holder: TiempoViewHolder, position: Int) {
        var itemTiempo = metereologia[position]
        holder.bindTiempo(itemTiempo)
    }

    override fun getItemCount(): Int {
        return metereologia.size
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TiempoViewHolder {
       var layoutInflate = LayoutInflater.from(parent.context)
               .inflate(R.layout.list_item_tiempo, parent, false)

        return TiempoAdapter.TiempoViewHolder(layoutInflate)
    }


    class TiempoViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){
        fun bindTiempo(tiempo: Tiempo){
            var date = Date(tiempo.dt.toLong()*1000)
            var sdf = SimpleDateFormat("yyyy-MM-dd HH:mm:ss")
            var tiempo1 = sdf.format(date)
            Log.d ("TAG TiempoAdapter: ", tiempo1)

            itemView.litFecha.text = tiempo1
            itemView.litHumedad.text = tiempo.main.humidity
            itemView.litTemperatura.text = tiempo.main.temp
        }
    }
}
