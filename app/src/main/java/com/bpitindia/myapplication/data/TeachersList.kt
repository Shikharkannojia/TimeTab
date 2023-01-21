package com.bpitindia.myapplication.data

import com.bpitindia.myapplication.entity.Teacher

class TeachersList {

    fun loadDMTeachers() : List<Teacher> {
        return listOf(
            //Data Mining
            Teacher("Dr. Mugdha", "Data Mining", true),
            Teacher("Dr. Shweta", "Data Mining", true),
            Teacher("Dr. A", "Data Mining", true)
        )
    }

    fun loadISTeachers() : List<Teacher> {
        return listOf(
            //Information Security
            Teacher("Dr. Charu", "Information Security", true),
            Teacher("Dr. B", "Information Security", true),
            Teacher("Dr. C", "Information Security", true),
            Teacher("Dr. D", "Information Security", true)
        )
    }

    fun loadSTTeachers() : List<Teacher> {
        return listOf(
            //Software Testing
            Teacher("Dr. Vishal", "Software Testing", true),
            Teacher("Dr. E", "Software Testing", true),
            Teacher("Dr. F", "Software Testing", true)
        )
    }

    fun loadADBMSTeachers() : List<Teacher> {
        return listOf(
            //Advanced DBMS
            Teacher("Ms. Deepti", "Advanced DBMS", true),
            Teacher("Dr. G", "Advanced DBMS", true),
            Teacher("Dr. H", "Advanced DBMS", true)
        )
    }

    fun loadWCTeachers() : List<Teacher> {
        return listOf(
            //Wireless Communication
            Teacher("Dr. Dinesh", "Wireless Communication", true),
            Teacher("Dr. I", "Wireless Communication", true),
            Teacher("Dr. J", "Wireless Communication", true),
            Teacher("Dr. K", "Wireless Communication", true)
        )
    }

    fun loadISLTeachers() : List<Teacher> {
        return listOf(
            Teacher("Dr. Charu", "IS Lab", true)
        )
    }

    fun loadDMLTeachers() : List<Teacher> {
        return listOf(
            Teacher("Dr. Mugdha", "DM Lab", true)
        )
    }

    fun loadWCLTeachers() : List<Teacher> {
        return listOf(
            Teacher("Dr. Dinesh", "WC Lab", true)
        )
    }

    fun loadSTLTeachers() : List<Teacher> {
        return listOf(
            Teacher("Dr. Vishal", "ST Lab", true)
        )
    }
}