package com.example.rpncalculator

import org.junit.Assert.assertEquals
import org.junit.Test

class RPNCalculatorTest {

    @Test
    fun `given a single number return that number`() {
        val calculator = RPNCalculator()
        val expected = 1
        val actual = calculator.solveRPN("1")

        assertEquals(expected, actual)
    }
}
