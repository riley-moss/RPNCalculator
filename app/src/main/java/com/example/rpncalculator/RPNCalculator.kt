package com.example.rpncalculator

import java.util.*

class RPNCalculator {

    private val stack = Stack<Int>()
    private var prevMaxIndex = 0
    fun calculate(input: String): Int {
        if (input.length == 1) {
            return Integer.parseInt(input)
        }

        val splitInput = input.split(" ")
        for (item in splitInput) {
            stack.push(doMath(item))
        }
        return stack.pop()
    }

    private fun doMath(item: String): Int {
        return when (item) {
            "+" -> stack.pop() + stack.pop()
            "*" -> stack.pop() * stack.pop()
            "/" -> {
                val divisor = stack.pop()
                stack.pop() / divisor
            }
            "-" -> -stack.pop() + stack.pop()
            "MAX" -> {
                var max = stack.pop()
                while (stack.size > prevMaxIndex) {
                    val popped = stack.pop()
                    if (popped > max) {
                        max = popped
                    }
                }
                prevMaxIndex++
                max
            }
            "SQRT" -> Math.sqrt(stack.pop().toDouble()).toInt()
            else -> Integer.parseInt(item)
        }
    }
}
