package com.example.paypad

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.navigation.NavController
import androidx.navigation.ui.setupActionBarWithNavController
import com.example.paypad.databinding.DialogFragmentMainBinding

class MainActivity : AppCompatActivity() {
    private lateinit var binding: DialogFragmentMainBinding
//    private lateinit var navController: NavController

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DialogFragmentMainBinding.inflate(layoutInflater)
        setContentView(binding.root)
//        setupActionBarWithNavController(navController)
        binding.payButton.setOnClickListener {
            val dialogFragment = listOf(PaymentSuccessfulDialogFragment(), PaymentUnsuccessfulDialogFragment()).random()
            dialogFragment.show(supportFragmentManager, "PaymentStatus")
        }
    }

    /*override fun onSupportNavigateUp(): Boolean {
        return navController.navigateUp() || super.onSupportNavigateUp()
    }*/


}