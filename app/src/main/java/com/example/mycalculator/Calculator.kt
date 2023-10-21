package com.example.mycalculator

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
//import androidx.compose.foundation.layout.RowScopeInstance.weight
import androidx.compose.foundation.layout.aspectRatio
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.Dp
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Calculator(
    state: CalculatorState,
    modifier: Modifier=Modifier,
    buttonSpacing:Dp=8.dp,
    onActions: (CalculatorActions)->Unit


) {
    Box(modifier=modifier){
        Column(
            modifier = Modifier
                .fillMaxSize()
                .align(Alignment.BottomCenter),
            verticalArrangement = Arrangement.spacedBy(buttonSpacing)
        )
        {
            Text(text =state.number1+(state.operations?.symbol?:"") +state.number2,
            textAlign = TextAlign.End,
                modifier= Modifier
                    .fillMaxWidth()
                    .padding(vertical = 30.dp),
                fontWeight = FontWeight.Light,
                fontSize = 80.sp,
                color = Color.White,
                maxLines = 2
            )
            Row (modifier=Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ){
                CalculatorButton(
                    symbol = "AC",
                    modifier =Modifier
                        .background(Color.LightGray)
                        .aspectRatio(2f)
                        .weight(2f),
                    onClick = {
                        onActions(CalculatorActions.clear)
                    }
                )
                CalculatorButton(
                    symbol = "Del",
                    modifier =Modifier
                        .background(Color.LightGray)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onActions(CalculatorActions.Delete)
                    }
                )
                CalculatorButton(
                    symbol = "/",
                    modifier =Modifier
                        .background(Color.Green)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onActions(CalculatorActions.Operations(CalculatorOperations.Divide))
                    }
                )
            }
            Row (modifier=Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ){
                CalculatorButton(
                    symbol = "7",
                    modifier =Modifier
                        .background(Color.Black)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onActions(CalculatorActions.Number(7))
                    }
                )
                CalculatorButton(
                    symbol = "8",
                    modifier =Modifier
                        .background(Color.Black)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onActions(CalculatorActions.Number(8))
                    }
                )
                CalculatorButton(
                    symbol = "9",
                    modifier =Modifier
                        .background(Color.Black)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onActions(CalculatorActions.Number(9))
                    }
                )
                CalculatorButton(
                    symbol = "*",
                    modifier =Modifier
                        .background(Color.Green)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onActions(CalculatorActions.Operations(CalculatorOperations.Multiply))
                    }
                )
            }

            Row (modifier=Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ){
                CalculatorButton(
                    symbol = "4",
                    modifier =Modifier
                        .background(Color.Black)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onActions(CalculatorActions.Number(4))
                    }
                )
                CalculatorButton(
                    symbol = "5",
                    modifier =Modifier
                        .background(Color.Black)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onActions(CalculatorActions.Number(5))
                    }
                )
                CalculatorButton(
                    symbol = "6",
                    modifier =Modifier
                        .background(Color.Black)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onActions(CalculatorActions.Number(6))
                    }
                )
                CalculatorButton(
                    symbol = "-",
                    modifier =Modifier
                        .background(Color.Green)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onActions(CalculatorActions.Operations(CalculatorOperations.Subtract))
                    }
                )
            }

            Row (modifier=Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ){
                CalculatorButton(
                    symbol = "1",
                    modifier =Modifier
                        .background(Color.Black)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onActions(CalculatorActions.Number(1))
                    }
                )
                CalculatorButton(
                    symbol = "2",
                    modifier =Modifier
                        .background(Color.Black)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onActions(CalculatorActions.Number(2))
                    }
                )
                CalculatorButton(
                    symbol = "3",
                    modifier =Modifier
                        .background(Color.Black)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onActions(CalculatorActions.Number(3))
                    }
                )
                CalculatorButton(
                    symbol = "+",
                    modifier =Modifier
                        .background(Color.Green)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onActions(CalculatorActions.Operations(CalculatorOperations.Add))
                    }
                )
            }
            Row (modifier=Modifier.fillMaxWidth(),
                horizontalArrangement = Arrangement.spacedBy(buttonSpacing)
            ){
                CalculatorButton(
                    symbol = "0",
                    modifier =Modifier
                        .background(Color.Black)
                        .aspectRatio(2f)
                        .weight(2f),
                    onClick = {
                        onActions(CalculatorActions.Number(0))
                    }
                )

                CalculatorButton(
                    symbol = ".",
                    modifier =Modifier
                        .background(Color.Black)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onActions(CalculatorActions.Decimal)
                    }
                )
                CalculatorButton(
                    symbol = "=",
                    modifier =Modifier
                        .background(Color.Yellow)
                        .aspectRatio(1f)
                        .weight(1f),
                    onClick = {
                        onActions(CalculatorActions.Calculate)
                    }
                )
            }
        }
    }
}