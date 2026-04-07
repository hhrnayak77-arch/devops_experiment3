package org.example

import org.junit.Assert.assertEquals
import org.junit.Test

class MainTest {
    @Test

    fun testaddNumber() {
        val num1 = 10.0
        val num2 = 5.0
        val result = addNumber(num1, num2)

        assertEquals("The sum of $num1 and $num2 is should be 15.0", 15.0, result, 0.001)
    }
}