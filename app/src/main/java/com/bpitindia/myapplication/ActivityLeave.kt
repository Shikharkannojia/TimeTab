package com.bpitindia.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.bpitindia.myapplication.databinding.ActivityLeaveBinding
import com.bpitindia.myapplication.databinding.ActivityMainBinding



class ActivityLeave: AppCompatActivity() {
    private lateinit var binding: ActivityLeaveBinding
    //lateinit var resultbtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLeaveBinding.inflate(layoutInflater)
        setContentView(binding.root)

        val teachers = resources.getStringArray(R.array.teachers)
        val arrayAdapter = ArrayAdapter(this, R.layout.dropdown_item, teachers)
        binding.autoCompleteTextView.setAdapter(arrayAdapter)

        val day = resources.getStringArray(R.array.days)
        val arrayAdapterday = ArrayAdapter(this, R.layout.dropdown_item_day, day)
        binding.autoCompleteTextViewday.setAdapter(arrayAdapterday)

        val time = resources.getStringArray(R.array.time)
        val arrayAdaptertime = ArrayAdapter(this, R.layout.dropdown_item_time, time)
        binding.autoCompleteTextViewtime.setAdapter(arrayAdaptertime)

        binding.resultbtn.setOnClickListener {

          //  val intent = Intent(this, MainActivity::class.java)







            binding.result.text="Hello"
        }


    }
}