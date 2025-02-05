package com.example.okey

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.Text
import androidx.compose.material3.TextField
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableIntStateOf
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.geometry.Offset
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun PlayerInterface() {
    var playerName by remember { mutableStateOf("") }
    var playerInputScore by remember { mutableStateOf("") }
    val pl1Null = playerInputScore.toIntOrNull() ?: 0
    var playerSummary by remember { mutableIntStateOf(0) }

    Column {
        TextField(
            value = playerName,
            label = { Text(stringResource(R.string.player_name)) },
            onValueChange = { playerName = it },
            keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Text),
            singleLine = true,
            modifier = Modifier
                .fillMaxWidth()
                .padding(5.dp)
        )
        Row(
            Modifier
                .fillMaxWidth()
                .padding(5.dp),
            horizontalArrangement = Arrangement.SpaceBetween,
            verticalAlignment = Alignment.CenterVertically,
        )
        {
            Text(
                text = playerSummary.toString(),
                modifier = Modifier
                    .width(110.dp),
                fontSize = 33.sp,
                style = TextStyle(
                    shadow = Shadow(
                        color = Color.DarkGray,
                        offset = Offset(5.0f, 10.0f),
                        blurRadius = 30f
                    )
                )
            )
            InputField(
                value = playerInputScore,
                onValueChange = { playerInputScore = it },
                keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
            )
            Button(
                onClick = {
                    playerSummary += pl1Null
                    playerInputScore = ""
                },
                Modifier
                    .width(130.dp)
                    .height(60.dp)
                    .shadow(5.dp, shape = CircleShape)
            ) {
                Text(
                    text = stringResource(R.string.add_score),
                    textAlign = TextAlign.Center,
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