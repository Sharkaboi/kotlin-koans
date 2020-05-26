import koans.util.errorMessage
import org.junit.Assert
import org.junit.Test

class TestFold {
    @Test(timeout = 1000)
    fun testGetProductsOrderedByAllCustomers() {
        val testShop = shop("test shop for 'fold'",
                customer(lucas, Canberra,
                        order(idea),
                        order(webStorm)
                ),
                customer(reka, Budapest,
                        order(idea),
                        order(youTrack)
                )
        )
        Assert.assertTrue(errorMessage("getProductsOrderedByAll"),
                setOf(idea) == testShop.getProductsOrderedByAll())
    }
}
