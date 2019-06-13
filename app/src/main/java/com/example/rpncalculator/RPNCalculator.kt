package com.example.rpncalculator

class RPNCalculator {
    fun calculate(input: String): Int? {
        if(input.length == 1) {
            return Integer.parseInt(input)
        }

        val splitInput = input.split(" ")
        return doMath(splitInput)
    }

    private fun doMath(splitInput: List<String>): Int {
        if (splitInput[2] == "+")
            return Integer.parseInt(splitInput[0]) + Integer.parseInt(splitInput[1])
        else if (splitInput[2] == "*")
            return Integer.parseInt(splitInput[0]) * Integer.parseInt(splitInput[1])

        return Integer.parseInt(splitInput[0]) - Integer.parseInt(splitInput[1])
    }

}
