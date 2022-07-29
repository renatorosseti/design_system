package com.versett.generic_framework.stories

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import com.versett.generic_framework_ui_android.R
import com.versett.ui.components.button.PrimaryBorderButton
import com.versett.ui.components.button.PrimaryButton
import com.versett.ui.components.button.SecondaryBorderButton
import com.versett.ui.components.button.SecondaryButton
import com.versett.ui.components.button.TextLink
import com.versett.ui.theme.GFTheme
import com.versett.ui.theme.Typography

@Composable
fun ButtonStory() {

    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.space_64dp)),
        contentPadding = PaddingValues(
            horizontal = dimensionResource(R.dimen.space_16dp),
            vertical = dimensionResource(R.dimen.space_8dp)
        ),
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            PrimaryButton(
                title = "PrimaryButton",
                onClickListener = {
                    println("click PrimaryButton")
                }
            )
        }
        item {
            PrimaryButton(
                title = "Disabled PrimaryButton",
                enabled = false,
                onClickListener = {}
            )
        }
        item {
            SecondaryButton(
                title = "SecondaryButton",
                onClickListener = {
                    println("click SecondaryButton")
                }
            )
        }
        item {
            SecondaryButton(
                title = "Disabled SecondaryButton",
                enabled = false,
                onClickListener = {}
            )
        }
        item {
            PrimaryBorderButton(
                title = "PrimaryBorderButton",
                onClickListener = {
                    println("click PrimaryBorderButton")
                },
                borderColor = Color.Black
            )
        }
        item {
            PrimaryBorderButton(
                title = "Disabled PrimaryBorderButton",
                enabled = false,
                borderColor = Color.Black,
                onClickListener = {}
            )
        }
        item {
            SecondaryBorderButton(
                title = "SecondaryBorderButton",
                onClickListener = {
                    println("click SecondaryBorderButton")
                },
            )
        }
        item {
            SecondaryBorderButton(
                title = "Disabled SecondaryBorderButton",
                isEnable = false,
                borderColor = Color(0xFF45484A),
                onClickListener = {}
            )
        }
        item {
            TextLink(
                title = "TextLink sm",
                onClickListener = {
                    println("click TextLink")
                },
                textStyle = GFTheme.typography.ctaSm //Typography.ctaTextSm
            )
        }
        item {
            TextLink(
                title = "Disabled TextLink sm",
                textStyle = Typography.ctaTextSm,
                isEnable = false,
                onClickListener = {}
            )
        }
        item {
            TextLink(
                title = "TextLink xs",
                onClickListener = {
                    println("click TextLink")
                },
                textStyle = Typography.ctaTextXs,
                isEnable = true
            )
        }
        item {
            TextLink(
                title = "Disabled TextLink sm",
                textStyle = Typography.ctaTextXs,
                isEnable = false,
                onClickListener = {}
            )
        }
    }
}
