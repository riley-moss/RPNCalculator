package com.example.rpncalculator

class RPNCalculator {
    fun solveRPN(rpnString: String): Int {
        if (rpnString.length == 1)
            return Integer.parseInt(rpnString)

        val rpnArray = rpnString.split(" ")
        
        return when(rpnArray[2]) {
            "+" -> rpnArray[0].toInt() + rpnArray[1].toInt()
            "-" -> rpnArray[0].toInt() - rpnArray[1].toInt()
            "*" -> rpnArray[0].toInt() * rpnArray[1].toInt()
            else -> rpnArray[0].toInt() / rpnArray[1].toInt()
        }
    }

}
