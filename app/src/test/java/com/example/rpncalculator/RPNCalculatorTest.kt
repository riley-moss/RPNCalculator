package com.example.rpncalculator

import org.junit.Test

import org.junit.Assert.*

/**
 * Example local unit test, which will execute on the development machine (host).
 *
 * See [testing documentation](http://d.android.com/tools/testing).
 */
class RPNCalculatorTest {

    private val calc = RPNCalculator()

    @Test
    fun `given '1' return 1`() {
        assertEquals(1, calc.calculate("1"))
    }

    @Test
    fun `given '2' return 2`() {
        assertEquals(2, calc.calculate("2"))
    }

    @Test
    fun `given '1 1 +' return 2`() {
        assertEquals(2, calc.calculate("1 1 +"))
    }

    @Test
    fun `given '2 1 -' return 1`() {
        assertEquals(1, calc.calculate("2 1 -"))
    }
}
