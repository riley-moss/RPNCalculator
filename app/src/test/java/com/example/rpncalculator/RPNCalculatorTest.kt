package com.example.rpncalculator

import org.junit.Test

import org.junit.Assert.*
import org.junit.Ignore

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

    @Test
    fun `given '5 2 *' return 10`() {
        assertEquals(10, calc.calculate("5 2 *"))
    }

    @Test
    fun `given '9 3 forward-slash' return 3`() {
        assertEquals(3, calc.calculate("9 3 /"))
    }

    @Test
    fun `given '1 2 + 3 +' return 6`() {
        assertEquals(6, calc.calculate("1 2 + 3 +"))
    }

    @Test
    fun `given '3 5 8 * 7 + *' return 141`() {
        assertEquals(141, calc.calculate("3 5 8 * 7 + *"))
    }

    @Test
    fun `given '9 SQRT' return 3`() {
        assertEquals(3, calc.calculate("9 SQRT"))
    }

    @Test
    fun `given '5 3 4 2 9 1 MAX' return 9`() {
        assertEquals(9, calc.calculate("5 3 4 2 9 1 MAX"))
    }
}
