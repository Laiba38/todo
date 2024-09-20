package com.example.todo.ui.components

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
import androidx.compose.material3.Button
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.IconButtonDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.MediumTopAppBar
import androidx.compose.material3.Surface
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


@Preview(showBackground = true, showSystemUi = true)
@Composable
fun TopNavBar() {

    Box (
        contentAlignment = Alignment.BottomStart,
        modifier = Modifier
            .fillMaxWidth()
            .height(112.dp)
            .padding(horizontal = 16.dp)

        ,
        content = {
            Row(
                horizontalArrangement = Arrangement.SpaceBetween,
                verticalAlignment = Alignment.CenterVertically,
                modifier = Modifier.fillMaxWidth(),
                content = {

                    Image(
                        painter = painterResource(id = R.drawable.user),
                        contentDescription = "User Avatar",
                        contentScale = ContentScale.Crop,
                        modifier = Modifier
                            .clip(shape = CircleShape)
                            .size(width = 64.dp, height = 64.dp)
                    )


                    Row {

                        IconButton(
                            modifier = Modifier
                                .size(width = 56.dp, height = 56.dp),
                            colors = IconButtonDefaults.iconButtonColors(
                                containerColor = Color.Black,
                                contentColor = Color.White
                            ),
                            onClick = {},
                            content = {
                                Icon(
                                    imageVector = Icons.Default.Add,
                                    contentDescription = "Add"
                                )
                            }
                        )
                        Spacer(modifier = Modifier.width(8.dp))
                        IconButton(
                            modifier = Modifier
                                .size(width = 56.dp, height = 56.dp),
                            colors = IconButtonDefaults.iconButtonColors(
                                containerColor = Color(red = 225, green = 221, blue = 246,),
                                contentColor = Color.Black
                            ),
                            onClick = {},
                            content = {
                                Icon(imageVector = Icons.Outlined.Notifications, contentDescription = "Notifications")
                            }
                        )

                    }
                }
            )
        }
    )
}