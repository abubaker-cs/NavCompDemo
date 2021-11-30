package org.abubaker.navcompdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.fragment.app.Fragment


class VerifyDetailsFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Get the arguments from the bundle.
        val name = arguments?.getString("name")
        val mobileNumber = arguments?.getLong("mobile")

        // Map the XML components and assign the values to it.
        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_verify_details, container, false)

        val tvName = rootView.findViewById<TextView>(R.id.tv_name)
        val tvMobileNumber = rootView.findViewById<TextView>(R.id.tv_mobile_number)

        tvName.text = name
        tvMobileNumber.text = mobileNumber.toString()

        return rootView

        // Inflate the layout for this fragment
        // return inflater.inflate(R.layout.fragment_verify_details, container, false)
    }


}