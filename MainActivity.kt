package com.iz.appzapping

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.EditText
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val btnCk:Button=findViewById(R.id.bnShowName2)
        btnCk.setOnClickListener { CkBotonN() }
    }

    private fun CkBotonN() {
        val cName:EditText=findViewById(R.id.etName)
        val cNamet:String=cName.text.toString()
        if(cNamet.isNotEmpty()){
            val intent = Intent(this, ResultActivity::class.java)
            intent.putExtra("INTENT_NAME", cName.text)
            startActivity(intent)

        } else {
            sErrorName()
        }
    }
    fun sErrorName(){
        Toast.makeText(this, "El Nombre no puede ser vacio", Toast.LENGTH_LONG).show()
    }
}