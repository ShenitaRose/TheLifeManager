package com.example.thelifemanager

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.lazy.LazyRow
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.outlined.Notifications
import androidx.compose.material3.*
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(text: String) {
    Column {
        Row(
            verticalAlignment = Alignment.CenterVertically,
        ) {
            Text(
                text = text,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(20.dp)
                    .weight(weight = 1.0f),
                textAlign = TextAlign.Left,

            )

            Box(
                contentAlignment = Alignment.Center,
                modifier = Modifier
                    .padding(horizontal = 8.dp)
                    .size(48.dp)
                    .clickable { },
            ) {
                Icon(
                    Icons.Outlined.Notifications,
                    contentDescription = "Notifications",
                    modifier = Modifier.size(32.dp),
                )
                Badge(
                    containerColor = Color(0xFF50e0be),
                    modifier = Modifier
                        .padding(4.dp)
                        .align(Alignment.TopEnd),
                ) {
                    Text(
                        text = "3",
                        modifier = Modifier
                            .padding(2.dp),
                    )
                }
            }
        }
        Card(
            modifier = Modifier
                .padding(16.dp)
                .fillMaxWidth()
                .clickable { },
            colors = CardDefaults.cardColors(
                containerColor = Color(0xFF50e0be),
            ),

        ) {
            Text(
                text = "Today",
                color = Color.White,
                fontSize = 16.sp,
                modifier = Modifier.padding(start = 16.dp, end = 16.dp, top = 16.dp, bottom = 5.dp),
            )
            Text(
                text = "2/10 Tasks",
                color = Color.White,
                textAlign = TextAlign.Center,
                fontSize = 30.sp,
                fontWeight = FontWeight.Bold,
                modifier = Modifier
                    .padding(20.dp)
                    .fillMaxWidth(),

            )
        }

        TaskHeader(text = "To do", count = 3)
        LazyRow(verticalAlignment = Alignment.CenterVertically) {
            item {
                TodoCard(
                    task = "Clean the house",
                    until = "Till 5pm",
                )
            }
            item {
                TodoCard(
                    task = "Wash the dishes",
                    until = "Next week",
                )
            }
            item {
                TodoCard(
                    task = "Do the Laundry",
                    until = "Next month",
                )
            }
            item {
                TodoCard(
                    category = "Tomas",
                    task = "Take Taty for a walk, very long title",
                    until = "Never, lol",
                )
            }
        }
        TaskHeader(text = "In progress", count = 10)
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen(text = "Hello User")
}
