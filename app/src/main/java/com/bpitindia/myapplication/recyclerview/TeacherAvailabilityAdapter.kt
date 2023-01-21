package com.bpitindia.myapplication.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Switch
import androidx.recyclerview.widget.RecyclerView
import com.bpitindia.myapplication.R
import com.bpitindia.myapplication.entity.Teacher

class TeacherAvailabilityAdapter(val context: Context, private val teacherSet : List<Teacher>
): RecyclerView.Adapter<TeacherAvailabilityAdapter.TeacherViewHolder>() {


    class TeacherViewHolder(view: View) : RecyclerView.ViewHolder(view) {

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TeacherViewHolder {
        val view =
            LayoutInflater.from(parent.context).inflate(R.layout.item_teacher_availability, parent, false)
        return TeacherViewHolder(view)
    }

    override fun onBindViewHolder(holder: TeacherViewHolder, position: Int) {

    }

    override fun getItemCount(): Int {
        return teacherSet.size
    }
}


