package com.bpitindia.myapplication.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Switch
import android.widget.Toast
import androidx.recyclerview.widget.RecyclerView
import com.bpitindia.myapplication.R
import com.bpitindia.myapplication.entity.Teacher
import com.google.android.material.switchmaterial.SwitchMaterial

class TeacherAvailabilityAdapter(val context: Context, private val teacherSet : List<Teacher>
): RecyclerView.Adapter<TeacherAvailabilityAdapter.TeacherViewHolder>() {


    class TeacherViewHolder(view: View) : RecyclerView.ViewHolder(view) {
        val availabilitySwitch : SwitchMaterial = view.findViewById(R.id.teacher_availability)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeacherViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_teacher_availability, parent, false)
        return TeacherViewHolder(view)
    }

    override fun onBindViewHolder(holder: TeacherViewHolder, position: Int) {
        val item = teacherSet[position]
        holder.availabilitySwitch.text = item.name
        holder.availabilitySwitch.setOnCheckedChangeListener { _, isChecked ->
            item.isAvailable = isChecked
            if(item.isAvailable)
                Toast.makeText(context, "${item.name} is available", Toast.LENGTH_SHORT).show()
            else
                Toast.makeText(context, "${item.name} is unavailable", Toast.LENGTH_SHORT).show()
        }
    }

    override fun getItemCount(): Int {
        return teacherSet.size
    }
}


