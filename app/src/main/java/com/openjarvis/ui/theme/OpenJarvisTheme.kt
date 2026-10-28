package com.openjarvis.ui.theme

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.darkColorScheme
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color

object VoidColor {
    val Violet = Color(0xFF8B5CF6)
    val VioletDim = Color(0xFF6244A0)
    val Cyan = Color(0xFF22D3EE)
    val Green = Color(0xFF22C55E)
    val Amber = Color(0xFFF59E0B)
    val Red = Color(0xFFEF4444)
    val Void950 = Color(0xFF090911)
    val Void900 = Color(0xFF12111E)
    val Void800 = Color(0xFF1D1B2E)
    val Void700 = Color(0xFF29273D)
    val Void600 = Color(0xFF424057)
    val TextPrimary = Color(0xFFF8FAFC)
    val TextSecondary = Color(0xFFB4B4C8)
    val TextDisabled = Color(0xFF737388)
    val BorderSubtle = Color(0xFF343248)
    val BorderGlow = Color(0xFF8B5CF6)
}

private val jarvisColors = darkColorScheme(
    primary = VoidColor.Violet,
    secondary = VoidColor.Cyan,
    background = VoidColor.Void950,
    surface = VoidColor.Void900,
    onPrimary = Color.White,
    onBackground = VoidColor.TextPrimary,
    onSurface = VoidColor.TextPrimary,
    error = VoidColor.Red
)

@Composable
fun OpenJarvisTheme(content: @Composable () -> Unit) {
    MaterialTheme(
        colorScheme = jarvisColors,
        content = content
    )
}
