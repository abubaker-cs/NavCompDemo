package org.abubaker.navcompdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Button
import android.widget.EditText
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController

class EnterDetailsFragment : Fragment() {

    /**
     * onCreateView()
     */
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {

        // Inflate the layout for this fragment
        val rootView = inflater.inflate(R.layout.fragment_enter_details, container, false)

        // Map all the XML components using findViewById.
        val etName = rootView.findViewById<EditText>(R.id.et_name)
        val etMobileNumber = rootView.findViewById<EditText>(R.id.et_mobile)

        // Assign the click event to the Verify Details button.
        val btnVerifyDetails = rootView.findViewById<Button>(R.id.btn_verify_details)

        // onClick Event for the Button: Verify Details
        btnVerifyDetails.setOnClickListener {

            // TODO Step 4: Validate the data and pass them to verify details fragment using Bundle object.
            // START

            val firstName = etName.text.toString()
            val mobile = etMobileNumber.text.toString()

            when {
                firstName.isEmpty() -> {
                    Toast.makeText(activity, "Enter Name.", Toast.LENGTH_SHORT).show()
                }
                mobile.isEmpty() -> {
                    Toast.makeText(activity, "Enter Mobile Number.", Toast.LENGTH_SHORT).show()
                }
                else -> {

                    val bundle = bundleOf(
                        "name" to firstName,
                        "mobile" to mobile.toLong()
                    )

                    // Navigate using findNavController and the action id where we want to navigate.
                    findNavController().navigate(
                        R.id.action_enterDetailsFragment_to_verifyDetailsFragment,
                        bundle
                    )
                }
            }
        }

        //
        return rootView

    }
}