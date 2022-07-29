package com.versett.ui.components.textfield

import androidx.compose.foundation.BorderStroke
import androidx.compose.foundation.background
import androidx.compose.foundation.border
import androidx.compose.foundation.interaction.MutableInteractionSource
import androidx.compose.foundation.interaction.collectIsFocusedAsState
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.material.Text
import androidx.compose.material.TextField
import androidx.compose.material.TextFieldDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import androidx.compose.ui.unit.dp
import com.versett.ui.theme.GFTheme
import com.versett.generic_framework_ui_android.R
import com.versett.ui.theme.Shapes
import com.versett.ui.theme.Typography
import com.versett.ui.theme.monochrome100
import com.versett.ui.theme.monochrome500
import com.versett.ui.theme.monochrome700
import com.versett.ui.theme.monochrome900

@Composable
internal fun TextFieldComponent(
    label: String,
    text: String? = null,
    hint: String? = null,
    enabled: Boolean = true,
    focusBorderColor: Color = GFTheme.colors.blue,
    borderColor: Color = monochrome500(),
    isError: Boolean = false,
    errorMessage: String? = null,
    errorColor: Color = GFTheme.colors.red,
    disableBackgroundColor: Color = monochrome100(),
    width: Float? = null,
    height: Float? = null,
    maxLength: Int? = null,
    visualTransformation: VisualTransformation = VisualTransformation.None,
    keyboardOptions: KeyboardOptions = KeyboardOptions.Default,
    trailing: @Composable (() -> Unit)? = null,
    onValueChange: ((TextFieldValue) -> Unit)? = null,
) {
    val inputValue =
        remember { mutableStateOf(if (text == null) TextFieldValue() else TextFieldValue(text)) }
    val interactionSource = remember { MutableInteractionSource() }
    val isFocusedState by interactionSource.collectIsFocusedAsState()

    val disableBorder = BorderStroke(dimensionResource(R.dimen.border_1dp), borderColor)
    val errorBorder = BorderStroke(dimensionResource(R.dimen.border_2dp), errorColor)
    val focusBorder = BorderStroke(dimensionResource(R.dimen.border_2dp), focusBorderColor)
    val unfocusBorder = BorderStroke(dimensionResource(R.dimen.border_1dp), borderColor)

    fun addBorderStroke(): BorderStroke {
        return if (!enabled) {
            disableBorder
        } else if (isError) {
            errorBorder
        } else if (isFocusedState) {
            focusBorder
        } else {
            unfocusBorder
        }
    }

    val modifierBorder: Modifier = Modifier
        .background(
            shape = Shapes.small,
            color = if (enabled) Color.Transparent else disableBackgroundColor
        )
        .border(
            shape = Shapes.small,
            border = addBorderStroke()
        )

    Column {
        TextField(
            interactionSource = interactionSource,
            value = inputValue.value,
            onValueChange = {
                if (maxLength == null || it.text.length <= maxLength) {
                    inputValue.value = it
                    onValueChange?.invoke(it)
                }
            },
            textStyle = Typography.body2Regular,
            label = {
                Text(
                    text = label,
                    color = monochrome900(),
                    style = if (isFocusedState || inputValue.value.text.isNotEmpty()) Typography.body4Regular else Typography.body2Regular
                )
            },
            placeholder = {
                if (hint != null) {
                    Text(
                        text = hint,
                        color = monochrome900(),
                        style = Typography.body2Regular
                    )
                }
            },
            shape = Shapes.small,
            singleLine = true,
            maxLines = 1,
            trailingIcon = trailing,
            isError = isError,
            colors = TextFieldDefaults.textFieldColors(
                unfocusedIndicatorColor = Color.Transparent,
                disabledIndicatorColor = Color.Transparent,
                focusedIndicatorColor = Color.Transparent,
                errorIndicatorColor = Color.Transparent,
                backgroundColor = Color.Transparent,
                errorTrailingIconColor = monochrome700()
            ),
            enabled = enabled,
            keyboardOptions = keyboardOptions,
            visualTransformation = visualTransformation,
            modifier = Modifier
                .then(
                    if (width != null) {
                        if (width < 0) {
                            Modifier.fillMaxWidth()
                        } else {
                            Modifier.width(width.dp)
                        }
                    } else {
                        Modifier
                    }
                )
                .then(
                    if (height != null) {
                        if (height < 0) {
                            Modifier.fillMaxHeight()
                        } else {
                            Modifier.height(height.dp)
                        }
                    } else {
                        Modifier
                    }
                )
                .then(modifierBorder)
        )

        if (isError && errorMessage != null) {
            Text(
                text = errorMessage,
                modifier = Modifier.padding(top = dimensionResource(R.dimen.space_8dp)),
                color = errorColor,
                style = Typography.body4Regular
            )
        }
    }
}
