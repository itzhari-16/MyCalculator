package com.example.mycalculator

sealed class CalculatorOperations(val symbol:String){
    object Add:CalculatorOperations(symbol = "+")
    object Subtract:CalculatorOperations(symbol = "-")
    object Multiply:CalculatorOperations(symbol = "*")
    object Divide:CalculatorOperations(symbol = "/")



}
