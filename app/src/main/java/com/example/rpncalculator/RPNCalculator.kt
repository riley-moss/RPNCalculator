package com.example.rpncalculator

import java.util.*

class RPNCalculator {
    fun calculate(input: String): Int? {
        if (input.length == 1) {
            return Integer.parseInt(input)
        }

        val operators = arrayListOf("+", "-", "*", "/")

        val splitInput = input.split(" ")
        val stack = Stack<Int>()

        for (item in splitInput) {
            if (item in operators) {
                stack.push(doMath(stack.pop(), stack.pop(), item))
            } else {
                stack.push(Integer.parseInt(item))
            }
        }
        return stack.pop()
    }

    private fun doMath(firstNum: Int, secondNum: Int, operator: String): Int {
        return when (operator) {
            "+" -> firstNum + secondNum
            "*" -> firstNum * secondNum
            "/" -> secondNum / firstNum
            else -> secondNum - firstNum
        }
    }
}
