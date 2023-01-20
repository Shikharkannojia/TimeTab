package com.bpitindia.myapplication.data

import com.bpitindia.myapplication.entity.Period
import java.time.LocalTime

class WednesdayLectures {
    fun loadLectures() : List<Period> {
        return listOf(
            Period("LIB", "SH1-B", "Library Assistant", LocalTime.of(9,30),  LocalTime.of(10,20)),
            Period("Data Mining", "403", "Dr. Mugdha", LocalTime.of(10,20),  LocalTime.of(11,10)),
            Period("ST", "402", "Dr. Vishal", LocalTime.of(11,10),  LocalTime.of(12,0)),
            Period("Library", "Lib", "Library Assistant", LocalTime.of(12,0),  LocalTime.of(12,50)),
            Period("WC", "113", "Mr. Dinesh", LocalTime.of(1,40),  LocalTime.of(3,20)),
//            Period("IS Lab (G2)","108B","Dr. Charu", "3:20 - 5:00"),
            Period("DM Lab (G1)", "401A", "Dr. Mugdha", LocalTime.of(3,20),  LocalTime.of(5,0))
        )
    }
}