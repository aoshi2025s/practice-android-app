package com.example.nervousbreakdownofcolor

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.example.nervousbreakdownofcolor.ui.theme.NervousBreakdownOfColorTheme
import androidx.compose.ui.unit.dp

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            NervousBreakdownOfColorTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    GameScreen( modifier = Modifier.padding(innerPadding) )
                }
            }
        }
    }
}

@Composable
fun GameScreen(modifier: Modifier = Modifier) {
    Text("Start", modifier = Modifier.padding(24.dp))
}

@Preview(showBackground = true)
@Composable
fun GameScreenPreview() {
    NervousBreakdownOfColorTheme {
        GameScreen()
    }
}