package org.abubaker.navcompdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import androidx.fragment.app.Fragment

class EnterDetailsFragment : Fragment() {

    /**
     * onCreateView()
     */
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        // return inflater.inflate(R.layout.fragment_enter_details, container, false)

        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_enter_details, container, false)

        // Assign the click event to the Verify Details button.
        val btnVerifyDetails = rootView.findViewById<Button>(R.id.btn_verify_details)

        btnVerifyDetails.setOnClickListener {

            // Navigate using findNavController and the action id where we want to navigate.
            // findNavController().navigate(R.id.action_enterDetailsFragment_to_verifyDetailsFragment)
        }

        return rootView

    }
}