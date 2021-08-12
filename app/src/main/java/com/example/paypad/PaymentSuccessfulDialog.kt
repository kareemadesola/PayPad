package com.example.paypad

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.fragment.app.DialogFragment
import androidx.navigation.fragment.findNavController
import com.example.paypad.databinding.DialogPaymentSuccessfulBinding
import com.google.android.material.bottomsheet.BottomSheetDialogFragment

class PaymentSuccessfulDialog : DialogFragment(){
    private lateinit var binding: DialogPaymentSuccessfulBinding
    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View {
        binding = DialogPaymentSuccessfulBinding.inflate(inflater, container, false)
        return binding.root
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {

        binding.okButton.setOnClickListener {
            Toast.makeText(context, "Thank you for using our platform", Toast.LENGTH_SHORT).show()
            dismiss()
        }
    }


}