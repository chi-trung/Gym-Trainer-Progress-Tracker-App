package com.example.nutrifit.ui.screens.ScanScreen
import androidx.compose.foundation.layout.Column
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.sp

@Composable
fun ScanScreen() {
    Column() {
        Text(
            text = "Scan Screen",
            fontSize = 20.sp,
            fontWeight = FontWeight.Bold,
        )
    }
}