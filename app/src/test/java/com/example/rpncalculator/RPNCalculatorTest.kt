package com.example.rpncalculator

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class RPNCalculatorTest {
    @Test
    fun `given '1' return 1`() {
        val calc = RPNCalculator()
        assertEquals(1, calc.calculate("1"))
    }

    @Test
    fun `given '2' return 2`() {
        val calc = RPNCalculator()
        assertEquals(2, calc.calculate("2"))
    }
}
