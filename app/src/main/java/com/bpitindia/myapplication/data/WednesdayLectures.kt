package com.bpitindia.myapplication.data

import com.bpitindia.myapplication.entity.Period

class WednesdayLectures {
    fun loadLectures() : List<Period> {
        return listOf(
            Period("LIB", "SH1-B", "Library Assistant", "9:30 - 10:20"),
            Period("Data Mining", "403", "Dr. Mugdha", "10:20 - 11:10"),
            Period("ST", "402", "Dr. Vishal", "11:10 - 12:00"),
            Period("Library", "Lib", "Library Assistant", "12:00 - 12:50"),
            Period("WC", "113", "Mr. Dinesh", "1:40 - 3:20"),
            Period("IS Lab (G2)","108B","Dr. Charu", "3:20 - 5:00"),
            Period("DM Lab (G1)", "401A", "Dr. Mugdha", "3:20 - 5:00")
        )
    }
}