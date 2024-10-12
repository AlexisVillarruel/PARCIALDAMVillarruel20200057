package com.example.parcialdamvillarruel20200057.ui.gallery

import android.annotation.SuppressLint
import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.parcialdamvillarruel20200057.R
import com.example.parcialdamvillarruel20200057.databinding.FragmentGalleryBinding

class GalleryFragment : Fragment() {
    var arrSo = arrayOf("Globe Guard Insurance", "SAfeJourney Coverage", "Travel Shield PRotection", "VoyageSecure","WanderSure Travel Insurance")

    @SuppressLint("MissingInflatedId")
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_gallery, container, false)
        val lista : ListView = view.findViewById(R.id.lstSeguros)

        val adapter: Any?=
            ArrayAdapter<Any>(this.requireContext(), android.R.layout.simple_list_item_1, arrSo)
        lista.adapter = adapter as ArrayAdapter<*>?

        return view
    }

}