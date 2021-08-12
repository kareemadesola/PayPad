package com.example.paypad

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import androidx.navigation.fragment.findNavController
import com.example.paypad.databinding.FragmentMainBinding


/**
 * A simple [Fragment] subclass.
 * Use the [MainFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class MainFragment : Fragment() {
    private var _binding: FragmentMainBinding? = null
    private val binding get() = _binding!!

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
//        setHasOptionsMenu(true)
    }
    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentMainBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.payButton.setOnClickListener { confirmPayment() }
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

    /**
     * takes you to a success or failure page depending on whether payment is confirmed
     */
    private fun confirmPayment() {
        val action = listOf(
            MainFragmentDirections.actionMainFragmentToPaymentSuccessfulDialog(),
            MainFragmentDirections.actionMainFragmentToPaymentUnsuccessfulDialog()
        ).random()
        findNavController().navigate(action)
//        val intent = Intent(context, listOf(PaymentSuccessfulFragment::class.java,PaymentUnsuccessfulFragment::class.java).random())
//        startActivity(intent)

    }
}