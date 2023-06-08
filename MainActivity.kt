package com.example.task

import android.support.v7.app.AppCompatActivity
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import android.widget.EditText
import android.widget.ListView
import android.widget.Toast
import com.example.task.R.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        var name =findViewById<EditText>(R.id.userName)
        val eng=findViewById<EditText>(R.id.eng)
        val math=findViewById<EditText>(R.id.math)
        val bio=findViewById<EditText>(R.id.bio)
        val phy=findViewById<EditText>(R.id.phy)
        val chem=findViewById<EditText>(R.id.chem)
        val submit=findViewById<Button>(R.id.btnSubmit)


        fun submitForm() {
            val name1 = name.text.toString()
            val mark1 = eng.text.toString().toInt()
            val mark2 = math.text.toString().toInt()
            val mark3 = bio.text.toString().toInt()
            val mark4 = phy.text.toString().toInt()
            val mark5 = chem.text.toString().toInt()
            val totmark = mark1 + mark2 + mark3 + mark4 + mark5
            val avg = totmark / 2
            val eligible = avg >= 60
            if (eligible) {
                Toast.makeText(this, "hey you are eligible", Toast.LENGTH_SHORT).show()
            } else {
                Toast.makeText(this, "oh noo you are not eligible", Toast.LENGTH_SHORT).show()

            }



    }
        submit.setOnClickListener {
            submitForm()
        }}
}




