package com.example.praktikum1app

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.size
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import kotlinx.coroutines.delay

@Composable
fun SplashScreen(onTimeout: () -> Unit) {
    // Navigate to next screen after 3 seconds
    LaunchedEffect(Unit) {
        delay(3000L)
        onTimeout()
    }

    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        // You can replace this text with a real logo later
        // e.g., Image(painterResource(R.drawable.yakult_logo), ...)
        Text(
            text = "Yakult Lady App",
            fontSize = 32.sp,
            fontWeight = FontWeight.Bold
        )
    }
}