package com.bpitindia.myapplication

import android.content.Intent
import android.os.Bundle
import android.widget.ArrayAdapter
import android.widget.Button
import androidx.appcompat.app.AppCompatActivity
import com.bpitindia.myapplication.data.AllTeachers
import com.bpitindia.myapplication.data.TeachersList
import com.bpitindia.myapplication.databinding.ActivityLeaveBinding
import com.bpitindia.myapplication.databinding.ActivityMainBinding
import com.bpitindia.myapplication.entity.Teacher
import java.time.LocalTime


class ActivityLeave: AppCompatActivity() {
    private lateinit var binding: ActivityLeaveBinding
    //lateinit var resultbtn: Button
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityLeaveBinding.inflate(layoutInflater)
        setContentView(binding.root)

//        val teachers = resources.getStringArray(R.array.teachers)
//        val arrayAdapter = ArrayAdapter(this, R.layout.dropdown_item, teachers)
//        binding.autoCompleteTextView.setAdapter(arrayAdapter)
//
//        val day = resources.getStringArray(R.array.days)
//        val arrayAdapterday = ArrayAdapter(this, R.layout.dropdown_item_day, day)
//        binding.autoCompleteTextViewday.setAdapter(arrayAdapterday)
//
//        val time = resources.getStringArray(R.array.time)
//        val arrayAdaptertime = ArrayAdapter(this, R.layout.dropdown_item_time, time)
//        binding.autoCompleteTextViewtime.setAdapter(arrayAdaptertime)

//        binding.resultbtn.setOnClickListener {

          //  val intent = Intent(this, MainActivity::class.java)
//
//            var inputday= binding.autoCompleteTextViewday.text.toString()
//            var inputtime=binding.autoCompleteTextViewtime.text.toString()
//            var inputteachers= binding.autoCompleteTextView.text.toString()
//
//
//
//
//
//
//            binding.result.text="Hello"
//        }
//

        val teacherName = intent.getStringExtra("teacher")
        val subjectName = intent.getStringExtra("subject")
        val startTime = intent.getSerializableExtra("startTime") as LocalTime
        val endTime = intent.getSerializableExtra("endTime") as LocalTime

        val teachers : List<Teacher> = AllTeachers().loadTeachers()

//        if(subjectName.equals("Data Mining")) teachers = TeachersList().loadDMTeachers()
//
//        else if(subjectName.equals("Information Security")) teachers = TeachersList().loadISTeachers()
//
//        else if(subjectName.equals("Software Testing")) teachers = TeachersList().loadSTTeachers()
//
//        else if(subjectName.equals("Wireless Communication")) teachers = TeachersList().loadWCTeachers()
//
//        else if(subjectName.equals("Advanced DBMS")) teachers = TeachersList().loadADBMSTeachers()
//
//        else if(subjectName.equals("DM Lab")) teachers = TeachersList().loadDMLTeachers()
//
//        else if(subjectName.equals("WC Lab")) teachers = TeachersList().loadWCLTeachers()
//
//        else if(subjectName.equals("IS Lab")) teachers = TeachersList().loadISLTeachers()
//
//        else if(subjectName.equals("ST Lab")) teachers = TeachersList().loadSTLTeachers()
//
//        else teachers = listOf(Teacher("Anonymous", subjectName!!, true))


        var suggestedList = ""

        val list = suggestSubjectTeachers(teacherName!!, subjectName!!, startTime, endTime, teachers)

        if (list != null) {
            for(teacher in list){
                suggestedList += "${ teacher.name }\n\n"
            }
        }

        binding.result.text = suggestedList

    }


    private fun suggestSubjectTeachers(concernedTeacher : String,
                               subject : String,
                               start : LocalTime,
                               end : LocalTime,
                               teachersList : List<Teacher>) : List<Teacher>? {


        val suggestedTeachers = mutableListOf<Teacher>()
        for(teacher in teachersList) {
            if(teacher.name != concernedTeacher && teacher.subject == subject && teacher.isAvailable){
                suggestedTeachers.add(teacher)
            }
        }

        return suggestedTeachers.ifEmpty { null }
    }

//    private fun suggestNonSubjectTeachers(concernedTeacher: Teacher,
//                                          start : LocalTime,
//                                          end : LocalTime,
//                                          teachersList: TeachersList
//                                          )


}