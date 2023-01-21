package com.bpitindia.myapplication.data

import com.bpitindia.myapplication.entity.Period
import java.time.LocalTime

class MondayLectures {

    fun loadLectures() : List<Period> {
        return listOf(
            Period("Data Mining", "403", "Dr. Mugdha", LocalTime.of(9,30), LocalTime.of(11,10)),
//            Period("DM Lab (G2)", "108C", "Dr. Mugdha", "11:10 - 12:50"),
            Period("IS Lab", "108B", "Dr. Charu", LocalTime.of(11,10), LocalTime.of(12,50)),
            Period("Information Security", "112", "Dr. Charu", LocalTime.of(1,40), LocalTime.of(3,20)),
            Period("Mentor Mentee Meeting", "108", "Mentor", LocalTime.of(3,20), LocalTime.of(4,10)),
            Period("Library", "Lib", "Library Assistant", LocalTime.of(4,10), LocalTime.of(5,0))
        )
    }

}