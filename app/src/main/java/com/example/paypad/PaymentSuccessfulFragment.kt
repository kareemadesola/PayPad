package com.example.paypad

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.Fragment
import com.example.paypad.databinding.FragmentPaymentSuccessfulBinding

/**
 * A simple [Fragment] subclass.
 * Use the [PaymentSuccessfulFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PaymentSuccessfulFragment : Fragment() {
    private var _binding: FragmentPaymentSuccessfulBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = FragmentPaymentSuccessfulBinding.inflate(inflater, container, false)
        return binding.root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}