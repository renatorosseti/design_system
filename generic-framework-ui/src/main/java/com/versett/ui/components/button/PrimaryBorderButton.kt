package com.versett.ui.components.button

import androidx.compose.foundation.shape.CornerBasedShape
import androidx.compose.runtime.Composable
import androidx.compose.ui.graphics.Color
import com.versett.ui.theme.GFTheme
import com.versett.ui.theme.Shapes
import com.versett.ui.theme.monochrome300
import com.versett.ui.theme.monochrome900
import com.versett.ui.util.Constants

@Composable
fun PrimaryBorderButton(
    title: String,
    backgroundColor: Color = Color.White,
    highlightColor: Color = monochrome300(),
    disabledColor: Color = monochrome300(),
    textColor: Color = GFTheme.colors.black,
    disabledTextColor: Color = monochrome900(),
    shape: CornerBasedShape = Shapes.small,
    onClickListener: () -> Unit,
    enabled: Boolean = true,
    borderColor: Color = Color.Black
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
        borderColor = borderColor,
        enabled = enabled,
        onClickListener = onClickListener
    )
}
