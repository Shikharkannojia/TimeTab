package com.bpitindia.myapplication.data

import com.bpitindia.myapplication.entity.Period

class TuesdayLectures {
    fun loadLectures() : List<Period> {
        return listOf(
            Period("Information Security", "SH1-B", "Dr. Charu", "9:30 - 11:10"),
            Period("ST Lab (G1)", "401A", "Dr. Vishal", "11:10 - 12:50"),
            Period("WC Lab (G2)", "108A", "Dr. Dinesh", "11:10 - 12:50"),
            Period("ADBMS", "114", "Ms. Deepti", "1:40 - 2:30"),
            Period("WC", "114", "Dr. Dinesh", "2:30 - 3:20"),
            Period("CCA", "__", "__", "3:20 - 5:00")

        )
    }
}