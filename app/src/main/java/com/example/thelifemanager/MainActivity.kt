package com.example.thelifemanager

import android.content.Intent
import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface

class MainActivity : ComponentActivity() {

    override fun onStart() {
        super.onStart()
        val intent = Intent(this@MainActivity, FeedActivity::class.java)
        startActivity(intent)
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            Surface(
                color = MaterialTheme.colorScheme.background
            ) {
                FirstPage(
                    text = "Welcome to The Life Manager!",
                    onClick = {
                        val intent = Intent(this@MainActivity, FeedActivity::class.java)
                        startActivity(intent)
                    }
                )
            }
        }
    }
}

