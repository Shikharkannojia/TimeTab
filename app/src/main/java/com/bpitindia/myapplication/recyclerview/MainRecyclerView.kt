package com.bpitindia.myapplication.recyclerview

import android.content.Context
import android.content.Intent
import android.graphics.Color
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.ImageView
import android.widget.TextView
import androidx.cardview.widget.CardView
import androidx.constraintlayout.widget.ConstraintLayout
import androidx.recyclerview.widget.RecyclerView
import com.bpitindia.myapplication.ActivityLeave
import com.bpitindia.myapplication.R
import com.bpitindia.myapplication.entity.Period
import com.bpitindia.myapplication.utils.Helpers
import java.time.LocalTime

class MainRecyclerAdapter(
    val context: Context,
    private val itemList: List<Period>
) : RecyclerView.Adapter<MainRecyclerAdapter.MainViewHolder>() {
    private var currentTime = LocalTime.now()
    class MainViewHolder(view: View) : RecyclerView.ViewHolder(view) {
//        var recyclerHome: RecyclerView = view.findViewById(R.id.recyclerRecyclerView)
        lateinit var layoutManager: RecyclerView.LayoutManager
        // lateinit var cardviewlecture: CardView
//        var scheduleDate: TextView = view.findViewById(R.id.schedule_date)
        var name: TextView = view.findViewById(R.id.name)
        var teacher: TextView = view.findViewById(R.id.teacher)
        var room: TextView = view.findViewById(R.id.room)
        var time: TextView = view.findViewById(R.id.time)
        val cardlecture = view.findViewById(R.id.cardviewlecture) as CardView
        val sideMenu: ImageView = view.findViewById(R.id.side_menu)
        val lectureView: ConstraintLayout = view.findViewById(R.id.lectureview)
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MainViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.item_lecture, parent, false)
        return MainViewHolder(view)
    }

    override fun onBindViewHolder(holder: MainViewHolder, position: Int) {
//        holder.scheduleDate.text = itemList[position].scheduleDate
        val subject = itemList[position]
        holder.name.text = subject.name
        holder.teacher.text = subject.teacher
        holder.room.text = "Room ${subject.room}"
        var sHour = "${subject.startTime.hour}"
        var sMinute = "${subject.startTime.minute}"
        var eHour = "${subject.endTime.hour}"
        var eMinute = "${subject.endTime.minute}"

        if(subject.startTime.minute < 10)sMinute = "0$sMinute"
        if(subject.endTime.minute < 10)eMinute = "0$eMinute"

        if(subject.startTime.hour > 12){
            sHour = "${subject.startTime.hour - 12}"
            sMinute += " PM"
        }else if(subject.startTime.hour == 0){
            sHour = "12"
            sMinute += " AM"
        }else{
            if(subject.startTime.hour == 12)sMinute += " PM"
            else sMinute += " AM"
        }

        if(subject.endTime.hour > 12){
            eHour = "${subject.endTime.hour - 12}"
            eMinute += " PM"
        }else if(subject.endTime.hour == 0){
            eHour = "12"
            eMinute += " AM"
        }else{
            if(subject.endTime.hour == 12)eMinute += " PM"
            else eMinute += " AM"
        }

        if(subject.startTime.hour < 10 && subject.startTime.hour != 0)sHour = "0$sHour"
        if(subject.endTime.hour < 10 && subject.endTime.hour != 0)eHour = "0$eHour"

        holder.time.text = "${sHour}:${sMinute} - ${eHour}:${eMinute}"
//
//        holder.time.text = "${subject.startTime.hour}:${subject.startTime.minute} - ${subject.endTime.hour}:${subject.endTime.minute}"

        val startTime = subject.startTime
        val endTime = subject.endTime

        if(Helpers().isCurrentTimeBetween(startTime, endTime, currentTime))
            holder.lectureView.setBackgroundColor(Color.parseColor("#FAE75433"))




        holder.lectureView.setOnClickListener {
            val intent = Intent(context, ActivityLeave::class.java)
            intent.putExtra("teacher", subject.teacher)
            intent.putExtra("subject", subject.name)
            intent.putExtra("startTime", subject.startTime)
            intent.putExtra("endTime", subject.endTime)
            context.startActivity(intent)
        }
       /* holder.cardlecture.setOnClickListener {
            val intent = Intent(this@MainRecyclerAdapter, ActivityLeave::class.java )
            intent.putExtra("lecture", itemList[position])
        context.startActivity(intent)
        }*/
       /* holder.setOnClickListener {
           editTask(holder)
        }*/
    }



    override fun getItemCount(): Int {
        return itemList.size
    }
}

