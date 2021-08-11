package com.example.paypad

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import com.example.paypad.databinding.DialogFragmentPaymentSuccessfulBinding

/**
 * A simple [Fragment] subclass.
 * Use the [PaymentSuccessfulDialogFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PaymentSuccessfulDialogFragment : DialogFragment() {
    private var _binding: DialogFragmentPaymentSuccessfulBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = DialogFragmentPaymentSuccessfulBinding.inflate(inflater, container, false)
        binding.cancelButton.setOnClickListener { dismiss() }
        binding.okButton.setOnClickListener {
            Toast.makeText(activity, "Thank you for using our platform", Toast.LENGTH_SHORT).show()
            dismiss()
        }
        return binding.root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}