package com.example.happybirthday

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontFamily.Companion.Cursive
import androidx.compose.ui.text.font.FontFamily.Companion.Serif
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.happybirthday.ui.theme.HappyBirthdayTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            HappyBirthdayTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage(
                        message = "Happy Birthday❤︎\n",
                        name = "Sayanda Rayaroth velluva",
                        from = "From Kumaran"
                    )
                }
            }
        }
    }
}

@Composable
fun Greeting(message: String, name: String, from: String, modifier: Modifier = Modifier) {
    Column(
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(8.dp)
    ) {
        Text(
            text = message,
            fontSize = 50.sp,
            color = Color.Red,
            fontWeight = FontWeight(900),
            fontFamily = Cursive,
            lineHeight = 60.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = name,
            fontSize = 70.sp,
            color = Color.Magenta,
            fontWeight = FontWeight(550),
            fontFamily = Serif,
            lineHeight = 75.sp,
            modifier = modifier
        )

        Text(
            text = from,
            color = Color.Blue,
            fontSize = 40.sp,
            fontWeight = FontWeight(900),
            fontFamily = Cursive,
            modifier = Modifier
                .padding(16.dp)
                .align(alignment = Alignment.End)
        )
    }
}

@Composable
fun GreetingImage(message: String, name: String, from: String, modifier: Modifier = Modifier) {
    val image = painterResource(R.drawable.catbg2)
    Box(modifier) {
        Image(
            painter = image,
            contentDescription = null,
            contentScale = ContentScale.Crop,
            alpha = 0.5F
        )
        Greeting(
            message = message,
            name = name,
            from = from,
            modifier = Modifier
                //.fillMaxSize()
                .padding(8.dp)
        )
    }
}
