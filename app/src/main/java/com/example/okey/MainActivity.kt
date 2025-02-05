package com.example.okey

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
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
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.okey.ui.theme.OKEYTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            OKEYTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Okay()
                }
            }
        }
    }
}

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun Okay() {
    var pl1Name by remember { mutableStateOf("") }
    var pl2Name by remember { mutableStateOf("") }
    var pl3Name by remember { mutableStateOf("") }
    var pl4Name by remember { mutableStateOf("") }

    var pl1 by remember { mutableStateOf("") }
    val pl1Null = pl1.toIntOrNull() ?: 0
    var sum1pl by remember { mutableIntStateOf(0) }

    var pl2 by remember { mutableStateOf("") }
    val pl2Null = pl2.toIntOrNull() ?: 0
    var sum2pl by remember { mutableIntStateOf(0) }

    var pl3 by remember { mutableStateOf("") }
    val pl3Null = pl3.toIntOrNull() ?: 0
    var sum3pl by remember { mutableIntStateOf(0) }

    var pl4 by remember { mutableStateOf("") }
    val pl4Null = pl4.toIntOrNull() ?: 0
    var sum4pl by remember { mutableIntStateOf(0) }

    Column(

        modifier = Modifier
            .background(color = Color.LightGray)
            .fillMaxHeight(),
        verticalArrangement = Arrangement.Center,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Column {
            TextField(
                value = pl1Name,
                label = { Text(text = "Имя первого игрока") },
                onValueChange = { pl1Name = it },
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
                    text = sum1pl.toString(),
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
                    value = pl1,
                    onValueChange = { pl1 = it },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )
//                Text("$round1")
                Button(
                    onClick = {
                        sum1pl += pl1Null
                        pl1 = ""
                        //                       round1++
                    },
                    Modifier
                        .width(130.dp)
                        .height(60.dp)
                        .shadow(5.dp, shape = CircleShape)
                ) {
                    Text(
                        text = "Добавить очки",
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
        Column {
            TextField(
                value = pl2Name,
                label = { Text(text = "Имя второго игрока") },
                onValueChange = { pl2Name = it },
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
                    text = sum2pl.toString(),
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
                    value = pl2,
                    onValueChange = { pl2 = it },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )
                Button(
                    onClick = {
                        sum2pl += pl2Null
                        pl2 = ""
                    },
                    Modifier
                        .width(130.dp)
                        .height(60.dp)
                        .shadow(5.dp, shape = CircleShape)
                ) {
                    Text(
                        text = "Добавить очки",
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
        Column {
            TextField(
                value = pl3Name,
                label = { Text(text = "Имя третьего игрока") },
                onValueChange = { pl3Name = it },
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
                    text = sum3pl.toString(),
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
                    value = pl3,
                    onValueChange = { pl3 = it },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )
                Button(
                    onClick = {
                        sum3pl += pl3Null
                        pl3 = ""
                    },
                    Modifier
                        .width(130.dp)
                        .height(60.dp)
                        .shadow(5.dp, shape = CircleShape)
                ) {
                    Text(
                        text = "Добавить очки",
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
        Column {
            TextField(
                value = pl4Name,
                label = { Text(text = "Имя четвертого игрока") },
                onValueChange = { pl4Name = it },
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
                    text = sum4pl.toString(),
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
                    value = pl4,
                    onValueChange = { pl4 = it },
                    keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number)
                )
                Button(
                    onClick = {
                        sum4pl += pl4Null
                        pl4 = ""
                    },
                    Modifier
                        .width(130.dp)
                        .height(60.dp)
                        .shadow(5.dp, shape = CircleShape)
                ) {
                    Text(
                        text = "Добавить очки",
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
        Spacer(modifier = Modifier.height(10.dp))
        Rounds()
    }
}

@Preview(showBackground = true, showSystemUi = true)
@Composable
fun OkayPreview() {
    OKEYTheme {
        Okay()
    }
}
