package com.example.tripleview

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.widget.Button
import androidx.core.view.isInvisible
import com.example.tripleview.databinding.ActivityMainBinding
//import kotlinx.android.synthetic.main.activity_main.*No me reconoce la libreria


class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        val binding = ActivityMainBinding.inflate(layoutInflater)
        setContentView(binding.root)


        val b1 = findViewById<Button>(R.id.b1)

        b1.setOnClickListener {

            b1.text = "Hola,"


        }
        /* b2.setOnClickListener{
            b2.text="¿qué"
        }
        En el video lo hace igual que yo, pero me da error
        */

        binding.b3.setOnClickListener {
            binding.b3.text = "tal?"

        }


    }
}