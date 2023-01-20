package com.bpitindia.myapplication.data

import com.bpitindia.myapplication.entity.Period

class MondayLectures {

    fun loadLectures() : List<Period> {
        return listOf(
            Period("Data Mining", "403", "Dr. Mugdha", "9:30 - 11:10"),
            Period("Information Security", "112", "Dr. Charu", "1:40 - 3:20"),
            Period("DM Lab (G2)", "108C", "Dr. Mugdha", "11:10 - 12:50"),
            Period("Mentor Mentee Meeting", "108", "Mentor", "3:20 - 4:10"),
            Period("IS Lab (G1)", "108B", "Dr. Charu", "11:10 - 12:50"),
            Period("Library", "Lib", "Library Assistant", "4:10 - 5:00")

        )
    }

}