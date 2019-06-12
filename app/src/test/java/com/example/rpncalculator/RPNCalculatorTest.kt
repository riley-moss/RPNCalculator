package com.example.rpncalculator

import org.junit.Assert
import org.junit.Test

import org.junit.Assert.*
import org.junit.Ignore

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
}
