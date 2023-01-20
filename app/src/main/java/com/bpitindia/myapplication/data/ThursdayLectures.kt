package com.bpitindia.myapplication.data

import com.bpitindia.myapplication.entity.Period

class ThursdayLectures {
    fun loadLectures() : List<Period> {
        return listOf(
            Period("ST", "SH1-B", "Dr. Vishal", "9:30 - 11:10"),
            Period("ST Lab (G1)", "110", "Dr. Vishal", "11:10 - 12:50"),
            Period("WC Lab (G2)", "108A", "Dr. Dinesh", "11:10 - 12:50"),
            Period("ADBMS", "404", "Ms. Deepti", "1:40 - 3:20"),
            Period("Minor Project", "__", "Mentor", "3:20 - 5:00")
        )
    }
}