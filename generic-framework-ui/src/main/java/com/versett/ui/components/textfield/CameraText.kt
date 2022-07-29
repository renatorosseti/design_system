package com.versett.ui.components.textfield

import androidx.compose.material.Icon
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import com.versett.ui.util.Constants
import com.versett.generic_framework_ui_android.R

@Composable
fun CameraText(
    label: String,
    contentDescription: String,
    text: String? = null,
    hint: String? = null,
    enabled: Boolean = true,
    isError: Boolean = false,
    errorMessage: String? = null
) {
    TextFieldComponent(
        label = label,
        text = text,
        hint = hint,
        enabled = enabled,
        isError = isError,
        errorMessage = errorMessage,
        width = Constants.FillMaxWidth,
        trailing = {
            Icon(
                painterResource(R.drawable.ic_24_input_camera),
                contentDescription = contentDescription
            )
        }
    )
}
