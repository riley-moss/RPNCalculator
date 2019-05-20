package com.example.rpncalculator

import java.util.*
import kotlin.collections.ArrayList

class RPNCalculator {

    private val OPERANDS: ArrayList<String> = arrayListOf("+", "-", "*", "/")

    fun calculate(input: String): Int {
        val splitInput = input.split(" ")

        var stack = Stack<Int>()

        for (token in splitInput) {
            when (token) {
                "+" -> stack.push(stack.pop() + stack.pop())
                "-" -> stack.push(stack.pop() * -1 + stack.pop())
                "*" -> stack.push(stack.pop() * stack.pop())
                "/" -> {
                    val divisor = stack.pop()
                    stack.push(stack.pop() / divisor)
                }
                "SQRT" -> {
                    val squareRootedValue = Math.sqrt(stack.pop().toDouble())
                    stack.push(squareRootedValue.toInt())
                }
                "MAX" -> {
                    var max = stack.pop()
                    while(!stack.empty()) {
                        val nextNum = stack.pop()
                        if(nextNum > max)
                            max = nextNum
                    }
                    stack.push(max)

                }
                else -> stack.push(Integer.parseInt(token))
            }
        }

        return stack.pop()
    }

}
