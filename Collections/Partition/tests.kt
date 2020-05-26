import koans.util.errorMessage
import org.junit.Assert
import org.junit.Test

class TestPartition {
    @Test(timeout = 1000)
    fun testGetCustomersWhoHaveMoreUndeliveredOrdersThanDelivered() {
        Assert.assertTrue(errorMessage("getCustomersWithMoreUndeliveredOrders"),
                setOf(customers[reka]) == shop.getCustomersWithMoreUndeliveredOrders())
    }
}
