package com.bpitindia.myapplication.database
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "teacher")
class TeacherEntity (
    @PrimaryKey val id: String,
    @ColumnInfo(name = "teacher_name") val name: String,
    @ColumnInfo(name = "teacher_subject") val subject: String,
    @ColumnInfo(name = "teacher_isAvailable") val isAvailable: Boolean
)
