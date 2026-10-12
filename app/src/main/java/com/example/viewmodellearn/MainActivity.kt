package com.example.viewmodellearn

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.activity.viewModels
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.lifecycle.viewmodel.compose.viewModel
import com.example.viewmodellearn.ui.theme.ViewModelLearnTheme

class MainActivity : ComponentActivity() {

    //private val viewModel by viewModels<ColorViewModel>()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            ViewModelLearnTheme {
                val viewModel = viewModel<ColorViewModel>()
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = viewModel.backgroundColor
                ) {
                    Button(
                        onClick = {
                            viewModel.changeColor()
                        }
                    ) {
                        Text("Change Color")
                }
                }
            }
        }
    }
}

@Composable
fun Greeting(name: String, modifier: Modifier = Modifier) {
    Text(
        text = "Hello $name!",
        modifier = modifier
    )
}

@Preview(showBackground = true)
@Composable
fun GreetingPreview() {
    ViewModelLearnTheme {
        Greeting("Android")
    }
}