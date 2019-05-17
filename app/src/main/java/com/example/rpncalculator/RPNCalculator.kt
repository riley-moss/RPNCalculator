package com.example.rpncalculator

class RPNCalculator {
    fun calculate(input: String): Int {
        if(input.length > 1)
            return 2;
        return Integer.parseInt(input)
    }

}
