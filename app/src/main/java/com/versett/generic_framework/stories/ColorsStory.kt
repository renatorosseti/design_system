package com.versett.generic_framework.stories

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.RectangleShape
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.text.style.TextDecoration
import androidx.compose.ui.unit.TextUnit
import com.versett.generic_framework_ui_android.R
import com.versett.ui.theme.GFTheme
import com.versett.ui.theme.pastelPrimary
import com.versett.ui.theme.pastelSecondary
import com.versett.ui.theme.pastelsSuccess
import com.versett.ui.theme.white
import com.versett.ui.util.Constants
import com.versett.ui.util.getSizeModifier

private const val ColorBoxSize = 80f

@Composable
fun ColorsStory() {

    LazyColumn(
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        item {
            ColorBox(GFTheme.colors.black, "Black")
            ColorBox(GFTheme.colors.red, "Error")
            ColorBox(GFTheme.colors.lightBlue, "Info")
            ColorBox(GFTheme.colors.gray100, "Monochrome 100")
            ColorBox(GFTheme.colors.gray300, "Monochrome 300")
            ColorBox(GFTheme.colors.gray500, "Monochrome 500")
            ColorBox(GFTheme.colors.gray700, "Monochrome 700")
            ColorBox(GFTheme.colors.gray900, "Monochrome 900")
            ColorBox(GFTheme.colors.overlay, "Overlay")
            ColorBox(pastelPrimary(), "Pastel Primary")
            ColorBox(pastelSecondary(), "Pastel Primary")
            ColorBox(pastelsSuccess(), "Pastel Success")
            ColorBox(GFTheme.colors.yellow, "Primary")
            ColorBox(GFTheme.colors.blue, "Secondary")
            ColorBox(GFTheme.colors.green, "Success")
            ColorBox(GFTheme.colors.orange, "Warning")
            ColorBox(GFTheme.colors.white, "White")
        }
    }
}

@Composable
fun ColorBox(color: Color, colorName: String) {
    Row(
        horizontalArrangement = Arrangement.Center,
        verticalAlignment = Alignment.CenterVertically,
    ) {
        Box(
            modifier = Modifier
                .getSizeModifier(Constants.FillMaxWidth, ColorBoxSize)
                .clip(shape = RectangleShape)
                .background(color)
                .padding(vertical = dimensionResource(R.dimen.space_30dp))
        ) {
            Text(
                modifier = Modifier.getSizeModifier(Constants.FillMaxWidth, ColorBoxSize),
                text = colorName,
                color = white(),
                fontSize = TextUnit.Unspecified,
                fontWeight = FontWeight.Normal,
                textDecoration = TextDecoration.None,
                textAlign = TextAlign.Center
            )
        }
    }
}
