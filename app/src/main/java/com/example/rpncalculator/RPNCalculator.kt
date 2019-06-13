package com.example.rpncalculator

class RPNCalculator {
    fun calculate(input: String): Int? {
        if (input.length == 1) {
            return Integer.parseInt(input)
        }

        val splitInput = input.split(" ")
        return doMath(Integer.parseInt(splitInput[0]), Integer.parseInt(splitInput[1]), splitInput[2])
    }

    private fun doMath(firstNum: Int, secondNum: Int, operator: String): Int {
        return when (operator) {
            "+" -> firstNum + secondNum
            "*" -> firstNum * secondNum
            "/" -> firstNum / secondNum
            else -> firstNum - secondNum
        }
    }

}
