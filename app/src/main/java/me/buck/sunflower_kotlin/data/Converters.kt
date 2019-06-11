package me.buck.sunflower_kotlin.data

import androidx.room.TypeConverter
import java.util.*

/**
 * Created by gwf on 2019/6/11
 */
class Converters {

    @TypeConverter
    fun calendarToDatestamp(calendar: Calendar): Long = calendar.timeInMillis

    @TypeConverter
    fun datestampToCalendar(value: Long): Calendar = Calendar.getInstance().apply {
        timeInMillis = value
    }
}