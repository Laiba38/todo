package com.example.todo.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Scaffold
import androidx.compose.ui.Modifier
import com.example.todo.ui.components.TaskGridLayout
import com.example.todo.ui.components.TopNavBar
import com.example.todo.ui.theme.TodoTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        setContent {
            TodoTheme {
                Scaffold (

                    topBar = { TopNavBar() },

                    modifier = Modifier
                        .fillMaxSize()
                ) { innerPadding ->
                    App( innerPadding = innerPadding)
                }
            }
        }
    }


}



