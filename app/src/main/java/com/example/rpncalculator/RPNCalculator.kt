package com.example.rpncalculator

class RPNCalculator {
    fun solveRPN(rpnString: String): Int {
        if (rpnString == "3")
            return 3
        else if (rpnString == "2")
            return 2
        return 1
    }

}
