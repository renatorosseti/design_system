package com.versett.ui.components.textfield

import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxHeight
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.input.PasswordVisualTransformation
import androidx.compose.ui.text.input.TextFieldValue
import androidx.compose.ui.text.input.VisualTransformation
import com.versett.ui.util.Constants
import com.versett.generic_framework_ui_android.R

@Composable
fun PasswordText(
    label: String,
    contentDescriptionShowPassword: String,
    contentDescriptionHidePassword: String,
    text: String? = null,
    hint: String? = null,
    enabled: Boolean = true,
    isError: Boolean = false,
    errorMessage: String? = null,
    height: Float? = null,
    onValueChange: ((TextFieldValue) -> Unit)? = null
) {
    val passwordVisibility = remember { mutableStateOf(false) }

    TextFieldComponent(
        label = label,
        text = text,
        hint = hint,
        enabled = enabled,
        isError = isError,
        errorMessage = errorMessage,
        width = Constants.FillMaxWidth,
        height = height,
        trailing = {
            Row(
                modifier = Modifier
                    .fillMaxHeight()
                    .clickable {
                        passwordVisibility.value = !passwordVisibility.value
                    },
                verticalAlignment = Alignment.CenterVertically
            ) {
                IconButton(onClick = {
                    passwordVisibility.value = !passwordVisibility.value
                }, modifier = Modifier.width(dimensionResource(R.dimen.password_icon_width))) {
                    Icon(
                        painter = if (passwordVisibility.value) painterResource(R.drawable.ic_24_input_hide_text) else painterResource(
                            R.drawable.ic_24_input_show_text
                        ),
                        contentDescription = if (passwordVisibility.value) contentDescriptionHidePassword else contentDescriptionShowPassword,
                        modifier = Modifier.padding(end = dimensionResource(R.dimen.space_10dp))
                    )
                }
            }
        },
        visualTransformation = if (passwordVisibility.value) {
            VisualTransformation.None
        } else {
            PasswordVisualTransformation()
        },
        onValueChange = onValueChange
    )
}
