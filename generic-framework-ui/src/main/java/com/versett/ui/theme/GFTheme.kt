package com.versett.ui.theme

import androidx.compose.material.MaterialTheme
import androidx.compose.runtime.Composable
import androidx.compose.runtime.CompositionLocalProvider

@Composable
fun GFTheme(content: @Composable () -> Unit) {
    CompositionLocalProvider(
        LocalDesignSystemColors provides extendedColors,
        LocalDesignSystemTypography provides gfTypography
    ) {
        MaterialTheme(
            shapes = Shapes,
            content = content
        )
    }
}

object GFTheme {
    val colors: GFColors
        @Composable
        get() = LocalDesignSystemColors.current
    val typography: GFTypography
        @Composable
        get() = LocalDesignSystemTypography.current
}
