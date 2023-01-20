package com.bpitindia.myapplication.data

import com.bpitindia.myapplication.entity.Teacher

class TeachersList {

    fun loadTeachers() : List<Teacher> {
        return listOf(
            //Data Mining
            Teacher("Dr. Mugdha", "Data Mining", true),
            Teacher("Dr. Shweta", "Data Mining", true),
            Teacher("Dr. A", "Data Mining", true),

            //Information Security
            Teacher("Dr. Charu", "Information Security", true),
            Teacher("Dr. B", "Information Security", true),
            Teacher("Dr. C", "Information Security", true),
            Teacher("Dr. D", "Information Security", true),

            //Software Testing
            Teacher("Dr. Vishal", "Software Testing", true),
            Teacher("Dr. E", "Software Testing", true),
            Teacher("Dr. F", "Software Testing", true),

            //Advanced DBMS
            Teacher("Dr . Dipti", "Advanced DBMS", true),
            Teacher("Dr. G", "Advanced DBMS", true),
            Teacher("Dr. H", "Advanced DBMS", true),

            //Wireless Communication
            Teacher("Dr. Dinesh", "Wireless Communication", true),
            Teacher("Dr. I", "Wireless Communication", true),
            Teacher("Dr. J", "Wireless Communication", true),
            Teacher("Dr. K", "Wireless Communication", true),

            Teacher("Dr. Charu", "Information Security Lab", true),

            Teacher("Dr. Dinesh", "Wireless Communication Lab", true),

            Teacher("Dr. Mugdha", "Data Mining", true),

            Teacher("Dr. Vishal", "Software Testing", true)
        )
    }

}