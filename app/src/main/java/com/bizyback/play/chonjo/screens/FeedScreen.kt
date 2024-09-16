package com.bizyback.play.chonjo.screens

import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import com.bizyback.play.chonjo.ui.components.CenteredScaffold

object FeedScreen : Screen {
    @Composable
    override fun Content() {
        val navigator = LocalNavigator.current
        CenteredScaffold {
            Text(
                text = "Feed",
                fontSize = MaterialTheme.typography.titleLarge.fontSize,
                fontWeight = FontWeight.Bold
            )
            Button(modifier = Modifier.padding(16.dp), onClick = { navigator?.push(ItemScreen) }) {
                Text(text = "Navigate To Item")
            }
        }
    }
}