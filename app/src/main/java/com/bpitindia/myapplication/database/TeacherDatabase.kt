package com.bpitindia.myapplication.database

import androidx.room.Database
import androidx.room.RoomDatabase

@Database(entities = [TeacherEntity::class], version = 1)
abstract class TeacherDatabase : RoomDatabase() {
    abstract fun teacherDao(): TeacherDao
}