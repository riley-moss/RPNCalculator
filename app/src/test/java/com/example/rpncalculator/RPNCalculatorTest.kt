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
    fun `given a number return that number`() {
        assertEquals(1, calc.calculate("1"))
    }

    @Test
    fun `given a different number return that number`() {
        assertEquals(2, calc.calculate("2"))
    }

    @Test
    fun `given 2 numbers and a plus sign return those numbers added together`() {
        assertEquals(2, calc.calculate("1 1 +"))
    }

    @Test
    fun `given 2 numbers and a minus sign return the difference of those numbers`() {
        assertEquals(1, calc.calculate("2 1 -"))
    }

    @Test
    fun `given 2 numbers and a multiply sign return those numbers multiplied together`() {
        assertEquals(10, calc.calculate("5 2 *"))
    }

    @Test
    fun `given 2 numbers and a division sign return the value of the first divided by the second`() {
        assertEquals(3, calc.calculate("9 3 /"))
    }

    @Test
    fun `given an input with 2 operands return the correct output based on order of operations`() {
        assertEquals(6, calc.calculate("1 2 + 3 +"))
    }

    @Test
    fun `given an input with 3 operands return the correct output based on order of operations`() {
        assertEquals(141, calc.calculate("3 5 8 * 7 + *"))
    }

    @Test
    fun `given a number and SQRT return the square root of that number`() {
        assertEquals(3, calc.calculate("9 SQRT"))
    }

    @Test
    fun `given a list of numbers and MAX return the max value in all those numbers`() {
        assertEquals(9, calc.calculate("5 3 4 2 9 1 MAX"))
    }

    @Test
    fun `given two MAX lists and a multiply sign return the max of both lists multiplied together`() {
        assertEquals(10, calc.calculate("4 5 MAX 1 2 MAX *"))
    }
}
