package com.example.thelifemanager


import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.layout.ContentScale
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp


@Composable
fun FirstPage(
    text: String,
    onClick: () -> Unit
) {
    Column(
        modifier = Modifier
            .padding(30.dp)
            .fillMaxWidth(),
        horizontalAlignment = Alignment.CenterHorizontally
    )  {
    Text(
        text = text,
        fontSize = 50.sp,
        fontWeight = FontWeight.Bold,
        modifier = Modifier.padding(16.dp),
        textAlign = TextAlign.Center,
    )

        val imageModifier = Modifier
            .size(350.dp)

        Image(
            painter = painterResource(id = R.drawable.management),
            contentDescription = "",
            contentScale = ContentScale.Fit,
            modifier = imageModifier
        )

        Button(
            colors = ButtonDefaults.buttonColors(
                containerColor = Color(0xFFdd9fc8)
            ),
            shape = RoundedCornerShape(10.dp),
            onClick = onClick
        ) { Text(color = Color.White, fontSize = 30.sp, text = "Get Started") }
}
}
@Preview
@Composable
fun FirstPagePreview() {
    FirstPage(text = "Welcome to The Life Manager", onClick = {})
}