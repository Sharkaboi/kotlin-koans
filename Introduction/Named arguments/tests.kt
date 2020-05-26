import koans.util.errorMessage
import org.junit.Assert
import org.junit.Test

class TestNamedArguments {

    @Test(timeout = 1000)
    fun testJoinToString() {
        Assert.assertEquals(errorMessage("joinOptions"), "[yes, no, may be]", joinOptions(listOf("yes", "no", "may be")))
    }

}