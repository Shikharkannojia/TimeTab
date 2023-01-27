package com.bpitindia.myapplication

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView
import com.bpitindia.myapplication.data.AllTeachers
import com.bpitindia.myapplication.database.DBOperations
import com.bpitindia.myapplication.database.TeacherEntity
import com.bpitindia.myapplication.recyclerview.TeacherAvailabilityAdapter
import com.google.android.material.floatingactionbutton.FloatingActionButton

class Launcher : AppCompatActivity() {

    private lateinit var recyclerHome: RecyclerView
    private lateinit var layoutManager: RecyclerView.LayoutManager
    private lateinit var recyclerAdapter: TeacherAvailabilityAdapter
    private lateinit var createIcon: FloatingActionButton

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_launcher)

        recyclerHome = findViewById(R.id.teacher)
        layoutManager = LinearLayoutManager(this)
        createIcon = findViewById(R.id.create_icon)



        val list = AllTeachers().loadTeachers()

        for(i in list.indices){
            val id = list[i].id
            val name = list[i].name
            val subject = list[i].subject
            val isAvailable = list[i].isAvailable

            val teacherEntity = TeacherEntity(id, name, subject, isAvailable)
            val async = DBOperations.DBAsyncTask1(
                this,
                teacherEntity,
                1
            ).execute()
        }


//
//        val p1 = Teacher("Dr. Mugdha", "Data Mining", false)
//        val p2 = Teacher("Dr. Charu", "IS Lab (G1)", false)
//        val p3 = Teacher("Dr. Mugdha", "DM Lab", false)
//        val p4 = Teacher("Dr. Charu", "Information Security", false)
//        val p5 = Teacher("Dr. Mugdha", "Data Mining", false)
//        val p6 = Teacher("Dr. Charu", "IS Lab (G1)", false)
//        val p7 = Teacher("Dr. Mugdha", "DM Lab", false)
//        val p8 = Teacher("Dr. Charu", "Information Security", false)
//
//        list.add(p1); list.add(p2); list.add(p3); list.add(p4); list.add(p5); list.add(p6); list.add(p7); list.add(p8)

        recyclerAdapter =
            TeacherAvailabilityAdapter(this, list)
        recyclerHome.adapter = recyclerAdapter
        recyclerHome.layoutManager = layoutManager

        createIcon.setOnClickListener {
            val intent = Intent(this, TimeTable::class.java)
            startActivity(intent)
        }
    }
}