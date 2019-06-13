package com.example.rpncalculator

class RPNCalculator {
    fun calculate(input: String): Int? {
        if(input.length == 1) {
            return Integer.parseInt(input)
        }

        val splitInput = input.split(" ")
        return doMath(splitInput[0], splitInput[1], splitInput[2])
    }

    private fun doMath(firstNum:String, secondNum:String, operator:String): Int {
        return when (operator) {
            "+" -> Integer.parseInt(firstNum) + Integer.parseInt(secondNum)
            "*" -> Integer.parseInt(firstNum) * Integer.parseInt(secondNum)
            "/" -> Integer.parseInt(firstNum) / Integer.parseInt(secondNum)
            else -> Integer.parseInt(firstNum) - Integer.parseInt(secondNum)
        }
    }

}
