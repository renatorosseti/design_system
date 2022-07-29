package com.versett.generic_framework.stories

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.versett.generic_framework_ui_android.R
import com.versett.ui.components.bottomsheet.BiometricBottomSheetComponent
import com.versett.ui.components.bottomsheet.BottomSheet
import com.versett.ui.theme.GFTheme

@Composable
fun BottomSheetStory() {
    (LocalContext.current as? StoryActivity)?.let {
        val versettButton = ButtonDefaults.buttonColors(
            backgroundColor = GFTheme.colors.black,
            contentColor = GFTheme.colors.white
        )

        val bottomSheet = BottomSheet()

        Column(
            modifier = Modifier.fillMaxWidth().padding(20.dp),
            horizontalAlignment = Alignment.CenterHorizontally,
        ) {
            Button(
                colors = versettButton,
                modifier = Modifier.fillMaxWidth().padding(20.dp),
                onClick = {
                    bottomSheet.showContent(
                        fragmentManager = it.supportFragmentManager,
                        tag = "face_id"
                    ) {
                        BiometricBottomSheetComponent(
                            iconDrawableResourceId = R.drawable.ic_face_authentication,
                            contentDescription = "Face Authentication",
                            title = "Would you like to enable Face Authentication?",
                            description = "Once you set up Face Authentication, You’ll be able to use it to Log in faster.",
                            buttonTitle = "Enable Face Authentication",
                            textLinkTitle = "Do not enable Face Authentication",
                            buttonOnClickListener = {
                                println("click button")
                            },
                            textLinkOnClickListener = {
                                println("click text link")
                            }
                        )
                    }
                }
            ) {
                Text(
                    text = "Face ID"
                )
            }
            Button(
                colors = versettButton,
                modifier = Modifier.fillMaxWidth().padding(20.dp),
                onClick = {
                    bottomSheet.showContent(
                        fragmentManager = it.supportFragmentManager,
                        tag = "touch_id",
                        isSwipeDismiss = true,
                        isTouchOutsideDismiss = true
                    ) {
                        BiometricBottomSheetComponent(
                            iconDrawableResourceId = R.drawable.ic_fingerprint_authentication,
                            contentDescription = "Fingerprint Authentication",
                            title = "Would you like to enable Fingerprint Authentication?",
                            description = "Once you set up Fingerprint Authentication, You’ll be able to use it to Log in faster.",
                            buttonTitle = "Enable Fingerprint Authentication",
                            textLinkTitle = "Do not enable Fingerprint Authentication",
                            buttonOnClickListener = {
                                println("click button")
                            },
                            textLinkOnClickListener = {
                                println("click text link")
                            }
                        )
                    }
                }
            ) {
                Text(
                    text = "Touch ID"
                )
            }
            Button(
                colors = versettButton,
                modifier = Modifier.fillMaxWidth().padding(20.dp),
                onClick = {
                    bottomSheet.showContent(
                        fragmentManager = it.supportFragmentManager,
                        tag = "face_id_failed"
                    ) {
                        BiometricBottomSheetComponent(
                            iconDrawableResourceId = R.drawable.ic_face_authentication,
                            contentDescription = "Face Authentication",
                            title = "Face Authentication could not be enabled.",
                            description = "To set up Face Authentication you must enable it within your device’s app settings.",
                            buttonTitle = "Go to settings",
                            textLinkTitle = "Do not enable Face Authentication",
                            buttonOnClickListener = {
                                println("click button")
                            },
                            textLinkOnClickListener = {
                                println("click text link")
                            }
                        )
                    }
                }
            ) {
                Text(
                    text = "Face ID failed"
                )
            }
            Button(
                colors = versettButton,
                modifier = Modifier.fillMaxWidth().padding(20.dp),
                onClick = {
                    bottomSheet.showContent(
                        fragmentManager = it.supportFragmentManager,
                        tag = "touch_id_failed"
                    ) {
                        BiometricBottomSheetComponent(
                            iconDrawableResourceId = R.drawable.ic_fingerprint_authentication,
                            contentDescription = "Fingerprint Authentication",
                            title = "Would you like to enable Fingerprint Authentication?",
                            description = "Once you set up Fingerprint Authentication, You’ll be able to use it to Log in faster.",
                            buttonTitle = "Enable Fingerprint Authentication",
                            textLinkTitle = "Do not enable Fingerprint Authentication",
                            buttonOnClickListener = {
                                println("click button")
                            },
                            textLinkOnClickListener = {
                                println("click text link")
                            }
                        )
                    }
                }
            ) {
                Text(
                    text = "Touch ID failed"
                )
            }
        }
    }
}
