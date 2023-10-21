package com.example.mycalculator

import android.media.VolumeShaper.Operation

sealed class CalculatorActions{
    data class Number(val number: Int):CalculatorActions()
    object clear:CalculatorActions()
    object Delete:CalculatorActions()
    object Decimal:CalculatorActions()
    object Calculate:CalculatorActions()
    data class Operations(val Operation:CalculatorOperations): CalculatorActions()
}
