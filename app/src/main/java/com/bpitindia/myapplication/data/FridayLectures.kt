package com.bpitindia.myapplication.data

import com.bpitindia.myapplication.entity.Period

class FridayLectures {
    fun loadLectures() : List<Period> {
        return listOf(
            Period("Minor Project", "__", "Mentor", "9:30 - 12:50"),
            Period("Minor Project", "__", "Mentor", "1:40 - 5:00")

        )
    }
}