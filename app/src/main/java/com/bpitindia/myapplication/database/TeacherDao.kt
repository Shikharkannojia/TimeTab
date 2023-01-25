package com.bpitindia.myapplication.database
import androidx.room.*

@Dao
interface TeacherDao {
    @Insert
    fun insertTeacher(teacherEntity: TeacherEntity)

    @Delete
    fun deleteTeacher(teacherEntity: TeacherEntity)

    @Update
    fun updateTeacher(teacherEntity: TeacherEntity)

    @Query("SELECT * FROM teacher ORDER BY id ASC")
    fun getAllTeachers(): List<TeacherEntity>
}