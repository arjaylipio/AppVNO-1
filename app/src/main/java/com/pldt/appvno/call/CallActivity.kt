package com.pldt.appvno.call

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.pldt.appvno.R
import kotlinx.android.synthetic.main.activity_call.*

class CallActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_call)

        attachListener()
    }

    private fun attachListener() {
        img_back_call.setOnClickListener {
            finish()
        }
    }
}
