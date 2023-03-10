package com.example.thelifemanager

import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Badge
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@Composable
fun TaskHeader(
    text: String,
    count: Int,
) {
    Row(verticalAlignment = Alignment.CenterVertically) {
        Text(
            text = text,
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(16.dp),
        )
        Badge(
            containerColor = Color(0xFF50e0be),
        ) {
            Text(
                text = count.toString(),
                color = Color.White,
                fontSize = 16.sp,
                modifier = Modifier.padding(4.dp),
            )
        }
    }
}

@Preview
@Composable
fun ProgressHeaderPreview() {
    TaskHeader(
        text = "In Progress",
        count = 10,
    )
}
