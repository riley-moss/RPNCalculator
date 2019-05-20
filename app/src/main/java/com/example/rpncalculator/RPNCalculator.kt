package com.example.rpncalculator

import java.util.*
import kotlin.collections.ArrayList

class RPNCalculator {

    private val OPERANDS: ArrayList<String> = arrayListOf("+", "-", "*", "/")

    fun calculate(input: String): Int {
        val splitInput = input.split(" ")

        var stack = Stack<Int>()

        var outputTracker = 0

        for (token in splitInput) {
            when (token) {
                "+" -> {
                    stack.push(stack.pop() + stack.pop())
                    outputTracker++
                }
                "-" -> {
                    stack.push(stack.pop() * -1 + stack.pop())
                    outputTracker++
                }
                "*" -> {
                    stack.push(stack.pop() * stack.pop())
                    outputTracker++
                }
                "/" -> {
                    val divisor = stack.pop()
                    stack.push(stack.pop() / divisor)
                    outputTracker++
                }
                "SQRT" -> {
                    val squareRootedValue = Math.sqrt(stack.pop().toDouble())
                    stack.push(squareRootedValue.toInt())
                    outputTracker++
                }
                "MAX" -> {
                    var max = stack.pop()
                    while(stack.size > outputTracker) {
                        val nextNum = stack.pop()
                        if(nextNum > max)
                            max = nextNum
                    }
                    stack.push(max)
                    outputTracker++

                }
                else -> stack.push(Integer.parseInt(token))
            }
        }

        return stack.pop()
    }

}
