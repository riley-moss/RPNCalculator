package com.example.rpncalculator

class RPNCalculator {
    fun calculate(input: String): Int {

        if (input.length == 1) {
            return Integer.parseInt(input)
        }

        val splitInput = input.split(" ")
        var output = 0

        val firstOperand = Integer.parseInt(splitInput[0])
        val secondOperand = Integer.parseInt(splitInput[1])
        when (splitInput[2]) {
            "+" -> output = firstOperand + secondOperand
            "-" -> output = firstOperand - secondOperand
            "*" -> output = firstOperand * secondOperand
        }
        return output
    }

}
