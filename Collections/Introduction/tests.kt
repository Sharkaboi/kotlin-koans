import koans.util.errorMessage
import org.junit.Assert
import org.junit.Test

class TestIntroduction {
    @Test(timeout = 1000)
    fun testSetOfCustomers() {
        Assert.assertTrue(errorMessage("getSetOfCustomers"),
                shop.getSetOfCustomers() == customers.values.toSet())
    }
}
