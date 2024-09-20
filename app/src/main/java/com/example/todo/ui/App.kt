package com.example.todo.ui

import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier

import com.example.todo.ui.components.TaskGridLayout

@Composable
fun App(innerPadding : PaddingValues) {

    Surface (
        modifier =  Modifier
            .padding(innerPadding)
    ) {
       TaskGridLayout()
    }
}