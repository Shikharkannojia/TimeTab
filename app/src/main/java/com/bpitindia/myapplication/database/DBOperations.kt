package com.bpitindia.myapplication.database

import android.content.Context
import android.os.AsyncTask
import androidx.room.Room

class DBOperations {


    class DBAsyncTask1(val context: Context, val teacherEntity: TeacherEntity, private val mode: Int) :
        AsyncTask<Void, Void, Boolean>() {

        override fun doInBackground(vararg params: Void?): Boolean {
            val db = Room.databaseBuilder(context, TeacherDatabase::class.java, "Teacher-Db").build()

            when (mode) {
                1 -> {
                    try {
                        db.teacherDao().insertTeacher(teacherEntity)
                        db.close()
                        return true
                    }catch (e: Exception){
                        return false
                    }
                }
                2 -> {
                    db.teacherDao().deleteTeacher(teacherEntity)
                    db.close()
                    return true
                }

                3 -> {
                    db.teacherDao().updateTeacher(teacherEntity)
                    db.close()
                    return true
                }
            }
            return false
        }
    }

    class RetrieveTaskItems(val context: Context) : AsyncTask<Void, Void, List<TeacherEntity>>() {
        override fun doInBackground(vararg params: Void?): List<TeacherEntity> {
            val db = Room.databaseBuilder(context, TeacherDatabase::class.java, "Teacher-Db").build()
            val ret = db.teacherDao().getAllTeachers()
            db.close()
            return ret
        }
    }

}