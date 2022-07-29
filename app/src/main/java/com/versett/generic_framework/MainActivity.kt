package com.versett.generic_framework

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material.Scaffold
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import com.versett.generic_framework.stories.BottomSheetStory
import com.versett.generic_framework.stories.ButtonStory
import com.versett.generic_framework.stories.ColorsStory
import com.versett.generic_framework.stories.Story
import com.versett.generic_framework.stories.StorybookView
import com.versett.generic_framework.stories.TextFieldStory
import com.versett.generic_framework.stories.TypographyStory
import com.versett.ui.theme.GFTheme

class MainActivity : ComponentActivity() {
    private val stories = listOf(
        Story(title = "Colors") {
            ColorsStory()
        },
        Story(title = "Typography") {
            TypographyStory()
        },
        Story(title = "Button") {
            ButtonStory()
        },
        Story(title = "Input Text") {
            TextFieldStory()
        },
        Story(title = "Bottom sheet") {
            BottomSheetStory()
        }
    )

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        setContent {
            GFTheme {
                val navController = rememberNavController()
                // A surface container using the 'background' color from the theme
                Scaffold(topBar = {
                    TopAppBar(
                        title = { Text("GF App UI Library") },
                        backgroundColor = GFTheme.colors.black,
                        contentColor = GFTheme.colors.white
                    )
                }) {
                    NavHost(navController, startDestination = "storybook") {
                        composable(route = "storybook") {
                            StorybookView(stories = stories)
                        }
                    }
                }
            }
        }
    }
}
