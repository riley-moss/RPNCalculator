package com.example.rpncalculator

import org.junit.Assert.assertEquals
import org.junit.Test

class RPNCalculatorTest {

    private var calc = RPNCalculator()

    @Test
    fun `given a single number return that number`() {
        var expected = 1
        val actual = calc.calculate("1")

        assertEquals(expected, actual)
    }

    @Test
    fun `given a different number return that number`() {
        var expected = 2
        val actual = calc.calculate("2")

        assertEquals(expected, actual)
    }

    @Test
    fun `given two numbers then a plus sign return the sum of those numbers`() {
        var expected = 4
        val actual = calc.calculate("1 3 +")

        assertEquals(expected, actual)
    }
}
