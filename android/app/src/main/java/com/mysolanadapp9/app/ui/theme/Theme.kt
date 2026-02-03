package com.mysolanadapp9.app.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

private val DarkColorScheme = darkColorScheme(
    primary = Color(0xFF9945FF),
    secondary = Color(0xFF14F195),
    tertiary = Color(0xFFFF6B35),
    background = Color(0xFF0F0F0F),
    surface = Color(0xFF1A1A1A)
)

@Composable
fun SolanaAppTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = DarkColorScheme,
        content = content
    )
}