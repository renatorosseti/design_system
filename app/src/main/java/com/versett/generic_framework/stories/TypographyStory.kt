package com.versett.generic_framework.stories

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.PaddingValues
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.res.dimensionResource
import com.versett.generic_framework_ui_android.R
import com.versett.ui.theme.Typography

@Composable
fun TypographyStory() {

    LazyColumn(
        verticalArrangement = Arrangement.spacedBy(dimensionResource(R.dimen.space_64dp)),
        contentPadding = PaddingValues(
            horizontal = dimensionResource(R.dimen.space_16dp),
            vertical = dimensionResource(R.dimen.space_8dp)
        ),
    ) {
        item {
            Text(text = "heading4Bold", style = Typography.heading4Bold)
            Text(text = "heading4Italic", style = Typography.heading4Italic)
            Text(text = "heading4Regular", style = Typography.heading4Regular)
            Text(text = "heading5Bold", style = Typography.heading5Bold)
            Text(text = "heading5Italic", style = Typography.heading5Italic)
            Text(text = "heading5Regular", style = Typography.heading5Regular)
            Text(text = "heading6Bold", style = Typography.heading6Bold)
            Text(text = "heading6Italic", style = Typography.heading6Italic)
            Text(text = "heading6Regular", style = Typography.heading6Regular)
            Text(text = "body1Bold", style = Typography.body1Bold)
            Text(text = "body1Italic", style = Typography.body1Italic)
            Text(text = "body1Regular", style = Typography.body1Regular)
            Text(text = "body1Semibold", style = Typography.body1Semibold)
            Text(
                text = "body1UppercaseBold",
                style = Typography.body1UppercaseBold
            )
            Text(text = "body2Bold", style = Typography.body2Bold)
            Text(text = "body2Italic", style = Typography.body2Italic)
            Text(text = "body2Regular", style = Typography.body2Regular)
            Text(text = "body2Semibold", style = Typography.body2Semibold)
            Text(
                text = "body2UppercaseBold",
                style = Typography.body2UppercaseBold
            )
            Text(text = "body3Bold", style = Typography.body3Bold)
            Text(text = "body3Italic", style = Typography.body3Italic)
            Text(text = "body3Regular", style = Typography.body3Regular)
            Text(text = "body3Semibold", style = Typography.body3Semibold)
            Text(
                text = "body3UppercaseBold",
                style = Typography.body3UppercaseBold
            )
            Text(text = "body4Bold", style = Typography.body4Bold)
            Text(text = "body4Italic", style = Typography.body4Italic)
            Text(text = "body4Regular", style = Typography.body4Regular)
            Text(text = "body4Semibold", style = Typography.body4Semibold)
            Text(text = "body4Uppercase", style = Typography.body4Uppercase)
            Text(
                text = "body4UppercaseBold",
                style = Typography.body4UppercaseBold
            )
            Text(text = "ctaButton", style = Typography.ctaButton)
            Text(text = "ctaTextCaption", style = Typography.ctaTextCaption)
            Text(text = "ctaTextSm", style = Typography.ctaTextSm)
            Text(text = "ctaTextXs", style = Typography.ctaTextXs)
            Text(text = "captionRegular", style = Typography.captionRegular)
            Text(text = "captionSemibold", style = Typography.captionSemibold)
            Text(
                text = "captionUppercaseBold",
                style = Typography.captionUppercaseBold
            )
        }
    }
}
