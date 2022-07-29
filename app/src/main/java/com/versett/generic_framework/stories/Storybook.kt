package com.versett.generic_framework.stories

import android.app.Activity
import android.content.Intent
import android.os.Bundle
import androidx.activity.compose.setContent
import androidx.appcompat.app.AppCompatActivity
import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material.Divider
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.Scaffold
import androidx.compose.material.Surface
import androidx.compose.material.Text
import androidx.compose.material.TopAppBar
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.ArrowBack
import androidx.compose.material.icons.filled.ArrowForward
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.dimensionResource
import androidx.compose.ui.unit.dp
import com.versett.generic_framework_ui_android.R
import com.versett.ui.theme.GFTheme

private val RowHeight = 42.dp

class CurrentStory(
    var story: Story? = null
) {
    companion object {
        val instance = CurrentStory()
    }
}

class Story(
    val title: String, val builder: @Composable () -> Unit
)

class StoryActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        CurrentStory.instance.story?.let {
            val story = it
            setContent {
                val activity = (LocalContext.current as? Activity)

                GFTheme {
                    Scaffold(topBar = {
                        TopAppBar(
                            title = { Text(story.title) },
                            backgroundColor = GFTheme.colors.black,
                            contentColor = GFTheme.colors.white,
                            navigationIcon = {
                                IconButton(onClick = {
                                    activity?.finish()
                                }) {
                                    Icon(
                                        imageVector = Icons.Filled.ArrowBack,
                                        contentDescription = "Back",
                                    )
                                }
                            })
                    }) {
                        story.builder()
                    }
                }
            }
        }
    }
}

@Composable
fun StoryRowItem(
    story: Story
) {
    val context = LocalContext.current

    Surface(Modifier.background(color = Color.White)) {
        Column {
            Divider(color = Color.White, modifier = Modifier.height(dimensionResource(R.dimen.space_16dp)))
            Row(
                modifier = Modifier
                    .height(RowHeight)
                    .fillMaxWidth()
                    .padding(
                        horizontal = dimensionResource(
                            R.dimen.space_16dp
                        )
                    )
                    .clickable {
                        CurrentStory.instance.story = story
                        val intent = Intent(context, StoryActivity::class.java)
                        context.startActivity(intent)
                    }, horizontalArrangement = Arrangement.SpaceBetween
            ) {
                Text(story.title)
                Icon(Icons.Filled.ArrowForward, "", tint = Color.DarkGray)
            }
            Divider(color = Color.LightGray, thickness = dimensionResource(R.dimen.border_1dp))
        }
    }
}
