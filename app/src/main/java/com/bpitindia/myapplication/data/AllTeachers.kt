package com.bpitindia.myapplication.data

import com.bpitindia.myapplication.database.TeacherEntity

class AllTeachers {

    fun loadTeachers() : List<TeacherEntity> {
        return listOf(
            //Data Mining
            TeacherEntity("1A","Dr. Mugdha", "Data Mining", true),
            TeacherEntity("1B", "Dr. Shweta", "Data Mining", true),
            TeacherEntity("1C", "Dr. A", "Data Mining", true),

            //Information Security
            TeacherEntity("2A", "Dr. Charu", "Information Security", true),
            TeacherEntity("2B", "Dr. B", "Information Security", true),
            TeacherEntity("2C", "Dr. C", "Information Security", true),
            TeacherEntity("2D", "Dr. D", "Information Security", true),

            //Software Testing
            TeacherEntity("3A", "Dr. Vishal", "Software Testing", true),
            TeacherEntity("3B", "Dr. E", "Software Testing", true),
            TeacherEntity("3C", "Dr. F", "Software Testing", true),

            //Advanced DBMS
            TeacherEntity("4A", "Ms. Deepti", "Advanced DBMS", true),
            TeacherEntity("4B", "Dr. G", "Advanced DBMS", true),
            TeacherEntity("4C", "Dr. H", "Advanced DBMS", true),

            //Wireless Communication
            TeacherEntity("5A", "Dr. Dinesh", "Wireless Communication", true),
            TeacherEntity("5B", "Dr. I", "Wireless Communication", true),
            TeacherEntity("5C", "Dr. J", "Wireless Communication", true),
            TeacherEntity("5D", "Dr. K", "Wireless Communication", true)

        )
    }

}