package com.example.rpncalculator

import org.junit.Assert.assertEquals
import org.junit.Ignore
import org.junit.Test

class RPNCalculatorTest {
    private val calculator = RPNCalculator()

    //Single integer input
    @Test
    fun `given a single number return that number`() {
        val expected = 1
        val actual = calculator.solveRPN("1")

        assertEquals(expected, actual)
    }

    @Test
    fun `given a different single number return that number`() {
        val expected = 2
        val actual = calculator.solveRPN("2")

        assertEquals(expected, actual)
    }

    @Test
    fun `given a another different single number return that number`() {
        val expected = 3
        val actual = calculator.solveRPN("3")

        assertEquals(expected, actual)
    }

    //Two integers and operand input - Addition
    @Test
    fun `given two integers and a plus sign return sum of integers`() {
        val expected = 2
        val actual = calculator.solveRPN("1 1 +")

        assertEquals(expected, actual)
    }

    @Test
    fun `given two different integers and a plus sign return sum`() {
        val expected = 4
        val actual = calculator.solveRPN("2 2 +")

        assertEquals(expected, actual)
    }

    @Test
    fun `given another two different integers and a plus sign return sum`() {
        val expected = 6
        val actual = calculator.solveRPN("3 3 +")

        assertEquals(expected, actual)
    }

    //Two integers and operand input - Other operands
    @Test
    fun `given two integers and a minus sign return difference`() {
        val expected = 0
        val actual  = calculator.solveRPN("1 1 -")

        assertEquals(expected, actual)
    }

    @Test
    fun `given two integers and asterik return product`() {
        val expected = 4
        val actual  = calculator.solveRPN("2 2 *")

        assertEquals(expected, actual)
    }

    @Test
    fun `given two integers and forward slash return quotient`() {
        val expected = 3
        val actual  = calculator.solveRPN("9 3 /")

        assertEquals(expected, actual)
    }

    //Three integers and two operand input
    @Test
    fun `given multiple integers and two plus signs return sum of all numbers`() {
        val expected = 3
        val actual = calculator.solveRPN("1 1 + 1 +")

        assertEquals(expected, actual)
    }

    @Test
    fun `given multiple integers and two different operands return output`() {
        val expected = 10
        val actual = calculator.solveRPN("1 1 + 5 *")

        assertEquals(expected, actual)
    }

    @Test
    fun `given multiple integers and two operands in different format return calculated answer`() {
        val expected = 10
        val actual = calculator.solveRPN("5 1 1 + *")

        assertEquals(expected, actual)
    }

}
