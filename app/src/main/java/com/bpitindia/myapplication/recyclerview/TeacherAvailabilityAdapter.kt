package com.bpitindia.myapplication.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Switch
import androidx.recyclerview.widget.RecyclerView
import com.bpitindia.myapplication.R
import com.bpitindia.myapplication.entity.Teacher

class TeacherAvailabilityAdapter(private val teacherSet : List<Teacher>
                                 ): RecyclerView.Adapter<TeacherAvailabilityAdapter.TeacherViewHolder>() {


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeacherViewHolder {
        val adapterLayout = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_teacher_availability, parent, false)

        return TeacherViewHolder(adapterLayout)
    }

    override fun onBindViewHolder(holder: TeacherViewHolder, position: Int) {
        val item = teacherSet[position]
        holder.teacher_switch.text = item.name
        holder.teacher_switch.setOnCheckedChangeListener { _, isChecked ->
            item.isAvailable = isChecked
        }
    }

    override fun getItemCount() = teacherSet.size

    class TeacherViewHolder(private val view : View) : RecyclerView.ViewHolder(view) {
        val teacher_switch : Switch = view.findViewById(R.id.teacher_availability)

    }



}