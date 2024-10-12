package com.example.parcialdamvillarruel20200057.ui.home

import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.example.parcialdamvillarruel20200057.Login
import com.example.parcialdamvillarruel20200057.R
import com.example.parcialdamvillarruel20200057.databinding.FragmentHomeBinding
import com.example.parcialdamvillarruel20200057.ui.adapter.ItemAdapter
import com.example.parcialdamvillarruel20200057.ui.model.exmModel

class HomeFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view = inflater.inflate(R.layout.fragment_home, container, false)

        val rvrecycle : RecyclerView = view.findViewById(R.id.rvRecycle)
        rvrecycle.layoutManager = LinearLayoutManager(requireContext())
        rvrecycle.adapter = ItemAdapter(getItem())

        return view
    }

    private fun getItem(): List<exmModel>{
        val itemlist: ArrayList<exmModel> = ArrayList()
        itemlist.add(
            exmModel(1,R.drawable.hotel,"Skyline Hotel","123 New York, USA","4.5 de 5 ( 1995 opiniones)",98 ))
        itemlist.add(
            exmModel(2,R.drawable.hotelcancun,"Oceanview","456 MIAMI, USA","4.2 de 5 ( 1995 opiniones)",90))
        itemlist.add(
            exmModel(3,R.drawable.hoteleuropa,"Oceanview","456 MIAMI, USA","3.2 de 5 ( 1995 opiniones)",50))
        itemlist.add(
            exmModel(3,R.drawable.hotelperu,"Oceanview","456 MIAMI, USA","4.8 de 5 ( 1995 opiniones)",80))
        return itemlist
    }
}