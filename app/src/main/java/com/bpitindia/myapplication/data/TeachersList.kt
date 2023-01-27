package com.bpitindia.myapplication.data

import com.bpitindia.myapplication.database.TeacherEntity

class TeachersList {

    fun loadDMTeachers() : List<TeacherEntity> {
        return listOf(
            //Data Mining
            TeacherEntity("1A", "Dr. Mugdha", "Data Mining", true),
            TeacherEntity("1B", "Dr. Shweta", "Data Mining", true),
            TeacherEntity("1C", "Dr. A", "Data Mining", true)
        )
    }

    fun loadISTeachers() : List<TeacherEntity> {
        return listOf(
            //Information Security
            TeacherEntity("2A", "Dr. Charu", "Information Security", true),
            TeacherEntity("2B", "Dr. B", "Information Security", true),
            TeacherEntity("2C", "Dr. C", "Information Security", true),
            TeacherEntity("2D", "Dr. D", "Information Security", true)
        )
    }

    fun loadSTTeachers() : List<TeacherEntity> {
        return listOf(
            //Software Testing
            TeacherEntity("3A", "Dr. Vishal", "Software Testing", true),
            TeacherEntity("3B", "Dr. E", "Software Testing", true),
            TeacherEntity("3C", "Dr. F", "Software Testing", true)
        )
    }

    fun loadADBMSTeachers() : List<TeacherEntity> {
        return listOf(
            //Advanced DBMS
            TeacherEntity("4A", "Ms. Deepti", "Advanced DBMS", true),
            TeacherEntity("4B", "Dr. G", "Advanced DBMS", true),
            TeacherEntity("4C", "Dr. H", "Advanced DBMS", true)
        )
    }

    fun loadWCTeachers() : List<TeacherEntity> {
        return listOf(
            //Wireless Communication
            TeacherEntity("5A", "Dr. Dinesh", "Wireless Communication", true),
            TeacherEntity("5B", "Dr. I", "Wireless Communication", true),
            TeacherEntity("5C", "Dr. J", "Wireless Communication", true),
            TeacherEntity("5D", "Dr. K", "Wireless Communication", true)
        )
    }

    fun loadISLTeachers() : List<TeacherEntity> {
        return listOf(
            TeacherEntity("2A", "Dr. Charu", "IS Lab", true)
        )
    }

    fun loadDMLTeachers() : List<TeacherEntity> {
        return listOf(
            TeacherEntity("1A", "Dr. Mugdha", "DM Lab", true)
        )
    }

    fun loadWCLTeachers() : List<TeacherEntity> {
        return listOf(
            TeacherEntity("5A", "Dr. Dinesh", "WC Lab", true)
        )
    }

    fun loadSTLTeachers() : List<TeacherEntity> {
        return listOf(
            TeacherEntity("3A", "Dr. Vishal", "ST Lab", true)
        )
    }
}