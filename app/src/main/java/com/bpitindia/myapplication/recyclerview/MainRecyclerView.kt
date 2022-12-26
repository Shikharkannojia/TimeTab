package com.bpitindia.myapplication.recyclerview

import android.content.Context
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.TextView
import androidx.recyclerview.widget.RecyclerView
import com.bpitindia.myapplication.R
import com.bpitindia.myapplication.entity.Period

class MainRecyclerAdapter(
    val context: Context,
    private val itemList: ArrayList<Period>
) : RecyclerView.Adapter<MainRecyclerAdapter.MainViewHolder>() {
    private var timeInMillis: Long = 0L
    class MainViewHolder(view: View) : RecyclerView.ViewHolder(view) {
//        var recyclerHome: RecyclerView = view.findViewById(R.id.recyclerRecyclerView)
        lateinit var layoutManager: RecyclerView.LayoutManager

//        var scheduleDate: TextView = view.findViewById(R.id.schedule_date)
        var name: TextView = view.findViewById(R.id.name)
        var teacher: TextView = view.findViewById(R.id.teacher)
        var room: TextView = view.findViewById(R.id.room)
        var time: TextView = view.findViewById(R.id.time)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_lecture, parent, false)
        return MainViewHolder(view)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
//        holder.scheduleDate.text = itemList[position].scheduleDate
        holder.name.text = itemList[position].name
        holder.teacher.text = itemList[position].teacher
        holder.room.text = "Room ${itemList[position].room}"
        holder.time.text = itemList[position].time


//        holder.editButton.setOnClickListener {
//            editTask(holder)
//        }
    }

    override fun getItemCount(): Int {
        return itemList.size
    }
}

