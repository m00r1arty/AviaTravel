package com.radzhabov.aviatravel.screens.presentation.navigation

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Settings
import androidx.compose.runtime.*
import com.radzhabov.aviatravel.screens.presentation.search.Search
import com.radzhabov.aviatravel.screens.data.model.Screen
import com.radzhabov.aviatravel.screens.presentation.home.Home
import com.radzhabov.aviatravel.screens.presentation.profile.Profile

@Composable
fun BottomNavBar() {
    var selectedScreen by remember { mutableStateOf(0) }
    val scaffoldState = rememberScaffoldState()
    val screens = listOf(
        Screen(label = "Home", icon = Icons.Filled.Home, text = "Home page"),
        Screen(label = "Profile", icon = Icons.Filled.Person, text = "Profile page"),
        Screen(label = "Settings", icon = Icons.Filled.Settings, text = "Settings page"),
    )

    Scaffold(
        scaffoldState = scaffoldState,
        bottomBar = {
            BottomNavigation {
                screens.forEachIndexed { index, screen ->
                    BottomNavigationItem(
                        selected = selectedScreen == index,
                        onClick = { selectedScreen = index },
                        icon = { Icon(screen.icon, contentDescription = screen.label) },
                        label = { Text(screen.text) }
                    )
                }
            }
        }
    ) { innerPadding ->
        when (selectedScreen) {
            0 -> Home(innerPadding)
            1 -> Profile(innerPadding)
            2 -> Search(innerPadding)
        }
    }
}
