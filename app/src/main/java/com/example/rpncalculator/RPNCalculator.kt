package com.example.rpncalculator

class RPNCalculator {
    fun calculate(input: String): Int? {
        val splitInput = input.split(" ")
        if(splitInput.size == 1) {
            return Integer.parseInt(input)
        }

        if(splitInput[2] == "+")
            return Integer.parseInt(splitInput[0]) + Integer.parseInt(splitInput[1])
        else if(splitInput[2] == "*")
            return Integer.parseInt(splitInput[0]) * Integer.parseInt(splitInput[1])

        return Integer.parseInt(splitInput[0]) - Integer.parseInt(splitInput[1])
    }

}
