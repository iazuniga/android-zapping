package com.iz.appzapping

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.TextView

class ResultActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_result)

        val btnBack:Button=findViewById(R.id.btnBack)
        btnBack.setOnClickListener { onBackPressed() }

        getAndShowName()
    }

    fun getAndShowName(){
        val bundle = intent.extras
        val name = bundle?.get("INTENT_NAME")
        //tvGreeting.text = "Hi $name"
        val tvGreeting: TextView =findViewById(R.id.tvGreeting)
        tvGreeting.text = "Hi $name"
    }
}