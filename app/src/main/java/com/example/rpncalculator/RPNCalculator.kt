package com.example.rpncalculator

class RPNCalculator {
    fun solveRPN(rpnString: String): Int {
        if(rpnString.length == 1)
            return Integer.parseInt(rpnString)

        val rpnArray = rpnString.split(" ")
        return rpnArray[0].toInt() + rpnArray[1].toInt()
    }

}
