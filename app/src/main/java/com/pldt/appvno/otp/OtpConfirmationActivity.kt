package com.pldt.appvno.otp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.EditText
import android.widget.Toast
import com.pldt.appvno.R
import com.pldt.appvno.profile.InputProfileActivity
import kotlinx.android.synthetic.main.activity_otp_confirmation.*
import org.jetbrains.anko.startActivity

class OtpConfirmationActivity : AppCompatActivity() {


    var otpCode = ""
    var inputBoxes = mutableListOf<EditText>()


    private var formattedNumber : String? = null

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_otp_confirmation)


        setupEditText()
        attachListener()
    }

    private fun attachListener() {
        btn_submit_otpConfirmation.setOnClickListener{
            // TODO -  open new activity
            startActivity<InputProfileActivity>()
        }

        tv_resend_otpConfirmation.setOnClickListener {
            Toast.makeText(this, "Resending OTP", Toast.LENGTH_SHORT).show()
        }

        tv_wrong_otpConfirmation.setOnClickListener {
            finish()
        }

        img_back_otpConfirmation.setOnClickListener {
            finish()
        }
    }


    private fun setupEditText() {
        formattedNumber =  intent.getStringExtra("CONFIRM_NUMBER")
        tv_title_otpConfirmation.text  = "This is your number $formattedNumber"
//
//        inputBoxes.add(edt_number_1_otpConfirmation)
//        inputBoxes.add(edt_number_2_otpConfirmation)
//        inputBoxes.add(edt_number_3_otpConfirmation)
//        inputBoxes.add(edt_number_4_otpConfirmation)
//        inputBoxes.add(edt_number_5_otpConfirmation)
//        inputBoxes.add(edt_number_6_otpConfirmation)
//
//
//        inputBoxes[1].setOnFocusChangeListener { v, hasFocus ->
//            if (hasFocus) {
//                if (otpCode.isEmpty()){
//                    inputBoxes[0].requestFocus()
//                }
//            }
//        }
    }
}

