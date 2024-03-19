package com.example.appteste

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.appteste.ui.theme.AppTesteTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            AppTesteTheme {
                // A surface container using the 'background' color from the theme
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Inicial()
                }
            }
        }
    }
}

@Composable
fun TextCustomizado(texto: String) {
    Text(text = texto, color = Color.White)
}

@Composable
fun Inicial(){
    Column(modifier = Modifier.background(color = Color.Blue)){
        TextCustomizado(texto = "Terceira aula")
        Row{
            TextCustomizado(texto = "Android Studio")
            TextCustomizado(texto = "JetPack Compose")
        }
    }
}
@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    AppTesteTheme {
        Inicial()
    }
}