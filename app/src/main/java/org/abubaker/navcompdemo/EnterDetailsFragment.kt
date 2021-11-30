package org.abubaker.navcompdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.core.os.bundleOf
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import org.abubaker.navcompdemo.databinding.FragmentEnterDetailsBinding

class EnterDetailsFragment : Fragment() {

    // Create a global variable for the ViewBinding.
    private lateinit var binding: FragmentEnterDetailsBinding

    /**
     * onCreateView()
     */
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        // Initialize the mBinding variable.
        binding = FragmentEnterDetailsBinding.inflate(inflater, container, false)

        // onClick Event for the Button: Verify Details
        binding.btnVerifyDetails.setOnClickListener {

            // Validate the data and pass them to verify details fragment using Bundle object.
            val firstName = binding.etName.text.toString()
            val mobile = binding.etMobile.text.toString()

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

        // return root View
        return binding.root

    }
}