package com.example.rpncalculator

import org.junit.Assert.assertEquals
import org.junit.Ignore
import org.junit.Test

class RPNCalculatorTest {

    private var calc = RPNCalculator()

    @Test
    fun `given a single number return that number`() {
        val expected = 1
        val actual = calc.calculate("1")

        assertEquals(expected, actual)
    }

    @Test
    fun `given a different number return that number`() {
        val expected = 2
        val actual = calc.calculate("2")

        assertEquals(expected, actual)
    }

    @Test
    fun `given two numbers then a plus sign return the sum of those numbers`() {
        val expected = 4
        val actual = calc.calculate("1 3 +")

        assertEquals(expected, actual)
    }

    @Test
    fun `given two different numbers then a plus sign return the sum of those numbers`() {
        val expected = 10
        val actual = calc.calculate("4 6 +")

        assertEquals(expected, actual)
    }

    @Test
    fun `given two numbers then a minus sign return the first less the second`() {
        val expected = 1
        val actual = calc.calculate("2 1 -")

        assertEquals(expected, actual)
    }

    @Test
    fun `given two numbers then a multiplication sign return the product of those numbers`() {
        val expected = 20
        val actual = calc.calculate("4 5 *")

        assertEquals(expected, actual)
    }

    @Test
    fun `given two numbers then a division sign return the first divided by the second`() {
        val expected = 3
        val actual = calc.calculate("12 4 /")

        assertEquals(expected, actual)
    }

    @Test
    fun `given two numbers, plus sign, another number, then another plus sign`() {
        val expected = 6
        val actual = calc.calculate("1 2 + 3 +")

        assertEquals(expected, actual)
    }

    @Test
    fun `given three numbers, a plus sign, then a multiplication sign`() {
        val expected = 8
        val actual = calc.calculate("2 1 3 + *")

        assertEquals(expected, actual)
    }

    @Test
    fun `given longer string with multiple numbers and operators`() {
        val expected = 210
        val actual = calc.calculate("5 3 3 + * 2 / 14 *")

        assertEquals(expected, actual)
    }

    @Test
    fun `given a string of numbers and MAX return the max of all the numbers`() {
        val expected = 20
        val actual = calc.calculate("1 2 3 4 5 20 3 5 2 MAX")

        assertEquals(expected, actual)
    }

    @Test
    fun `given two MAX lists and multiplication sign, return the product of the two maxes`() {
        val expected = 30
        val actual = calc.calculate("3 4 5 MAX 1 2 6 MAX *")

        assertEquals(expected, actual)
    }

}
