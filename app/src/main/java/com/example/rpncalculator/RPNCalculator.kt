package com.example.rpncalculator

class RPNCalculator {
    fun solveRPN(rpnString: String): Int {
        if (rpnString.length == 1)
            return Integer.parseInt(rpnString)

        val rpnArray = rpnString.split(" ")

        val firstOutput = calculateBasedOnOperand(rpnArray[0], rpnArray[1], rpnArray[2])
        if (rpnArray.size == 3)
            return firstOutput
        return calculateBasedOnOperand(firstOutput.toString(), rpnArray[3], rpnArray[4])
    }

    private fun calculateBasedOnOperand(firstNum: String, secondNum: String, operand: String): Int {
        return when (operand) {
            "+" -> firstNum.toInt() + secondNum.toInt()
            "-" -> firstNum.toInt() - secondNum.toInt()
            "*" -> firstNum.toInt() * secondNum.toInt()
            else -> firstNum.toInt() / secondNum.toInt()
        }
    }

}
