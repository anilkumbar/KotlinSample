package com.example.kotlinsample

import android.content.Intent
import android.os.Bundle
import android.widget.Toast
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import com.example.kotlinsample.databinding.ActivityMainBinding

class MainActivity : AppCompatActivity() { private lateinit var binding: ActivityMainBinding
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContentView(R.layout.activity_main)
        binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)

        binding.addButton.setOnClickListener {
            if(binding.inputOne.text.toString() != "" && binding.inputTwo.text.toString() != "")
            {
                val inputOne = binding.inputOne.text.toString().toInt();
                val inputSecond = binding.inputTwo.text.toString().toInt();

                val sum = inputOne + inputSecond
                val text = "The Sum is : $sum"
                Toast.makeText(this, "The sum is : $text", Toast.LENGTH_LONG).show()
                binding.sumText.text = text
            }
        }

        binding.nextButton.setOnClickListener{
            startActivity(Intent(applicationContext,SecondActivity::class.java))

        }
    }
}