package com.bpitindia.myapplication.data

import com.bpitindia.myapplication.entity.Period
import java.time.LocalTime

class TuesdayLectures {
    fun loadLectures() : List<Period> {
        return listOf(
            Period("Information Security", "SH1-B", "Dr. Charu", LocalTime.of(9,30), LocalTime.of(11,10)),
//            Period("ST Lab (G1)", "401A", "Dr. Vishal", "11:10 - 12:50"),
            Period("WC Lab (G2)", "108A", "Dr. Dinesh", LocalTime.of(11,10), LocalTime.of(12,50)),
            Period("ADBMS", "114", "Ms. Deepti", LocalTime.of(1,40), LocalTime.of(2,30)),
            Period("WC", "114", "Dr. Dinesh", LocalTime.of(2,30), LocalTime.of(3,20)),
            Period("CCA", "__", "__",  LocalTime.of(3,20), LocalTime.of(5,0))
        )
    }
}