package com.versett.generic_framework.stories

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Surface
import androidx.compose.runtime.Composable
import com.versett.ui.theme.black

@Composable
fun StorybookView(
    stories: List<Story>
) {
    Surface(color = black()) {
        LazyColumn {
            items(stories) { story ->
                StoryRowItem(story = story)
            }
        }
    }
}
