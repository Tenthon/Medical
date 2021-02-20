package com.medical.medical.view.activity.base_activity.ui.home

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.lifecycle.ViewModelProvider
import com.medical.medical.R
import com.medical.medical.base.BaseFragment
import com.medical.medical.view.activity.nitrous_oxide.NitrousActivity
import com.medical.medical.view.activity.oxygen.OxygenActivity
import kotlinx.android.synthetic.main.fragment_home.*

class HomeFragment : BaseFragment() {
    private var views: View? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

    }

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ) =
        // Inflate the layout for this fragment
        inflater.inflate(R.layout.fragment_home, container, false)

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        views = view
        cardOxygen.setOnClickListener {
            goto(OxygenActivity::class.java)
        }

        cardNitrous.setOnClickListener {
            goto(NitrousActivity::class.java)
        }
    }
}