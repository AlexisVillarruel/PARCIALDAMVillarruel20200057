package com.example.parcialdamvillarruel20200057.ui.slideshow

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.TextView
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.example.parcialdamvillarruel20200057.R
import com.example.parcialdamvillarruel20200057.databinding.FragmentSlideshowBinding

class SlideshowFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        val view: View = inflater.inflate(R.layout.fragment_slideshow, container, false)

        val cvuelo: TextView = view.findViewById(R.id.etcosto)
        val caloj: TextView = view.findViewById(R.id.etCostoAloj)
        val ccantn : TextView = view.findViewById(R.id.etCantNoches)
        val ccomida: TextView = view.findViewById(R.id.etCostoComidas)
        val btnCalcular: Button = view.findViewById(R.id.btncalcular)
        val presu: TextView = view.findViewById(R.id.etPres)
        btnCalcular.setOnClickListener{
            val vuelo: String = cvuelo.text.toString()
            val aloj: String = caloj.text.toString()
            val noches: String = ccantn.text.toString()
            val comidas: String = ccomida.text.toString()
            presu.text= (vuelo.toFloat() + (aloj.toFloat() * noches.toFloat()) + (comidas.toFloat()*noches.toFloat())).toString() + " USD"

        }
        return view
    }
}