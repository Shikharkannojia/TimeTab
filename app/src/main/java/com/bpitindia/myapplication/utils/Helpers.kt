package com.bpitindia.myapplication.utils

import java.time.LocalTime

class Helpers {

    fun isCurrentTimeBetween(startTime : LocalTime,
                             endTime: LocalTime,
                             currentTime: LocalTime) : Boolean {
        return currentTime.isAfter(startTime) && currentTime.isBefore(endTime)
    }

}