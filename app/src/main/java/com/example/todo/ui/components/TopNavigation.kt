package com.example.todo.ui.components

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TopNavBar() {

    MediumTopAppBar(
        title = {
            Row(
                content = {
                    IconButton(
                        onClick = {},
                        content = {
                            Icon(imageVector = Icons.Default.Add, contentDescription = "Add")
                        }
                    )
                    IconButton(
                        onClick = {},
                        content = {
                            Icon(imageVector = Icons.Outlined.Notifications, contentDescription = "Notifications")
                        }
                    )
                }
            )
        }
    )


}