package com.example.thelifemanager

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.*
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextOverflow
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun TodoCard (
    todo: String,
    until: String
) {
    Card (
        modifier = Modifier
            .padding(16.dp)
            .width(130.dp)
            .height(100.dp)
            .clickable { },
        colors = CardDefaults.cardColors(
            containerColor = Color(0xFFccffef),
        ),
    ) {
        Text(
            text = "Daily Tasks",
            fontSize = 12.sp,
            modifier = Modifier.padding(4.dp),
        )
        Text(
            text = todo,
            fontSize = 15.sp,
            fontWeight = FontWeight.Bold,
            textAlign = TextAlign.Center,
            overflow = TextOverflow.Ellipsis,
            modifier = Modifier.padding(10.dp),
        )
        Text(
            text = until,
            fontSize = 10.sp,
            textAlign = TextAlign.Center,
            modifier = Modifier.padding(5.dp)
        )
    }
}

@Preview
@Composable
fun TodoCardPreview() {
    TodoCard(todo = "Daily Tasks", until ="Until 6pm")
}