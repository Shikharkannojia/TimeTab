package com.bpitindia.myapplication.data

import com.bpitindia.myapplication.entity.Period
import java.time.LocalTime

class FridayLectures {
    fun loadLectures() : List<Period> {
        return listOf(
            Period("Minor Project", "__", "Mentor", LocalTime.of(9,30),  LocalTime.of(12,50)),
            Period("Minor Project", "__", "Mentor", LocalTime.of(1,40),  LocalTime.of(5,0))
        )
    }
}