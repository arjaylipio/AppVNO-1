package com.pldt.appvno.call


import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup

import com.pldt.appvno.R

/**
 * A simple [Fragment] subclass.
 */
class ContactFragment : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_contact, container, false)
    }
    companion object {

        fun newInstance() = ContactFragment()
    }

}
