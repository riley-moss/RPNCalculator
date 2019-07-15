package com.example.rpncalculator

import org.junit.Assert.assertEquals
import org.junit.Test

class RPNCalculatorTest {

    //Single integer input
    @Test
    fun `given a single number return that number`() {
        val calculator = RPNCalculator()
        val expected = 1
        val actual = calculator.solveRPN("1")

        assertEquals(expected, actual)
    }

    @Test
    fun `given a different single number return that number`() {
        val calculator = RPNCalculator()
        val expected = 2
        val actual = calculator.solveRPN("2")

        assertEquals(expected, actual)
    }

    @Test
    fun `given a another different single number return that number`() {
        val calculator = RPNCalculator()
        val expected = 3
        val actual = calculator.solveRPN("3")

        assertEquals(expected, actual)
    }

    //Two integer and operand input
    @Test
    fun `given two integers and a plus sign return sum of integers`() {
        val calculator = RPNCalculator()
        val expected = 2
        val actual = calculator.solveRPN("1 1 +")

        assertEquals(expected, actual)
    }
}
