package org.example

class MultiplyOperation: Operator(){
    override fun operation(num1:Int, num2:Int):Double = (num1*num2).toDouble()
}