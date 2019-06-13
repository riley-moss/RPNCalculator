package com.example.rpncalculator

import java.util.*

class RPNCalculator {
    fun calculate(input: String): Int {
        if (input.length == 1) {
            return Integer.parseInt(input)
        }

        val operators = arrayListOf("+", "-", "*", "/")

        val splitInput = input.split(" ")
        val stack = Stack<Int>()

        for (item in splitInput) {
            stack.push(when (item) {
                "+" -> stack.pop() + stack.pop()
                "*" -> stack.pop() * stack.pop()
                "/" -> {
                    val divisor = stack.pop()
                    stack.pop() / divisor
                }
                "-" -> -stack.pop() + stack.pop()
                else -> Integer.parseInt(item)
            })
        }
        return stack.pop()
    }
}
