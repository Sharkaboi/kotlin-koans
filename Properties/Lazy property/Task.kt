class LazyProperty(val initializer: () -> Int) {
    var isInitialized = false
    var value: Int? = null
    val lazy: Int
        get() {
            if (!isInitialized) {
                value = initializer()
                isInitialized = true
            }
            return value!!
        }
}
