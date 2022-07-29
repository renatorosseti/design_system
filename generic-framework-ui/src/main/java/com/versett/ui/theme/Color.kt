package com.versett.ui.theme

import androidx.compose.runtime.Composable
import androidx.compose.runtime.Immutable
import androidx.compose.runtime.ReadOnlyComposable
import androidx.compose.runtime.staticCompositionLocalOf
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.colorResource
import com.versett.generic_framework_ui_android.R

@Immutable
data class GFColors(
    val black: Color,
    val white: Color,
    val gray100: Color,
    val gray300: Color,
    val gray500: Color,
    val gray700: Color,
    val gray900: Color,
    val overlay: Color,
    val yellow: Color,
    val blue: Color,
    val green: Color,
    val red: Color,
    val orange: Color,
    val lightBlue: Color,
)

val LocalDesignSystemColors = staticCompositionLocalOf {
    GFColors(
        //Neutral
        black = Color.Unspecified,
        white = Color.Unspecified,
        //Monochromes
        gray100 = Color.Unspecified,
        gray300 = Color.Unspecified,
        gray500 = Color.Unspecified,
        gray700 = Color.Unspecified,
        gray900 = Color.Unspecified,
        overlay = Color.Unspecified,
        //Primary
        yellow = Color.Unspecified,
        //Secondary
        blue = Color.Unspecified,
        //Success
        green = Color.Unspecified,
        //Error
        red = Color.Unspecified,
        //Warning
        orange = Color.Unspecified,
        // Info
        lightBlue = Color.Unspecified,
    )
}

val extendedColors = GFColors(
    black = Color(0xFF121212),
    white = Color(0xFFFFFFFF),
    gray100 = Color(0xFFF3F4F8),
    gray300 = Color(0xFFD7D8DB),
    gray500 = Color(0xFF9D9EA3),
    gray700 = Color(0xFF808285),
    gray900 = Color(0xFF45484A),
    overlay = Color(0xFF000000),
    yellow = Color(0xFFF8C91C),
    blue = Color(0xFF0A9AFF),
    green = Color(0xFF50E3C2),
    red = Color(0xFFFF0000),
    orange = Color(0xFFF86B1C),
    lightBlue = Color(0xFF0A9AFF),
)

object Colors

@Composable
@ReadOnlyComposable
fun black(): Color = colorResource(id = R.color.black)

@Composable
@ReadOnlyComposable
fun error(): Color = colorResource(id = R.color.error)

@Composable
@ReadOnlyComposable
fun info(): Color = colorResource(id = R.color.info)

@Composable
@ReadOnlyComposable
fun monochrome100(): Color = colorResource(id = R.color.monochromes_monochrome_100)

@Composable
@ReadOnlyComposable
fun monochrome300(): Color = colorResource(id = R.color.monochromes_monochrome_300)

@Composable
@ReadOnlyComposable
fun monochrome500(): Color = colorResource(id = R.color.monochromes_monochrome_500)

@Composable
@ReadOnlyComposable
fun monochrome700(): Color = colorResource(id = R.color.monochromes_monochrome_700)

@Composable
@ReadOnlyComposable
fun monochrome900(): Color = colorResource(id = R.color.monochromes_monochrome_900)

@Composable
@ReadOnlyComposable
fun overlay(): Color = colorResource(id = R.color.overlay)

@Composable
@ReadOnlyComposable
fun pastelPrimary(): Color = colorResource(id = R.color.pastels_primary)

@Composable
@ReadOnlyComposable
fun pastelSecondary(): Color = colorResource(id = R.color.pastels_secondary)

@Composable
@ReadOnlyComposable
fun pastelsSuccess(): Color = colorResource(id = R.color.pastels_success)

@Composable
@ReadOnlyComposable
fun primary(): Color = colorResource(id = R.color.primary)

@Composable
@ReadOnlyComposable
fun secondary(): Color = colorResource(id = R.color.secondary)

@Composable
@ReadOnlyComposable
fun success(): Color = colorResource(id = R.color.success)

@Composable
@ReadOnlyComposable
fun warning(): Color = colorResource(id = R.color.warning)

@Composable
@ReadOnlyComposable
fun white(): Color = colorResource(id = R.color.white)
