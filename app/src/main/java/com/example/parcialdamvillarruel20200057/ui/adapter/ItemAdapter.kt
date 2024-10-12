package com.example.parcialdamvillarruel20200057.ui.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.example.parcialdamvillarruel20200057.R
import com.example.parcialdamvillarruel20200057.ui.model.exmModel

class ItemAdapter(private var lstitem: List<exmModel>):
    RecyclerView.Adapter<ItemAdapter.ViewHolder>() {
    class ViewHolder(itemView: View): RecyclerView.ViewHolder(itemView){

        val ivitem : ImageView = itemView.findViewById(R.id.ivitem)
        val tvtittle : TextView = itemView.findViewById(R.id.tvnombre)
        val tvdescripcion : TextView = itemView.findViewById(R.id.tvdireccion)
        val tvpuntuacion : TextView = itemView.findViewById(R.id.tvpuntuacion)
        val tvprecio : TextView = itemView.findViewById(R.id.tvprecio)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): ViewHolder {
        val layoutInflater = LayoutInflater.from(parent.context)
        return ViewHolder(layoutInflater.inflate(R.layout.item, parent, false))
    }

    override fun getItemCount(): Int {
        return lstitem.size
    }
    override fun onBindViewHolder(holder: ViewHolder, position: Int) {
        val item = lstitem[position]
        holder.ivitem.setImageResource(item.image)
        holder.tvtittle.text = item.title
        holder.tvdescripcion.text = item.description
        holder.tvpuntuacion.text = item.puntuacion
        holder.tvprecio.text = item.precio.toString()
    }
}