package com.example.rpncalculator

class RPNCalculator {
    fun solveRPN(rpnString: String): Int {
        if (rpnString.length == 1)
            return Integer.parseInt(rpnString)

        val rpnArray = rpnString.split(" ")

        return calculateBasedOnOperand(rpnArray[0], rpnArray[1], rpnArray[2])
    }

    private fun calculateBasedOnOperand(firstNum: String, secondNum: String, operand:String): Int {
        return when (operand) {
            "+" -> firstNum.toInt() + secondNum.toInt()
            "-" -> firstNum.toInt() - secondNum.toInt()
            "*" -> firstNum.toInt() * secondNum.toInt()
            else -> firstNum.toInt() / secondNum.toInt()
        }
    }

}
