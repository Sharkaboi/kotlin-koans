import koans.util.errorMessage
import org.junit.Assert
import org.junit.Test

class TestGroupBy {
    @Test(timeout = 1000)
    fun testGroupCustomersByCity() {
        Assert.assertTrue(errorMessage("groupCustomersByCity"),
                groupedByCities == shop.groupCustomersByCity())
    }
}
