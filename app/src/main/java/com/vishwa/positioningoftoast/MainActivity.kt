package com.vishwa.positioningoftoast

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Gravity
import android.widget.Button
import android.widget.Toast

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        val top=findViewById<Button>(R.id.Top)as Button
        val bottom=findViewById<Button>(R.id.Buttom)as Button
        val center=findViewById<Button>(R.id.Center)as Button
        val left=findViewById<Button>(R.id.Left)as Button
        val right=findViewById<Button>(R.id.Right)as Button
        val topleft=findViewById<Button>(R.id.TopLeft)as Button
        top.setOnClickListener {
            val toast=Toast.makeText(this@MainActivity,"Toast.Gravity.TOP",Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.TOP,0,0)
            toast.show()
        }
        bottom.setOnClickListener {
            val toast=Toast.makeText(this@MainActivity,"Toast.Gravity.BOTTOM",Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.BOTTOM,0,0)
            toast.show()
        }
        center.setOnClickListener {
            val toast=Toast.makeText(this@MainActivity,"Toast.Gravity.CENTER",Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.CENTER,0,0)
            toast.show()
        }
        left.setOnClickListener {
            val toast=Toast.makeText(this@MainActivity,"Toast.Gravity.LEFT",Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.LEFT,0,0)
            toast.show()
        }
        right.setOnClickListener {
            val toast=Toast.makeText(this@MainActivity,"Toast.Gravity.RIGHT",Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.RIGHT,0,0)
            toast.show()
        }
        topleft.setOnClickListener {
            val toast=Toast.makeText(this@MainActivity,"Toast.Gravity.TOPLEFT",Toast.LENGTH_SHORT)
            toast.setGravity(Gravity.TOP or Gravity.LEFT,0,0)
            toast.show()
        }

    }
}