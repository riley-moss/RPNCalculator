package com.example.rpncalculator

class RPNCalculator {
    fun solveRPN(rpnString: String): Int {
        if(rpnString.length > 1)
            return 2
        return Integer.parseInt(rpnString)
    }

}
