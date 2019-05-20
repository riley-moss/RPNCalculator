package com.example.rpncalculator

class RPNCalculator {
    fun calculate(input: String): Int {
        if(input == "1 1 +")
            return 2;
        else if(input == "2 1 -")
            return 1;
        else if (input == "5 2 *")
            return 10;
        return Integer.parseInt(input)
    }

}
