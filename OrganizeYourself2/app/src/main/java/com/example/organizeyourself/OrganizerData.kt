package com.example.organizeyourself

object OrganizerData {
    var alarms = ArrayList<TestAlarm>()



    init {
        var daysForAlarm = WeekDays(true, true, true, true,
                                    true, false, false)

        alarms.add(TestAlarm(4, 20, daysForAlarm, "Time to blaze!"))
    }
}