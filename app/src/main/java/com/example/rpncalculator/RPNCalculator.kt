package com.example.rpncalculator

import java.util.*
import kotlin.collections.ArrayList

class RPNCalculator {

    private val OPERANDS: ArrayList<String> = arrayListOf("+", "-", "*", "/")
    private var stack = Stack<Int>()
    private var outputTracker = 0

    private val functionMap: Map<String, () -> Int> =
        mapOf("+" to { stack.pop() + stack.pop() },
            "-" to { subtraction(stack.pop(), stack.pop()) },
            "*" to { stack.pop() * stack.pop() },
            "/" to { division(stack.pop(), stack.pop()) },
            "SQRT" to { squareRoot(stack.pop())},
            "MAX" to { findMax()} )

    fun calculate(input: String): Int {
        val splitInput = input.split(" ")

        for (token in splitInput) {
            if (functionMap.containsKey(token)) {
                stack.push(functionMap[token]?.invoke())
                outputTracker++
            }
            else {
                stack.push(Integer.parseInt(token))
            }
        }

        return stack.pop()
    }

    private fun subtraction(firstNum: Int, secondNum: Int): Int =
        secondNum - firstNum

    private fun division(divisor: Int, dividend: Int): Int =
        dividend / divisor

    private fun squareRoot(num:Int): Int {
        val squareRootedValue = Math.sqrt(num.toDouble())
        return squareRootedValue.toInt()
    }
    private fun findMax(): Int {
        var max = stack.pop()
        while (stack.size > outputTracker) {
            val nextNum = stack.pop()
            if (nextNum > max)
                max = nextNum
        }
        return max
    }


}
