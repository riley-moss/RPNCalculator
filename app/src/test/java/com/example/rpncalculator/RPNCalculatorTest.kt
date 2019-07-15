package com.example.rpncalculator

import org.junit.Assert.assertEquals
import org.junit.Test

class RPNCalculatorTest {

    @Test
    fun `given a single number return that number`() {
        var calculator = RPNCalculator()
        var expected = 1
        var actual = calculator.solveRPN("1")

        assertEquals(expected, actual)
    }

}
