package com.example.custombutton

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.core.content.ContextCompat
import com.example.custombutton.CustomButton

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        val button1 = findViewById<CustomButton>(R.id.customButton)
        val button2 = findViewById<CustomButton>(R.id.customButton2)
        val button3 = findViewById<CustomButton>(R.id.customButton3)
        val button4 = findViewById<CustomButton>(R.id.customButton4)
        val button5 = findViewById<CustomButton>(R.id.customButton5)

        button1.text = "Disabled Button"
        button1.setTextColor(ContextCompat.getColor(this, R.color.white))
        button1.setCornerRadius(20f)
        button1.setButtonBackgroundColor(ContextCompat.getColor(this, R.color.color_five))

        button2.text = "Pressed Button"
        button2.setTextColor(ContextCompat.getColor(this, R.color.white))
        button2.setCornerRadius(20f)
        button2.setButtonBackgroundColor(ContextCompat.getColor(this, R.color.color_one))

        button3.text = "Focused Button"
        button3.setTextColor(ContextCompat.getColor(this, R.color.white))
        button3.setCornerRadius(20f)
        button3.setButtonBackgroundColor(ContextCompat.getColor(this, R.color.color_two))

        button4.text = "Hovered Button"
        button4.setTextColor(ContextCompat.getColor(this, R.color.white))
        button4.setCornerRadius(20f)
        button4.setButtonBackgroundColor(ContextCompat.getColor(this, R.color.color_three))


        button5.text = "Enabled Button"
        button5.setTextColor(ContextCompat.getColor(this, R.color.white))
        button5.setCornerRadius(20f)
        button5.setButtonBackgroundColor(ContextCompat.getColor(this, R.color.color_four))


    }
}