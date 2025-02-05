package com.example.okey

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material3.Button
import androidx.compose.material3.Divider
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
    Divider(color = Color.Black, thickness = 1.dp)
    Column(
        horizontalAlignment = Alignment.CenterHorizontally,
        modifier = Modifier.fillMaxWidth()
    ) {
        Text(
            text = "Раундов сыграно:",
            fontSize = 30.sp,
            style = TextStyle(
                shadow = Shadow(
                    color = Color.Gray,
                    offset = Offset(5.0f, 10.0f),
                    blurRadius = 10f
                )
            )
        )
        Row(horizontalArrangement = Arrangement.Center) {
            Button(
                onClick = { roundsCount-- },
                modifier = Modifier.shadow(15.dp, shape = CircleShape)
            ) {
                Text(
                    text = "-",
                    style = TextStyle(
                        shadow = Shadow(
                            color = Color.Black,
                            offset = Offset(5.0f, 10.0f),
                            blurRadius = 15f
                        )
                    )
                )
            }
            Text(
                text = "$roundsCount",
                fontSize = 32.sp,
                style = TextStyle(
                    shadow = Shadow(
                        color = Color.Gray,
                        offset = Offset(5.0f, 10.0f),
                        blurRadius = 20f
                    )
                ),
                modifier = Modifier
                    .padding(30.dp, 0.dp, 30.dp, 0.dp)
            )
            Button(
                onClick = { roundsCount++ },
                modifier = Modifier.shadow(15.dp, shape = CircleShape)
            ) {
                Text(
                    text = "+",
                    style = TextStyle(
                        shadow = Shadow(
                            color = Color.Black,
                            offset = Offset(5.0f, 10.0f),
                            blurRadius = 15f
                        )
                    )
                )
            }
        }
    }
}

@Preview
@Composable
fun Sdfsdf(){
    Rounds()
}