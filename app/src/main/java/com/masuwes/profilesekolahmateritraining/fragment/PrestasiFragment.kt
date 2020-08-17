package com.masuwes.profilesekolahmateritraining.fragment

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import android.view.LayoutInflater
import android.view.MenuItem
import android.view.View
import android.view.ViewGroup
import android.widget.AdapterView
import android.widget.ArrayAdapter
import android.widget.Spinner
import android.widget.Toast
import androidx.fragment.app.Fragment
import androidx.recyclerview.widget.LinearLayoutManager
import com.alespero.expandablecardview.ExpandableCardView
import com.masuwes.profilesekolahmateritraining.R
import kotlinx.android.synthetic.main.fragment_prestasi.*


// TODO: Rename parameter arguments, choose names that match

class PrestasiFragment : Fragment() {

//    private var spinnerInter: Spinner? = null
//    private var spinnerNas: Spinner? = null

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?): View? {
        return inflater.inflate(R.layout.fragment_prestasi, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

//        val card : ExpandableCardView = findViewById(R.id.profile)
        val card = spinner_internasional

        card.setOnExpandedListener { _, isExpanded ->
            Toast.makeText(context, if(isExpanded) "Expanded!" else "Collapsed!", Toast.LENGTH_SHORT).show()
        }

////        spinnerInter?.onItemSelectedListener
//        spinnerInter = view.findViewById(R.id.spinner_internasional)
//        spinnerNas = view.findViewById(R.id.spinner_nasional)
//        spinnerInter?.onItemSelectedListener
//        spinnerNas?.onItemSelectedListener
//
//        context?.let {
//            ArrayAdapter.createFromResource(it,
//                R.array.isi_spinner,
//                android.R.layout.simple_list_item_1
//            ).also { adapter ->
//                adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item)
//                spinnerInter?.adapter = adapter
//            }
//        }

    }

}




//    override fun onViewCreate(savedInstanceState: Bundle?) {
//        super.onCreate(savedInstanceState)
//
//        val spinner : Spinner = spinner_internasional
//        ArrayAdapter.createFromResource(this., R.array.isi_spinner, android.R.layout.simple_list_item_1).also { adapter->
//            adapter.setDropDownViewResource(R.layout.support_simple_spinner_dropdown_item)
//            spinner.adapter = adapter
//
//
//        val v: View = inflater.inflate(R.layout.fragm, container, false)
//
//
//        }
//    }

//    override fun onCreateView(
//        inflater: LayoutInflater, container: ViewGroup?,
//        savedInstanceState: Bundle?
//    ): View? {
//        // Inflate the layout for this fragment
//        return inflater.inflate(R.layout.fragment_prestasi, container, false)
//    }

