package com.radzhabov.aviatravel.presentation.navigation

import androidx.compose.material.*
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Home
import androidx.compose.material.icons.filled.Person
import androidx.compose.material.icons.filled.Search
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import com.radzhabov.aviatravel.presentation.search.Search
import com.radzhabov.aviatravel.data.model.Screen
import com.radzhabov.aviatravel.presentation.home.Home
import com.radzhabov.aviatravel.presentation.profile.Profile
import com.radzhabov.aviatravel.presentation.trace.Trace
import com.radzhabov.aviatravel.presentation.theme.DarkBlue

@Composable
fun BottomNavBar() {
    var selectedScreen by remember { mutableStateOf(0) }
    val scaffoldState = rememberScaffoldState()

    val screens = listOf(
        Screen(label = "Home", icon = Icons.Filled.Home, text = "Home page"),
        Screen(label = "Search", icon = Icons.Filled.Search, text = "Search page"),
        Screen(label = "Trace", icon = Icons.Filled.Search, text = "Trace"),
        Screen(label = "Profile", icon = Icons.Filled.Person, text = "Profile page"),
    )

    Scaffold(
        scaffoldState = scaffoldState,
        bottomBar = {
            BottomNavigation(
                backgroundColor = DarkBlue,
                contentColor = Color.White
            ) {
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
            1 -> Search()
            2 -> Trace(innerPadding)
            3 -> Profile(innerPadding)
        }
    }

}

@Preview(showBackground = true)
@Composable
fun BottomNavBarPreview() {
    BottomNavBar()
}