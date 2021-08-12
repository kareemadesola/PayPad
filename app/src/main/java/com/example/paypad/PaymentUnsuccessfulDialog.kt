package com.example.paypad

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.fragment.app.DialogFragment
import androidx.navigation.fragment.findNavController
import com.example.paypad.databinding.DialogPaymentSuccessfulBinding
import com.example.paypad.databinding.DialogPaymentUnsuccessfulBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class PaymentUnsuccessfulDialog : DialogFragment(){
    private lateinit var binding: DialogPaymentUnsuccessfulBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DialogPaymentUnsuccessfulBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        binding.cancelButton.setOnClickListener {
            dismiss()
        }
        binding.tryAgain.setOnClickListener {
            dismiss() }
    }

}