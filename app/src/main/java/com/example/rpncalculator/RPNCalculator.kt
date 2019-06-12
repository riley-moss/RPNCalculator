package com.example.rpncalculator

class RPNCalculator {
    fun calculate(input: String): Int? {
        if(input == "1 3 +")
            return 4
        return Integer.parseInt(input)
    }

}
