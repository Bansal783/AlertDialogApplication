package com.tanu.myapplication

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AlertDialog

class MainActivity : AppCompatActivity() {
    lateinit var tvzero: TextView
    lateinit var Showaleart:Button
    var num=0
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        tvzero=findViewById(R.id.tvzero)
        Showaleart=findViewById(R.id.Showaleart)
        tvzero.setText(num.toString())
        Showaleart.setOnClickListener {
            AlertDialog.Builder(this)
                .setTitle("Class Activity")
                .setMessage("click here.......")
                .setPositiveButton("okay"){_, _ ->
                    num=num+2
                    tvzero.setText(num.toString())
                    Toast.makeText(this,"Add to a number",Toast.LENGTH_SHORT).show()

                }
                .setNegativeButton("Not"){_, _ ->
                    num=num-2
                    tvzero.setText(num.toString())
                    Toast.makeText(this,"subtract to a number",Toast.LENGTH_SHORT).show()
                }
                .setNeutralButton("close") {_, _ ->
                    num=0
                    tvzero.setText(num.toString())
                    Toast.makeText(this,"close screen",Toast.LENGTH_SHORT).show()
                }
                .show()
        }
    }
}