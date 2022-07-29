package com.versett.ui.components.bottomsheet

import androidx.annotation.DrawableRes
import androidx.compose.foundation.Image
import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.layout.wrapContentHeight
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Card
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.style.TextAlign
import com.versett.generic_framework_ui_android.R
import com.versett.ui.components.button.PrimaryButton
import com.versett.ui.components.button.TextLink
import com.versett.ui.theme.Shapes
import com.versett.ui.theme.Typography
import com.versett.ui.theme.black
import com.versett.ui.theme.monochrome300
import com.versett.ui.theme.monochrome900
import com.versett.ui.theme.white

@Composable
fun BiometricBottomSheetComponent(
    @DrawableRes iconDrawableResourceId: Int,
    contentDescription: String,
    title: String,
    description: String,
    buttonTitle: String,
    textLinkTitle: String,
    buttonOnClickListener: () -> Unit,
    textLinkOnClickListener: () -> Unit
) {
    Card(
        elevation = dimensionResource(R.dimen.space_4dp),
        modifier = Modifier
            .fillMaxWidth()
            .wrapContentHeight()
            .background(color = Color.Transparent)
    ) {
        Column(
            modifier = Modifier
                .padding(top = dimensionResource(R.dimen.space_12dp))
                .background(
                    color = white(),
                    shape = RoundedCornerShape(
                        topStart = dimensionResource(R.dimen.space_4dp),
                        topEnd = dimensionResource(R.dimen.space_4dp)
                    )
                ),
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            Box(
                modifier = Modifier
                    .height(dimensionResource(R.dimen.space_4dp))
                    .width(dimensionResource(R.dimen.biometric_bottom_sheet_box))
                    .background(color = monochrome300(), shape = Shapes.small)
            )
            Image(
                painter = painterResource(id = iconDrawableResourceId),
                contentDescription = contentDescription,
                Modifier.padding(top = dimensionResource(R.dimen.space_28dp))
            )
            Text(
                text = title,
                modifier = Modifier.padding(
                    top = dimensionResource(R.dimen.space_16dp),
                    start = dimensionResource(R.dimen.space_24dp),
                    end = dimensionResource(R.dimen.space_24dp)
                ),
                style = Typography.heading6Bold,
                color = black(),
                textAlign = TextAlign.Center
            )
            Text(
                text = description,
                modifier = Modifier.padding(
                    top = dimensionResource(R.dimen.space_16dp),
                    start = dimensionResource(R.dimen.space_24dp),
                    end = dimensionResource(R.dimen.space_24dp)
                ),
                style = Typography.body3Regular,
                color = monochrome900(),
                textAlign = TextAlign.Center
            )
            Box(modifier = Modifier.height(dimensionResource(R.dimen.biometric_bottom_sheet_height)))
            Surface(
                shape = RoundedCornerShape(
                    topStart = dimensionResource(R.dimen.space_4dp),
                    topEnd = dimensionResource(R.dimen.space_4dp)
                ),
                elevation = dimensionResource(R.dimen.space_8dp)
            ) {
                Column(horizontalAlignment = Alignment.CenterHorizontally) {
                    Box(
                        modifier = Modifier.padding(
                            top = dimensionResource(R.dimen.space_16dp),
                            start = dimensionResource(R.dimen.space_24dp),
                            end = dimensionResource(R.dimen.space_24dp)
                        )
                    ) {
                        PrimaryButton(
                            title = buttonTitle,
                            onClickListener = buttonOnClickListener
                        )
                    }
                    Box(
                        modifier = Modifier.padding(
                            top = dimensionResource(R.dimen.space_18dp),
                            bottom = dimensionResource(R.dimen.space_12dp)
                        )
                    ) {
                        TextLink(
                            title = textLinkTitle,
                            textStyle = Typography.ctaTextSm,
                            onClickListener = textLinkOnClickListener
                        )
                    }
                }
            }
        }
    }
}
