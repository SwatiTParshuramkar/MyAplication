package com.example.android.myapplication.Fragment

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment
import com.example.android.myapplication.R

class SecondFragment: Fragment() {

    lateinit var btnProceed: Button

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        val view = inflater.inflate(R.layout.activity_second_fragment, container, false)
//        val display: TextView = view.findViewById(R.id.display)
//        val args = this.arguments
//
//        val inputData = args?.get("Welcome")
//        display.text = "Welcome  " + inputData.toString()

        btnProceed = view.findViewById(R.id.btnProceed)

        btnProceed.setOnClickListener {
            val thirdFragment = ThirdFragment()
            fragmentManager?.beginTransaction()?.replace(R.id.container, thirdFragment)?.commit()
        }
        return view
    }
}