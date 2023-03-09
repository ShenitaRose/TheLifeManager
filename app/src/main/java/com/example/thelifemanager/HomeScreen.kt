package com.example.thelifemanager

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Card
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp

@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun HomeScreen(text: String) {
    Card(
        modifier = Modifier
            .padding(16.dp)
    ) {
        Text(
            text = text,
            fontSize = 25.sp,
            fontWeight = FontWeight.Bold,
            modifier = Modifier.padding(16.dp),
            textAlign = TextAlign.Left,
        )
    }
}

@Preview
@Composable
fun HomeScreenPreview() {
    HomeScreen(text = "Hello User")
}