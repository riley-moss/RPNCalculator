package com.example.rpncalculator

import java.util.*

class RPNCalculator {
    fun solveRPN(rpnString: String): Int {
        val rpnArray = rpnString.split(" ")

        val stack = Stack<Int>()
        for(input in rpnArray){
            if(input in listOf("+","-","*","/")) {
                return calculateBasedOnOperand(stack.pop(), stack.pop(), input)
            } else {
                stack.push(input.toInt())
            }
        }

        return stack.pop()
    }

    private fun calculateBasedOnOperand(firstNum: Int, secondNum: Int, operand: String): Int {
        return when (operand) {
            "+" -> firstNum + secondNum
            "-" -> secondNum - firstNum
            "*" -> firstNum * secondNum
            else -> secondNum / firstNum
        }
    }

}
