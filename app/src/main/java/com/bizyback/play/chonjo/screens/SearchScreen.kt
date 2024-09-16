package com.bizyback.play.chonjo.screens

import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.text.font.FontWeight
import cafe.adriel.voyager.core.screen.Screen
import com.bizyback.play.chonjo.ui.components.CenteredScaffold

object SearchScreen : Screen {
    @Composable
    override fun Content() {
        CenteredScaffold {
            Text(
                text = "Search",
                fontSize = MaterialTheme.typography.titleLarge.fontSize,
                fontWeight = FontWeight.Bold
            )
        }
    }
}