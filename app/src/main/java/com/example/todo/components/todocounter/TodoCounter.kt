package com.example.todo.components.todocounter

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Box
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview

class TodoCounter {
    @Preview(showBackground = true)
    @SuppressLint("NotConstructor")
    @Composable
    fun TodoCounter() {
        Box {
            Text(text = "Manage your Todos")
        }
    }
    @Composable
    fun TodoCounterItem() {
        Box {
            Text(text = "In Progress")

        }
    }

}