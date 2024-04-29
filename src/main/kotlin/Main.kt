package org.example

fun main() {
    var isValidInput = true
    while (isValidInput) {
        try {
            println("--------------------")
            println("연산자(+,-,*,/,%)를 입력하세요")
            val operator = readLine().toString()

            val opList = arrayOf("+", "-", "*", "/", "%")
            if (!opList.contains(operator)) {
                println("+,-,*,/,% 중 입력하세요")
                continue
            }

            println("첫 번째 숫자를 입력하세요")
            val num1 = readLine()!!.toInt()
            println("두 번째 숫자를 입력하세요")
            val num2 = readLine()!!.toInt()

            if (operator == "/" && num2 == 0) {
                println("0으로 나눌 수 없습니다.")
                continue
            }

            selectedOperator(operator, num1, num2)

            isValidInput = false

        } catch (e: NumberFormatException) {
            println("숫자를 입력하세요")
            continue
        }
    }

}

fun selectedOperator(operator: String, num1: Int, num2: Int) {
    val calc = Calculator()

    val selectOp = when (operator) {
        "+" -> AddOperation()
        "-" -> SubstractOperation()
        "*" -> MultiplyOperation()
        "/" -> DivideOperation()
        "%" -> RemainderOperation()
        else -> {
            return
        }
    }

    val result = calc.Operation(selectOp, num1, num2)
    println("${num1} ${operator} ${num2} = ${result}")

}