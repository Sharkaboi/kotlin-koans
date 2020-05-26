// Return the set of products that were ordered by all customers
fun Shop.getProductsOrderedByAll(): Set<Product> {
    val setOfAllProducts = this.customers.flatMap { it.getOrderedProducts() }.toSet()
    return this.customers.fold(setOfAllProducts, { setOfAllProducts, it ->
        setOfAllProducts.intersect(it.getOrderedProducts())
    })
}

fun Customer.getOrderedProducts(): List<Product> =
        this.orders.flatMap { it.products }