package com.versett.ui.components.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.graphics.Shape
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.style.TextDecoration
import com.versett.ui.theme.Typography
import com.versett.ui.util.getSizeModifier
import com.versett.generic_framework_ui_android.R

@Composable
fun ButtonComponent(
    title: String,
    backgroundColor: Color,
    highlightColor: Color,
    disabledColor: Color = Color.Gray,
    textColor: Color,
    disableTextColor: Color = textColor,
    highlightTextColor: Color = textColor,
    shape: Shape = RectangleShape,
    borderColor: Color? = null,
    disableBorderColor: Color? = borderColor,
    width: Float? = null,
    height: Float? = null,
    padding: Float? = null,
    enabled: Boolean = true,
    textDecoration: TextDecoration = TextDecoration.None,
    onClickListener: () -> Unit = {}
) {
    val interactionSource = remember { MutableInteractionSource() }
    val isPressed by interactionSource.collectIsPressedAsState()

    val backgroundByState = if (!enabled) {
        disabledColor
    } else if (isPressed) {
        highlightColor
    } else {
        backgroundColor
    }

    val textColorByState = if (!enabled) {
        disableTextColor
    } else if (isPressed) {
        highlightTextColor
    } else {
        textColor
    }

    Button(
        modifier = Modifier.getSizeModifier(width, height),
        onClick = onClickListener,
        enabled = enabled,
        shape = shape,
        colors = ButtonDefaults.buttonColors(
            backgroundColor = backgroundByState,
        ),
        border = BorderStroke(
            width = if (borderColor != null) dimensionResource(R.dimen.border_2dp) else dimensionResource(
                R.dimen.no_border
            ),
            color = if (enabled) {
                borderColor ?: Color.Transparent
            } else {
                disableBorderColor ?: Color.Transparent
            }
        )
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            content = {
                Text(
                    text = title,
                    color = textColorByState,
                    textDecoration = textDecoration,
                    style = Typography.ctaButton
                )
            }
        )
    }
}
