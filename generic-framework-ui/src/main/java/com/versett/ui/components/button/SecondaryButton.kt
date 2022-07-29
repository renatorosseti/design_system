package com.versett.ui.components.button

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.versett.ui.theme.GFTheme
import com.versett.ui.theme.Shapes
import com.versett.ui.theme.secondary
import com.versett.ui.util.Constants

@Composable
fun SecondaryButton(
    title: String,
    backgroundColor: Color = secondary(),
    highlightColor: Color = secondary(),
    disabledColor: Color = GFTheme.colors.gray300,
    textColor: Color = GFTheme.colors.white,
    disabledTextColor: Color = GFTheme.colors.gray900,
    shape: CornerBasedShape = Shapes.small,
    onClickListener: () -> Unit,
    enabled: Boolean = true
) {
    ButtonComponent(
        title = title,
        backgroundColor = backgroundColor,
        highlightColor = highlightColor,
        disabledColor = disabledColor,
        textColor = textColor,
        disableTextColor = disabledTextColor,
        shape = shape,
        width = Constants.FillMaxWidth,
        height = Constants.ButtonHeight,
        enabled = enabled,
        onClickListener = onClickListener
    )
}
