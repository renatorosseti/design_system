package com.versett.generic_framework.stories

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.dimensionResource
import com.versett.generic_framework_ui_android.R
import com.versett.ui.components.textfield.CameraText
import com.versett.ui.components.textfield.CreditCardText
import com.versett.ui.components.textfield.NormalText
import com.versett.ui.components.textfield.PasswordText

@Composable
fun TextFieldStory() {
    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.space_64dp)),
        contentPadding = PaddingValues(
            horizontal = dimensionResource(R.dimen.space_16dp),
            vertical = dimensionResource(R.dimen.space_8dp)
        )
    ) {
        item {
            NormalText(
                label = "Label",
                hint = "Prompt"
            )
        }
        item {
            NormalText(
                label = "Label",
                text = "Entry",
                hint = "Prompt"
            )
        }
        item {
            NormalText(
                label = "Label",
                text = "Entry",
                isError = true,
                errorMessage = "Error Message",
            )
        }
        item {
            NormalText(
                label = "Label",
                enabled = false
            )
        }
        item {
            NormalText(
                label = "Label",
                text = "Entry",
                enabled = false
            )
        }
        item {
            PasswordText(
                label = "Label",
                contentDescriptionHidePassword = "Hide Password",
                contentDescriptionShowPassword = "Show Password",
                text = null
            )
        }
        item {
            PasswordText(
                label = "Password",
                contentDescriptionHidePassword = "Hide Password",
                contentDescriptionShowPassword = "Show Password",
                text = "Password",
            )
        }
        item {
            PasswordText(
                label = "Password",
                contentDescriptionHidePassword = "Hide Password",
                contentDescriptionShowPassword = "Show Password",
                text = "Password",
                isError = true,
                errorMessage = "Password must be at least 8 characters.",
            )
        }
        item {
            PasswordText(
                label = "Password",
                contentDescriptionHidePassword = "Hide Password",
                contentDescriptionShowPassword = "Show Password",
                text = "Password",
                enabled = false
            )
        }
        item {
            CameraText(
                label = "Label",
                contentDescription = "Camera",
                hint = "Prompt",
            )
        }
        item {
            CameraText(
                label = "Label",
                contentDescription = "Camera",
                text = "Entry",
                hint = "Prompt",
            )
        }
        item {
            CameraText(
                label = "Label",
                text = "Entry",
                contentDescription = "Camera",
                isError = true,
                errorMessage = "Error Message",
            )
        }
        item {
            CameraText(
                label = "Label",
                contentDescription = "Camera",
                enabled = false
            )
        }
        item {
            CameraText(
                label = "Label",
                contentDescription = "Camera",
                text = "Entry",
                enabled = false
            )
        }
        item {
            CreditCardText(
                contentDescription = "Credit Card"
            )
        }
        item {
            CreditCardText(
                isError = true,
                contentDescription = "Credit Card",
                errorMessage = "Invalid Credit Card"
            )
        }
        item {
            CreditCardText(
                enabled = false,
                contentDescription = "Credit Card"
            )
        }
        item {
            CreditCardText(
                text = "••••••••••••2345",
                contentDescription = "Credit Card",
                enabled = false
            )
        }
    }
}
