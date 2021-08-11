package com.example.paypad

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import androidx.fragment.app.Fragment
import com.example.paypad.databinding.DialogFragmentPaymentUnsuccessfulBinding


/**
 * A simple [Fragment] subclass.
 * Use the [PaymentUnsuccessfulDialogFragment.newInstance] factory method to
 * create an instance of this fragment.
 */
class PaymentUnsuccessfulDialogFragment : DialogFragment() {
    private var _binding: DialogFragmentPaymentUnsuccessfulBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        _binding = DialogFragmentPaymentUnsuccessfulBinding.inflate(inflater, container, false)
        binding.cancelButton.setOnClickListener { dismiss() }
        binding.tryAgainButton.setOnClickListener {
            Toast.makeText(activity, "An error occurred; try again", Toast.LENGTH_SHORT).show()
            dismiss()
        }
        return binding.root
    }


    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }
}