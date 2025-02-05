package com.example.okey

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.HorizontalDivider
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun Rounds() {

    var roundsCount by remember { mutableIntStateOf(0) }
    val textStyle = TextStyle(
        shadow = Shadow(
            color = Color(0x7A000000),
            offset = Offset(5.0f, 10.0f),
            blurRadius = 15f,
        )
    )
    HorizontalDivider(color = Color.Black, thickness = 1.dp)
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(text = "Раундов сыграно:", fontSize = 30.sp, style = textStyle)
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically
        ) {
            Button(
                onClick = { roundsCount = sumAction(roundsCount, PlusMinus.Minus) },
                modifier = Modifier.shadow(15.dp, shape = CircleShape)
            ) {
                Text(text = "-", style = textStyle, fontSize = 20.sp)
            }
            Text(
                text = "$roundsCount",
                fontSize = 32.sp,
                style = textStyle,
                modifier = Modifier
                    .padding(30.dp, 0.dp, 30.dp, 0.dp)
            )
            Button(
                onClick = { roundsCount = sumAction(roundsCount, PlusMinus.Plus) },
                modifier = Modifier
                    .shadow(15.dp, shape = CircleShape)
                    .height(40.dp),
                ) {
                Text(text = "+", fontSize = 20.sp, style = textStyle)
            }
        }
    }
}

private fun sumAction(rounds: Int, action: PlusMinus): Int =
    if (action is PlusMinus.Plus) rounds + 1 else if (rounds == 0) 0 else rounds - 1

interface PlusMinus {
    object Plus : PlusMinus
    object Minus : PlusMinus
}

@Preview
@Composable
fun Sdfsdf() {
    Rounds()
}