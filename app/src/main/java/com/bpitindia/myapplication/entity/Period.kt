package com.bpitindia.myapplication.entity

import java.time.LocalTime

data class Period (
    var name: String,
    var room: String,
    var teacher: String,
    var startTime : LocalTime,
    var endTime : LocalTime
)