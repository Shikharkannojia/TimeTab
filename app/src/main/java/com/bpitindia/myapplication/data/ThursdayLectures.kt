package com.bpitindia.myapplication.data

import com.bpitindia.myapplication.entity.Period
import java.time.LocalTime

class ThursdayLectures {
    fun loadLectures() : List<Period> {
        return listOf(
            Period("ST", "SH1-B", "Dr. Vishal", LocalTime.of(9,30),  LocalTime.of(11,10)),
            Period("ST Lab (G1)", "110", "Dr. Vishal", LocalTime.of(11,10),  LocalTime.of(12,50)),
//            Period("WC Lab (G2)", "108A", "Dr. Dinesh", "11:10 - 12:50"),
            Period("ADBMS", "404", "Ms. Deepti", LocalTime.of(1,40),  LocalTime.of(3,20)),
            Period("Minor Project", "__", "Mentor", LocalTime.of(3,20),  LocalTime.of(5,0))
        )
    }
}