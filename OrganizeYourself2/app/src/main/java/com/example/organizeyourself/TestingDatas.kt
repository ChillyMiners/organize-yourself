package com.example.organizeyourself

import android.icu.text.CaseMap

data class WeekDays(var monday : Boolean, var tuesday: Boolean, var wednesday: Boolean,
                    var thursday: Boolean, var friday: Boolean, var saturday: Boolean,
                    var sunday: Boolean)

data class TestAlarm(var hour: Int = 6, var minute: Int = 0, var days: WeekDays, var title: String)