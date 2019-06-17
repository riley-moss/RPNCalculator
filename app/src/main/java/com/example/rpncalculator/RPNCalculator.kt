package com.example.rpncalculator

import java.util.*

class RPNCalculator {
    private var prevMaxIndex: Int = 0

    fun calculate(input: String): Int {
        if (input.length == 1) {
            return Integer.parseInt(input)
        }

        val splitInput = input.split(" ")
        val stack = Stack<Int>()
        prevMaxIndex = 0
        for (item in splitInput) {
            stack.push(calculateBasedOnOperator(item, stack))
        }
        return stack.pop()
    }

    private fun calculateBasedOnOperator(item: String, stack: Stack<Int>): Int {
        return when (item) {
            "+" -> stack.pop() + stack.pop()
            "*" -> stack.pop() * stack.pop()
            "/" -> {
                val divisor = stack.pop()
                stack.pop() / divisor
            }
            "-" -> -stack.pop() + stack.pop()
            "MAX" -> {
                getMax(stack)
            }
            "SQRT" -> Math.sqrt(stack.pop().toDouble()).toInt()
            else -> Integer.parseInt(item)
        }
    }

    private fun getMax(stack: Stack<Int>): Int {
        var max = stack.pop()
        while (stack.size > prevMaxIndex) {
            val popped = stack.pop()
            if (popped > max) {
                max = popped
            }
        }
        prevMaxIndex++
        return max
    }
}
