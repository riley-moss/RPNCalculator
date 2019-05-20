package com.example.rpncalculator

import android.support.annotation.IntegerRes
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
                else -> stack.push(Integer.parseInt(token))
            }
        }

        return stack.pop()
    }

}
