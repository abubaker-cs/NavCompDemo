package org.abubaker.navcompdemo

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.navArgs
import org.abubaker.navcompdemo.databinding.FragmentVerifyDetailsBinding

class VerifyDetailsFragment : Fragment() {

    // Create a global variable for the ViewBinding.
    private lateinit var binding: FragmentVerifyDetailsBinding

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {

        // Get the arguments first
        val args: VerifyDetailsFragmentArgs by navArgs()

        // Retrieve values from the recently received arguments (args)
        val name = args.name
        val age = args.age
        val mobile = args.mobile

        // arguments = returns the arguments supplied
        // getString() = Get the arguments from the bundle.
        // val name = arguments?.getString("name")
        // val age = arguments?.getString("age")
        // val mobileNumber = arguments?.getLong("mobile")

        // Initialize the mBinding variable.
        binding = FragmentVerifyDetailsBinding.inflate(inflater, container, false)

        binding.tvName.text = name
        binding.tvAge.text = age.toString()
        binding.tvMobileNumber.text = mobile.toString()

        // return root View
        return binding.root

    }

}