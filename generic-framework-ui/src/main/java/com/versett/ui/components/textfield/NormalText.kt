package com.versett.ui.components.textfield

import androidx.compose.runtime.Composable
import androidx.compose.ui.text.input.TextFieldValue
import com.versett.ui.util.Constants

@Composable
fun NormalText(
    label: String,
    text: String? = null,
    hint: String? = null,
    enabled: Boolean = true,
    isError: Boolean = false,
    errorMessage: String? = null,
    height: Float? = null,
    onValueChange: ((TextFieldValue) -> Unit)? = null
) {
    TextFieldComponent(
        label = label,
        text = text,
        hint = hint,
        enabled = enabled,
        isError = isError,
        errorMessage = errorMessage,
        width = Constants.FillMaxWidth,
        height = height,
        onValueChange = onValueChange
    )
}
