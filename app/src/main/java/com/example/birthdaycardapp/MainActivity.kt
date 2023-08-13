package com.example.birthdaycardapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.example.birthdaycardapp.ui.theme.BirthdayCardAppTheme
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            BirthdayCardAppTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    /*modifier = Modifier.fillMaxSize(),*/
                    color = MaterialTheme.colorScheme.background
                ) {
                    GreetingImage("James", from = "~ From Irfando")
                }
            }
        }
    }
}

/*#pertama*/
@Composable
fun GreetingText(name: String, from : String, modifier: Modifier = Modifier) {
    Column (
        verticalArrangement = Arrangement.Center,
        modifier = modifier.padding(8.dp))
    {
        Text(
            text = "Happy Birthday $name :)",
            fontSize = 87.sp,
            lineHeight = 116.sp,
            textAlign = TextAlign.Center
        )
        Text(
            text = from,
            fontSize = 36.sp,
            modifier = Modifier
                .padding(top = 16.dp)
                .padding(end = 16.dp)
                .align(alignment = Alignment.End)
        )
    }
}

/*#Ketiga*/
/*menambahkan gambar secara composable*/
@Composable
fun GreetingImage(name: String, from: String, modifier: Modifier = Modifier) {
    /*cara memanggil gambar*/
    //Step nextcreate a box to overlap image and texts
    val image = painterResource(R.drawable.androidparty)
    Box {
        Image(
            painter = image,
            contentDescription = null
        )
        GreetingText(
                name = name,
                from = from,
                modifier = Modifier.fillMaxSize().padding(0.dp)
        )
    }
}

/*#Kedua*/
@Preview(showBackground = true)
@Composable
fun BirthdayCardPreview() {
    BirthdayCardAppTheme {
        GreetingImage("James", from = "~ From Irfando")
    }
}