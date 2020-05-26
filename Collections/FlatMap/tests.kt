import koans.util.errorMessage
import org.junit.Assert
import org.junit.Test

class TestFlatMap {
    @Test(timeout = 1000)
    fun testGetOrderedProductsSet() {
        Assert.assertTrue(errorMessage("Customer.getOrderedProducts"),
                listOf(idea, idea, idea) == customers[reka]?.getOrderedProducts())
    }

    @Test(timeout = 1000)
    fun testGetAllOrderedProducts() {
        Assert.assertTrue(errorMessage("Shop.getOrderedProducts"),
                orderedProducts == shop.getOrderedProducts())
    }
}
