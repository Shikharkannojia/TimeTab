package com.bpitindia.myapplication

import android.graphics.Color
import android.os.Bundle
import android.util.Log
import android.view.View
import android.widget.ArrayAdapter
import android.widget.ListView
import android.widget.TextView
import android.widget.Toast
import androidx.appcompat.app.AppCompatActivity
import com.bpitindia.myapplication.ui.ui.fragments.*
import java.time.LocalDate


class TimeTable : AppCompatActivity() {
    private lateinit var monday: TextView
    private lateinit var tuesday: TextView
    private lateinit var wednesday: TextView
    private lateinit var thursday: TextView
    private lateinit var friday: TextView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_time_table)

        monday = findViewById(R.id.monday)
        tuesday = findViewById(R.id.tuesday)
        wednesday = findViewById(R.id.wednesday)
        thursday = findViewById(R.id.thursday)
        friday = findViewById(R.id.friday)


        val today = "Today is ${LocalDate.now().dayOfWeek.name}!!! The ${LocalDate.now().dayOfWeek.value}th day"

        Log.d("d/tag", today)

        Toast.makeText(this, today, Toast.LENGTH_SHORT).show()


        if (savedInstanceState == null) {
            //put a switch statement here to open the fragment of the day it is today in place
            //1 - monday.....................6 - saturday
            when(LocalDate.now().dayOfWeek.value) {
                2 -> {
                    monday.setTextColor(Color.parseColor("#009688"))
                    tuesday.setTextColor(Color.BLACK)
                    wednesday.setTextColor(Color.parseColor("#009688"))
                    thursday.setTextColor(Color.parseColor("#009688"))
                    friday.setTextColor(Color.parseColor("#009688"))

                    supportFragmentManager.beginTransaction().replace(R.id.frame, Tuesday()).commit()
                }

                3 -> {
                    monday.setTextColor(Color.parseColor("#009688"))
                    wednesday.setTextColor(Color.BLACK)
                    tuesday.setTextColor(Color.parseColor("#009688"))
                    thursday.setTextColor(Color.parseColor("#009688"))
                    friday.setTextColor(Color.parseColor("#009688"))

                    supportFragmentManager.beginTransaction().replace(R.id.frame, Wednesday()).commit()
                }

                4 -> {
                    monday.setTextColor(Color.parseColor("#009688"))
                    thursday.setTextColor(Color.BLACK)
                    wednesday.setTextColor(Color.parseColor("#009688"))
                    tuesday.setTextColor(Color.parseColor("#009688"))
                    friday.setTextColor(Color.parseColor("#009688"))

                    supportFragmentManager.beginTransaction().replace(R.id.frame, Thursday()).commit()
                }

                5 -> {
                    monday.setTextColor(Color.parseColor("#009688"))
                    friday.setTextColor(Color.BLACK)
                    wednesday.setTextColor(Color.parseColor("#009688"))
                    thursday.setTextColor(Color.parseColor("#009688"))
                    tuesday.setTextColor(Color.parseColor("#009688"))

                    supportFragmentManager.beginTransaction().replace(R.id.frame, Friday()).commit()
                }

                else -> {
                    tuesday.setTextColor(Color.parseColor("#009688"))
                    monday.setTextColor(Color.BLACK)
                    wednesday.setTextColor(Color.parseColor("#009688"))
                    thursday.setTextColor(Color.parseColor("#009688"))
                    friday.setTextColor(Color.parseColor("#009688"))

                    supportFragmentManager.beginTransaction().replace(R.id.frame, Monday()).commit()
                }
            }
        }

        monday.setOnClickListener {
            monday.setTextColor(Color.BLACK)
            tuesday.setTextColor(Color.parseColor("#009688"))
            wednesday.setTextColor(Color.parseColor("#009688"))
            thursday.setTextColor(Color.parseColor("#009688"))
            friday.setTextColor(Color.parseColor("#009688"))

            supportFragmentManager.beginTransaction()
                .replace(R.id.frame, Monday()).commit()
        }

        tuesday.setOnClickListener {
            monday.setTextColor(Color.parseColor("#009688"))
            tuesday.setTextColor(Color.BLACK)
            wednesday.setTextColor(Color.parseColor("#009688"))
            thursday.setTextColor(Color.parseColor("#009688"))
            friday.setTextColor(Color.parseColor("#009688"))

            supportFragmentManager.beginTransaction()
                .replace(R.id.frame, Tuesday()).commit()
        }
        wednesday.setOnClickListener {
            monday.setTextColor(Color.parseColor("#009688"))
            tuesday.setTextColor(Color.parseColor("#009688"))
            wednesday.setTextColor(Color.BLACK)
            thursday.setTextColor(Color.parseColor("#009688"))
            friday.setTextColor(Color.parseColor("#009688"))

            supportFragmentManager.beginTransaction()
                .replace(R.id.frame, Wednesday()).commit()
        }
        thursday.setOnClickListener {
            monday.setTextColor(Color.parseColor("#009688"))
            tuesday.setTextColor(Color.parseColor("#009688"))
            wednesday.setTextColor(Color.parseColor("#009688"))
            thursday.setTextColor(Color.BLACK)
            friday.setTextColor(Color.parseColor("#009688"))

            supportFragmentManager.beginTransaction()
                .replace(R.id.frame, Thursday()).commit()
        }
        friday.setOnClickListener {
            monday.setTextColor(Color.parseColor("#009688"))
            tuesday.setTextColor(Color.parseColor("#009688"))
            wednesday.setTextColor(Color.parseColor("#009688"))
            thursday.setTextColor(Color.parseColor("#009688"))
            friday.setTextColor(Color.BLACK)

            supportFragmentManager.beginTransaction()
                .replace(R.id.frame, Friday()).commit()
        }
    }
}