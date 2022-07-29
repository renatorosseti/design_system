package com.versett.ui.util

import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp

fun Modifier.getSizeModifier(
    widthInDp: Float? = null,
    heightInDp: Float? = null
): Modifier {
    return this
        .then(
            if (widthInDp != null) {
                if (widthInDp < 0) {
                    Modifier.fillMaxWidth()
                } else {
                    Modifier.width(widthInDp.dp)
                }
            } else {
                Modifier
            }
        )
        .then(
            if (heightInDp != null) {
                if (heightInDp < 0) {
                    Modifier.fillMaxHeight()
                } else {
                    Modifier.height(heightInDp.dp)
                }
            } else {
                Modifier
            }
        )
}
