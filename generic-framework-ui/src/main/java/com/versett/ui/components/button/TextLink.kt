package com.versett.ui.components.button

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsPressedAsState
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Row
import androidx.compose.material.ExperimentalMaterialApi
import androidx.compose.material.Surface
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
import androidx.compose.ui.semantics.Role
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.style.TextDecoration
import com.versett.ui.theme.GFTheme
import com.versett.generic_framework_ui_android.R
import com.versett.ui.theme.Typography
import com.versett.ui.theme.monochrome900
import com.versett.ui.util.Constants
import com.versett.ui.util.getSizeModifier

@OptIn(ExperimentalMaterialApi::class)
@Composable
fun TextLinkComponent(
    title: String,
    backgroundColor: Color,
    highlightColor: Color,
    disabledColor: Color = Color.Gray,
    textStyle: TextStyle,
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

    Surface(
        modifier = Modifier.getSizeModifier(width, height),
        shape = shape,
        color = backgroundByState,
        border = BorderStroke(
            width = if (borderColor != null) dimensionResource(R.dimen.border_2dp) else dimensionResource(
                R.dimen.no_border
            ),
            color = if (enabled) {
                borderColor ?: Color.Transparent
            } else {
                disableBorderColor ?: Color.Transparent
            }
        ),
        onClick = onClickListener,
        enabled = enabled,
        role = Role.Button,
        interactionSource = interactionSource,
        indication = null
    ) {
        Row(
            horizontalArrangement = Arrangement.Center,
            verticalAlignment = Alignment.CenterVertically,
            content = {
                Text(
                    text = title,
                    color = textColorByState,
                    textDecoration = textDecoration,
                    style = Typography.body3Semibold
                )
            }
        )
    }
}

@Composable
fun TextLink(
    title: String,
    onClickListener: () -> Unit,
    textStyle: TextStyle,
    isEnable: Boolean = true
) {
    TextLinkComponent(
        title = title,
        backgroundColor = Color.Transparent,
        highlightColor = Color.Transparent,
        disabledColor = Color.Transparent,
        textColor = GFTheme.colors.blue,
        highlightTextColor = GFTheme.colors.blue,
        disableTextColor = monochrome900(),
        padding = Constants.DefaultTextLinkPadding,
        textStyle = textStyle,
        textDecoration = TextDecoration.Underline,
        enabled = isEnable,
        onClickListener = onClickListener
    )
}
