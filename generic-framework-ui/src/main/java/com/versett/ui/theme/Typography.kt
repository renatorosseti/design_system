package com.versett.ui.theme

import androidx.compose.runtime.Immutable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.font.Font
import androidx.compose.ui.text.font.FontFamily
import androidx.compose.ui.unit.sp
import com.versett.generic_framework_ui_android.R
import com.versett.ui.theme.Typography.body1Bold
import com.versett.ui.theme.Typography.body1Italic
import com.versett.ui.theme.Typography.body1Regular
import com.versett.ui.theme.Typography.body1Semibold
import com.versett.ui.theme.Typography.body2Bold
import com.versett.ui.theme.Typography.body2Italic
import com.versett.ui.theme.Typography.body2Regular
import com.versett.ui.theme.Typography.body2Semibold
import com.versett.ui.theme.Typography.body3Bold
import com.versett.ui.theme.Typography.body3Italic
import com.versett.ui.theme.Typography.body3Regular
import com.versett.ui.theme.Typography.body3Semibold
import com.versett.ui.theme.Typography.body4Bold
import com.versett.ui.theme.Typography.body4Italic
import com.versett.ui.theme.Typography.body4Regular
import com.versett.ui.theme.Typography.body4Semibold
import com.versett.ui.theme.Typography.captionRegular
import com.versett.ui.theme.Typography.captionSemibold
import com.versett.ui.theme.Typography.ctaButton
import com.versett.ui.theme.Typography.ctaTextSm
import com.versett.ui.theme.Typography.ctaTextXs
import com.versett.ui.theme.Typography.heading4Bold
import com.versett.ui.theme.Typography.heading4Italic
import com.versett.ui.theme.Typography.heading4Regular
import com.versett.ui.theme.Typography.heading5Bold
import com.versett.ui.theme.Typography.heading5Italic
import com.versett.ui.theme.Typography.heading5Regular
import com.versett.ui.theme.Typography.heading6Bold
import com.versett.ui.theme.Typography.heading6Italic
import com.versett.ui.theme.Typography.heading6Regular

@Immutable
data class GFTypography(
    val h4Regular: TextStyle,
    val h4Italic: TextStyle,
    val h4Bold: TextStyle,
    val h5Regular: TextStyle,
    val h5Italic: TextStyle,
    val h5Bold: TextStyle,
    val h6Regular: TextStyle,
    val h6Italic: TextStyle,
    val h6Bold: TextStyle,
    val body1Regular: TextStyle,
    val body1Italic: TextStyle,
    val body1SemiBold: TextStyle,
    val body1Bold: TextStyle,
    val body2Regular: TextStyle,
    val body2Italic: TextStyle,
    val body2SemiBold: TextStyle,
    val body2Bold: TextStyle,
    val body3Regular: TextStyle,
    val body3Italic: TextStyle,
    val body3SemiBold: TextStyle,
    val body3Bold: TextStyle,
    val body4Regular: TextStyle,
    val body4Italic: TextStyle,
    val body4SemiBold: TextStyle,
    val body4Bold: TextStyle,
    val ctaButton: TextStyle,
    val ctaSm: TextStyle,
    val ctaXs: TextStyle,
    val captionRegular: TextStyle,
    val captionSemiBold: TextStyle,
)

val LocalDesignSystemTypography = staticCompositionLocalOf {
    GFTypography(
        //Headings
        h4Regular = TextStyle.Default,
        h4Italic = TextStyle.Default,
        h4Bold = TextStyle.Default,
        h5Regular = TextStyle.Default,
        h5Italic = TextStyle.Default,
        h5Bold = TextStyle.Default,
        h6Regular = TextStyle.Default,
        h6Italic = TextStyle.Default,
        h6Bold = TextStyle.Default,
        //Body
        body1Regular = TextStyle.Default,
        body1Italic = TextStyle.Default,
        body1SemiBold = TextStyle.Default,
        body1Bold = TextStyle.Default,
        body2Regular = TextStyle.Default,
        body2Italic = TextStyle.Default,
        body2SemiBold = TextStyle.Default,
        body2Bold = TextStyle.Default,
        body3Regular = TextStyle.Default,
        body3Italic = TextStyle.Default,
        body3SemiBold = TextStyle.Default,
        body3Bold = TextStyle.Default,
        body4Regular = TextStyle.Default,
        body4Italic = TextStyle.Default,
        body4SemiBold = TextStyle.Default,
        body4Bold = TextStyle.Default,
        //Button
        ctaButton = TextStyle.Default,
        ctaSm = TextStyle.Default,
        ctaXs = TextStyle.Default,
        captionRegular = TextStyle.Default,
        captionSemiBold = TextStyle.Default,
    )
}

val gfTypography = GFTypography(
    h4Regular = heading4Regular,
    h4Italic = heading4Italic,
    h4Bold = heading4Bold,
    h5Regular = heading5Regular,
    h5Italic = heading5Italic,
    h5Bold = heading5Bold,
    h6Regular = heading6Regular,
    h6Italic = heading6Italic,
    h6Bold = heading6Bold,
    body1Regular = body1Regular,
    body1Italic = body1Italic,
    body1SemiBold = body1Semibold,
    body1Bold = body1Bold,
    body2Regular = body2Regular,
    body2Italic = body2Italic,
    body2SemiBold = body2Semibold,
    body2Bold = body2Bold,
    body3Regular = body3Regular,
    body3Italic = body3Italic,
    body3SemiBold = body3Semibold,
    body3Bold = body3Bold,
    body4Regular = body4Regular,
    body4Italic = body4Italic,
    body4SemiBold = body4Semibold,
    body4Bold = body4Bold,
    ctaButton = ctaButton,
    ctaSm = ctaTextSm,
    ctaXs = ctaTextXs,
    captionRegular = captionRegular,
    captionSemiBold = captionSemibold,
)

object Typography {

    val heading4Bold = TextStyle(
        fontFamily = FontFamily(Font(R.font.google_sans_bold)),
        fontSize = 20.0.sp,
        letterSpacing = 0.0.sp,
        lineHeight = 26.0.sp,
    )
    val heading4Italic = TextStyle(
        fontFamily = FontFamily(Font(R.font.google_sans_italic)),
        fontSize = 20.0.sp,
        letterSpacing = 0.0.sp,
        lineHeight = 26.0.sp,
    )
    val heading4Regular = TextStyle(
        fontFamily = FontFamily(Font(R.font.google_sans_medium)),
        fontSize = 20.0.sp,
        letterSpacing = 0.0.sp,
        lineHeight = 26.0.sp,
    )
    val heading5Bold = TextStyle(
        fontFamily = FontFamily(Font(R.font.google_sans_bold)),
        fontSize = 18.0.sp,
        letterSpacing = 0.0.sp,
        lineHeight = 27.0.sp,
    )
    val heading5Italic = TextStyle(
        fontFamily = FontFamily(Font(R.font.google_sans_italic)),
        fontSize = 18.0.sp,
        letterSpacing = 0.0.sp,
        lineHeight = 27.0.sp,
    )
    val heading5Regular = TextStyle(
        fontFamily = FontFamily(Font(R.font.google_sans_medium)),
        fontSize = 18.0.sp,
        letterSpacing = 0.0.sp,
        lineHeight = 27.0.sp,
    )
    val heading6Bold = TextStyle(
        fontFamily = FontFamily(Font(R.font.google_sans_bold)),
        fontSize = 16.0.sp,
        letterSpacing = 0.0.sp,
        lineHeight = 24.0.sp,
    )
    val heading6Italic = TextStyle(
        fontFamily = FontFamily(Font(R.font.google_sans_italic)),
        fontSize = 16.0.sp,
        letterSpacing = 0.0.sp,
        lineHeight = 24.0.sp,
    )
    val heading6Regular = TextStyle(
        fontFamily = FontFamily(Font(R.font.google_sans_medium)),
        fontSize = 16.0.sp,
        letterSpacing = 0.0.sp,
        lineHeight = 24.0.sp,
    )
    val body1Bold = TextStyle(
        fontFamily = FontFamily(Font(R.font.google_sans_bold)),
        fontSize = 18.0.sp,
        letterSpacing = 0.0.sp,
        lineHeight = 27.0.sp,
    )
    val body1Italic = TextStyle(
        fontFamily = FontFamily(Font(R.font.google_sans_italic)),
        fontSize = 18.0.sp,
        letterSpacing = 0.0.sp,
        lineHeight = 27.0.sp,
    )
    val body1Regular = TextStyle(
        fontFamily = FontFamily(Font(R.font.google_sans_medium)),
        fontSize = 18.0.sp,
        letterSpacing = 0.0.sp,
        lineHeight = 27.0.sp,
    )
    val body1Semibold = TextStyle(
        fontFamily = FontFamily(Font(R.font.google_sans_bold)),
        fontSize = 18.0.sp,
        letterSpacing = 0.0.sp,
        lineHeight = 27.0.sp,
    )
    val body1UppercaseBold = TextStyle(
        fontFamily = FontFamily(Font(R.font.google_sans_bold)),
        fontSize = 18.0.sp,
        letterSpacing = 0.9.sp,
        lineHeight = 27.0.sp,
    )
    val body2Bold = TextStyle(
        fontFamily = FontFamily(Font(R.font.google_sans_bold)),
        fontSize = 16.0.sp,
        letterSpacing = 0.0.sp,
        lineHeight = 24.0.sp,
    )
    val body2Italic = TextStyle(
        fontFamily = FontFamily(Font(R.font.google_sans_italic)),
        fontSize = 16.0.sp,
        letterSpacing = 0.0.sp,
        lineHeight = 24.0.sp,
    )
    val body2Regular = TextStyle(
        fontFamily = FontFamily(Font(R.font.google_sans_medium)),
        fontSize = 16.0.sp,
        letterSpacing = 0.0.sp,
        lineHeight = 24.0.sp,
    )
    val body2Semibold = TextStyle(
        fontFamily = FontFamily(Font(R.font.google_sans_bold)),
        fontSize = 16.0.sp,
        letterSpacing = 0.0.sp,
        lineHeight = 24.0.sp,
    )
    val body2UppercaseBold = TextStyle(
        fontFamily = FontFamily(Font(R.font.google_sans_bold)),
        fontSize = 16.0.sp,
        letterSpacing = 0.8.sp,
        lineHeight = 24.0.sp,
    )
    val body3Bold = TextStyle(
        fontFamily = FontFamily(Font(R.font.google_sans_bold)),
        fontSize = 14.0.sp,
        letterSpacing = 0.0.sp,
        lineHeight = 21.0.sp,
    )
    val body3Italic = TextStyle(
        fontFamily = FontFamily(Font(R.font.google_sans_italic)),
        fontSize = 14.0.sp,
        letterSpacing = 0.0.sp,
        lineHeight = 21.0.sp,
    )
    val body3Regular = TextStyle(
        fontFamily = FontFamily(Font(R.font.google_sans_medium)),
        fontSize = 14.0.sp,
        letterSpacing = 0.0.sp,
        lineHeight = 21.0.sp,
    )
    val body3Semibold = TextStyle(
        fontFamily = FontFamily(Font(R.font.google_sans_bold)),
        fontSize = 14.0.sp,
        letterSpacing = 0.0.sp,
        lineHeight = 21.0.sp,
    )
    val body3UppercaseBold = TextStyle(
        fontFamily = FontFamily(Font(R.font.google_sans_bold)),
        fontSize = 14.0.sp,
        letterSpacing = 0.7000000000000001.sp,
        lineHeight = 21.0.sp,
    )
    val body4Bold = TextStyle(
        fontFamily = FontFamily(Font(R.font.google_sans_bold)),
        fontSize = 12.0.sp,
        letterSpacing = 0.0.sp,
        lineHeight = 19.799999237060547.sp,
    )
    val body4Italic = TextStyle(
        fontFamily = FontFamily(Font(R.font.google_sans_italic)),
        fontSize = 12.0.sp,
        letterSpacing = 0.0.sp,
        lineHeight = 19.799999237060547.sp,
    )
    val body4Regular = TextStyle(
        fontFamily = FontFamily(Font(R.font.google_sans_medium)),
        fontSize = 12.0.sp,
        letterSpacing = 0.0.sp,
        lineHeight = 19.799999237060547.sp,
    )
    val body4Semibold = TextStyle(
        fontFamily = FontFamily(Font(R.font.google_sans_bold)),
        fontSize = 12.0.sp,
        letterSpacing = 0.0.sp,
        lineHeight = 19.799999237060547.sp,
    )
    val body4Uppercase = TextStyle(
        fontFamily = FontFamily(Font(R.font.google_sans_medium)),
        fontSize = 12.0.sp,
        letterSpacing = 1.2000000000000002.sp,
        lineHeight = 18.0.sp,
    )
    val body4UppercaseBold = TextStyle(
        fontFamily = FontFamily(Font(R.font.google_sans_bold)),
        fontSize = 12.0.sp,
        letterSpacing = 1.2000000000000002.sp,
        lineHeight = 18.0.sp,
    )
    val ctaButton = TextStyle(
        fontFamily = FontFamily(Font(R.font.google_sans_bold)),
        fontSize = 16.0.sp,
        letterSpacing = 0.0.sp,
        lineHeight = 24.0.sp,
    )
    val ctaTextCaption = TextStyle(
        fontFamily = FontFamily(Font(R.font.google_sans_bold)),
        fontSize = 10.0.sp,
        letterSpacing = 0.0.sp,
        lineHeight = 15.0.sp,
    )
    val ctaTextSm = TextStyle(
        fontFamily = FontFamily(Font(R.font.google_sans_bold)),
        fontSize = 14.0.sp,
        letterSpacing = 0.0.sp,
        lineHeight = 21.0.sp,
    )
    val ctaTextXs = TextStyle(
        fontFamily = FontFamily(Font(R.font.google_sans_bold)),
        fontSize = 12.0.sp,
        letterSpacing = 0.0.sp,
        lineHeight = 19.799999237060547.sp,
    )
    val captionRegular = TextStyle(
        fontFamily = FontFamily(Font(R.font.google_sans_medium)),
        fontSize = 10.0.sp,
        letterSpacing = 0.0.sp,
        lineHeight = 15.0.sp,
    )
    val captionSemibold = TextStyle(
        fontFamily = FontFamily(Font(R.font.google_sans_bold)),
        fontSize = 10.0.sp,
        letterSpacing = 0.0.sp,
        lineHeight = 15.0.sp,
    )
    val captionUppercaseBold = TextStyle(
        fontFamily = FontFamily(Font(R.font.google_sans_bold)),
        fontSize = 10.0.sp,
        letterSpacing = 1.0.sp,
        lineHeight = 15.0.sp,
    )
}
