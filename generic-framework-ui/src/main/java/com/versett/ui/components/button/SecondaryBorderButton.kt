package com.versett.ui.components.button

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.versett.ui.theme.GFTheme
import com.versett.ui.theme.Shapes
import com.versett.ui.theme.secondary
import com.versett.ui.util.Constants

@Composable
fun SecondaryBorderButton(
    title: String,
    backgroundColor: Color = Color.White,
    highlightColor: Color = GFTheme.colors.blue,
    disabledColor: Color = GFTheme.colors.gray300,
    textColor: Color = secondary(),
    disabledTextColor: Color = GFTheme.colors.gray900,
    disabledBorderColor: Color = GFTheme.colors.gray900,
    shape: CornerBasedShape = Shapes.small,
    onClickListener: () -> Unit,
    isEnable: Boolean = true,
    borderColor: Color = Color.Black
) {
    ButtonComponent(
        title = title,
        backgroundColor = backgroundColor,
        highlightColor = highlightColor,
        disabledColor = disabledColor,
        textColor = textColor,
        disableTextColor = disabledTextColor,
        disableBorderColor = disabledBorderColor,
        shape = shape,
        width = Constants.FillMaxWidth,
        height = Constants.ButtonHeight,
        borderColor = borderColor,
        enabled = isEnable,
        onClickListener = onClickListener
    )
}
