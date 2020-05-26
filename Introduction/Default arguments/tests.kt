import org.junit.Assert
import org.junit.Test

class TestDefaultAndNamedParams() {

    @Test(timeout = 1000)
    fun testDefaultAndNamedParams() {
        Assert.assertEquals("'useFoo()' returns wrong result\n",
                listOf("a42", "b1", "C42", "D2"), useFoo())
    }
}