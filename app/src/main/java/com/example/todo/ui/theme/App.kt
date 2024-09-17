package com.example.todo.ui.theme

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


@Composable
fun App(innerPadding : PaddingValues) {

    Surface (
        modifier =  Modifier
            .padding(innerPadding)
    ) {
        Text(text = "Todo App")

    }
}