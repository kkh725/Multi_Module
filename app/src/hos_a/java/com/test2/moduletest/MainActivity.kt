package com.test2.moduletest22

import android.os.Bundle
import android.util.Log
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Button
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import com.test2.moduletest.R
import com.test2.moduletest.ui.theme.ModuletestTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        Log.d("TAG", "onCreate:123123 ${applicationInfo.targetSdkVersion}")
        setContent {
            ModuletestTheme {
                Scaffold(modifier = Modifier.fillMaxSize()) { innerPadding ->
                    Greeting{
                        when(getString(R.string.BUILD_TYPE)){
                            "debug" -> {}
                            "release" -> {}
                            else -> {}
                        }
                    }
                    a()
                }
            }
        }
    }
}
class BBBBBBBBBBBBB{
    fun a(){
        R.string.BUILD_TYPE
    }
}

@Preview
@Composable
fun a(){
    Text("123122342343")
}
@Composable
inline fun Greeting(crossinline onClick: () -> Unit) {

    Button(onClick = {
        onClick()
    }) {
        Text("move")
    }
}
























