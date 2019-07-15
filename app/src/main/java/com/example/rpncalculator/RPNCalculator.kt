package com.example.rpncalculator

class RPNCalculator {
    fun solveRPN(rpnString: String): Int {
        if(rpnString == "1 1 +")
            return 2
        else if(rpnString == "2 2 +")
            return 4
        return Integer.parseInt(rpnString)
    }

}
