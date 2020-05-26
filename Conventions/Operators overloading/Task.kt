import TimeInterval.*

data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int)

// Supported intervals that might be added to dates:
enum class TimeInterval { DAY, WEEK, YEAR }

operator fun MyDate.plus(timeIntervalPair: Pair<TimeInterval, Int>): MyDate {
    return this.addTimeIntervals(timeIntervalPair.first, timeIntervalPair.second)
}

operator fun MyDate.plus(timeInterval: TimeInterval): MyDate {
    return this.addTimeIntervals(timeInterval, 1)
}

private operator fun TimeInterval.times(interval: Int): Pair<TimeInterval, Int> {
    return Pair(this, interval)
}

fun task1(today: MyDate): MyDate {
    return today + YEAR + WEEK
}

fun task2(today: MyDate): MyDate {
    return today + YEAR * 2 + WEEK * 3 + DAY * 5
}