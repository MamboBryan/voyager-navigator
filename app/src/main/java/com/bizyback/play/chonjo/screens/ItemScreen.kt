package com.bizyback.play.chonjo.screens

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import cafe.adriel.voyager.core.screen.Screen
import com.bizyback.play.chonjo.ui.components.CenteredScaffold

object ItemScreen : Screen {
    @Composable
    override fun Content() {
        CenteredScaffold {
            Text(text = "Item Detail Screen")
        }
    }
}