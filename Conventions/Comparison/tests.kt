import koans.util.errorMessage
import org.junit.Assert
import org.junit.Test

class TestComparison {

    @Test(timeout = 1000)
    fun testBefore() {
        val first = MyDate(2014, 5, 10)
        val second = MyDate(2014, 7, 11)
        Assert.assertTrue(errorMessage("compareTo") + "$first should go before $second", first < second)
    }

    @Test(timeout = 1000)
    fun testAfter() {
        val first = MyDate(2014, 10, 20)
        val second = MyDate(2014, 7, 11)
        Assert.assertTrue(errorMessage("compareTo") + "$first should go after $second", first > second)
    }
}