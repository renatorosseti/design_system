package com.versett.ui.components.textfield

import androidx.compose.foundation.Image
import androidx.compose.foundation.text.KeyboardOptions
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.text.AnnotatedString
import androidx.compose.ui.text.input.KeyboardType
import androidx.compose.ui.text.input.OffsetMapping
import androidx.compose.ui.text.input.TransformedText
import com.versett.ui.util.Constants
import com.versett.generic_framework_ui_android.R

@Composable
fun CreditCardText(
    text: String? = null,
    contentDescription: String,
    enabled: Boolean = true,
    isError: Boolean = false,
    errorMessage: String? = null
) {
    TextFieldComponent(
        label = stringResource(R.string.textfield_credit_card_label),
        text = text,
        hint = stringResource(R.string.textfield_credit_card_hint),
        enabled = enabled,
        isError = isError,
        errorMessage = errorMessage,
        width = Constants.FillMaxWidth,
        trailing = {
            Image(
                painter = painterResource(R.drawable.ic_creditcard),
                contentDescription = contentDescription
            )
        },
        keyboardOptions = KeyboardOptions(keyboardType = KeyboardType.Number),
        visualTransformation = {
            creditCardFilter(it)
        },
        maxLength = Constants.MaxCreditCardLength
    )
}

private fun creditCardFilter(text: AnnotatedString): TransformedText {
    val trimmed = if (text.text.length >= Constants.MaxCreditCardLength) text.text.substring(0..15) else text.text

    val annotatedString = AnnotatedString.Builder().run {
        for (i in trimmed.indices) {
            append(trimmed[i])
            if (i % 4 == 3 && i != 15) {
                append("  ")
            }
        }
        toAnnotatedString()
    }

    val creditCardOffsetTranslator = object : OffsetMapping {
        override fun originalToTransformed(offset: Int): Int {
            return when {
                offset <= 3 -> offset
                offset <= 7 -> offset + 2
                offset <= 11 -> offset + 4
                offset <= 16 -> offset + 6
                else -> 22
            }
        }

        override fun transformedToOriginal(offset: Int): Int {
            return when {
                offset <= 4 -> offset
                offset <= 9 -> offset - 2
                offset <= 14 -> offset - 4
                offset <= 19 -> offset - 6
                else -> 16
            }
        }
    }

    return TransformedText(annotatedString, creditCardOffsetTranslator)
}
