package com.bizyback.play.chonjo.screens

import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.rounded.Favorite
import androidx.compose.material.icons.rounded.Home
import androidx.compose.material.icons.rounded.Search
import androidx.compose.material3.Icon
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.NavigationBar
import androidx.compose.material3.NavigationBarItem
import androidx.compose.material3.NavigationBarItemDefaults
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.vector.ImageVector
import cafe.adriel.voyager.core.screen.Screen
import cafe.adriel.voyager.navigator.LocalNavigator
import com.bizyback.play.chonjo.ui.components.CenteredScaffold

enum class Tabs {
    FEED, SEARCH, FAVORITES;

    val icon: ImageVector
        get() = when (this) {
            FEED -> Icons.Rounded.Home
            SEARCH -> Icons.Rounded.Search
            FAVORITES -> Icons.Rounded.Favorite
        }

    val label: String
        get() = when (this) {
            FEED -> "Feed"
            SEARCH -> "Search"
            FAVORITES -> "Favorites"
        }
}

object TabsScreen : Screen {
    @Composable
    override fun Content() {
        val navigator = LocalNavigator.current
        var tab by remember { mutableStateOf(Tabs.FEED) }
        CenteredScaffold(
            bottomBar = {
                NavigationBar(
                    containerColor = MaterialTheme.colorScheme.surface
                ) {
                    Tabs.entries.forEach { item ->
                        NavigationBarItem(
                            colors = NavigationBarItemDefaults.colors(
                                indicatorColor = Color.Transparent,
                                selectedIconColor = MaterialTheme.colorScheme.primary,
                                unselectedIconColor = MaterialTheme.colorScheme.onSurface.copy(0.25f)
                            ),
                            selected = item == tab,
                            icon = {
                                Icon(
                                    imageVector = item.icon,
                                    contentDescription = item.label
                                )
                            },
                            onClick = { tab = item }
                        )
                    }
                }
            }
        ) {
            val screen = when (tab) {
                Tabs.FEED -> FeedScreen
                Tabs.SEARCH -> SearchScreen
                Tabs.FAVORITES -> FavoriteScreen
            }
            screen.Content()
        }
    }
}