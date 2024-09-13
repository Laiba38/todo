package com.example.todo.components.topbar

import android.annotation.SuppressLint
import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Add
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.example.todo.R

class TopBar {
    @Preview(showBackground = true, showSystemUi = true)
    @SuppressLint("NotConstructor")
    @Composable
    fun TopBar() {
        Box(
            modifier = Modifier
                .fillMaxWidth()
                .height(128.dp)
                .padding(top = 48.dp, start = 16.dp , end = 16.dp)
        ) {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth()
            ) {
                Image(
                    painter = painterResource(id = R.drawable.user),
                    contentDescription = "User Avatar",
                    contentScale = ContentScale.Crop,
                    modifier = Modifier
                        .clip(CircleShape)
                        .size(76.dp)
                )

                Row {
                    IconButton(
                        modifier = Modifier.size(59.dp),
                        onClick = {},
                        colors = IconButtonDefaults.iconButtonColors(
                            containerColor = Color.Black,
                            contentColor = Color.White,
                        ),
                        content = {
                            Icon(
                                imageVector = Icons.Default.Add,
                                contentDescription = "Add Todo",
                            )
                        }
                    )
                    Spacer(modifier = Modifier.width(12.dp))
                    IconButton(
                        modifier = Modifier.size(59.dp),
                        colors = IconButtonDefaults.iconButtonColors(
                            containerColor = Color(red = 225, green = 221, blue = 246),
                            contentColor = Color.Black,
                        ),
                        onClick = {},
                        content = {
                            Icon(imageVector = Icons.Outlined.Notifications,
                                contentDescription = "Reminders")
                        }
                    )
                }
            }
        }

    }

}