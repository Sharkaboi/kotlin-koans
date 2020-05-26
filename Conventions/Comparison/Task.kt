data class MyDate(val year: Int, val month: Int, val dayOfMonth: Int) : Comparable<MyDate> {
    override fun compareTo(date2: MyDate) = when {
        this.year > date2.year -> 1
        this.year < date2.year -> -1
        this.month > date2.month -> 1
        this.month < date2.month -> -1
        this.dayOfMonth > date2.dayOfMonth -> 1
        this.dayOfMonth < date2.dayOfMonth -> -1
        else -> 0
    }
}

fun test(date1: MyDate, date2: MyDate) {
    // this code should compile:
    println(date1 < date2)
}
