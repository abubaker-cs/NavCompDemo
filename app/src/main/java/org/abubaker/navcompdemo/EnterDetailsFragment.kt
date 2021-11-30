package org.abubaker.navcompdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
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

            // Convert data to Strings
            val firstName = binding.etName.text.toString()
            val age = binding.etAge.text.toString()
            val mobile = binding.etMobile.text.toString()

            // Validate the data
            when {

                // firstName = Empty?
                firstName.isEmpty() -> {
                    Toast.makeText(activity, "Enter Name.", Toast.LENGTH_SHORT).show()
                }

                // firstName = Empty?
                age.isEmpty() -> {
                    Toast.makeText(activity, "Enter Your age.", Toast.LENGTH_SHORT).show()
                }

                // Mobile = Empty?
                mobile.isEmpty() -> {
                    Toast.makeText(activity, "Enter Mobile Number.", Toast.LENGTH_SHORT).show()
                }

                // Using the "bundle" pass on the data to the targeted Fragment
                else -> {

                    findNavController().navigate(
                        EnterDetailsFragmentDirections.actionEnterDetailsFragmentToVerifyDetailsFragment(
                            firstName, age.toLong(), mobile.toLong()
                        )
                    )


                    // *** Replace the bundle code with Safe Args.
                    // Pass them to verify details fragment using Bundle object.
                    // val bundle = bundleOf(
                    //    "name" to firstName,
                    //    "age" to age,
                    //    "mobile" to mobile.toLong()
                    // )

                    // Navigate using findNavController and the action id where we want to navigate.
                    // findNavController().navigate(
                    //    R.id.action_enterDetailsFragment_to_verifyDetailsFragment,
                    //    bundle
                    // )

                }
            }
        }

        // return root View
        return binding.root

    }
}