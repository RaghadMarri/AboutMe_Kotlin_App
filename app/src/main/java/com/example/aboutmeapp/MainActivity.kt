package com.example.aboutmeapp

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.provider.ContactsContract
import android.view.View
import android.widget.Button
import android.widget.EditText
import android.widget.TextView
import androidx.core.view.isInvisible
import androidx.databinding.DataBindingUtil
import com.example.aboutmeapp.databinding.ActivityMainBinding
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {

    private lateinit var binding: ActivityMainBinding
    private val myName: Myname = Myname("Aleks Haecky")
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = DataBindingUtil.setContentView(this, R.layout.activity_main)
        binding.myName = myName


        binding.buttonDone.setOnClickListener {
            displayNickname(it)
        }

    }

    private fun displayNickname(view: View) {
        myName?.nickName = editText.text.toString()
        binding.apply {
            invalidateAll()
            buttonDone.visibility = View.GONE
            editText.visibility = View.GONE
            displayNickname.visibility = View.VISIBLE
        }

    }
}
