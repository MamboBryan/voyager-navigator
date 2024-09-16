package com.bizyback.play.chonjo.screens

import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import com.bizyback.play.chonjo.ui.components.CenteredScaffold

object FavoriteScreen : Screen {
    @Composable
    override fun Content() {
        val navigator = LocalNavigator.current
        CenteredScaffold {
            Text(
                text = "Favorites",
                fontSize = MaterialTheme.typography.titleLarge.fontSize,
                fontWeight = FontWeight.Bold
            )
            Button(onClick = { navigator?.push(ItemScreen) }) {
                Text(text = "Navigate To Item")
            }
        }
    }
}