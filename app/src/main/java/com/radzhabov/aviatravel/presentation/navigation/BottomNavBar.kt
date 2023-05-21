package com.radzhabov.aviatravel.presentation.navigation

import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import com.radzhabov.aviatravel.R
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
        Screen(label = "Home", icon = painterResource(R.drawable.ic_home)),
        Screen(label = "Search", icon = painterResource(R.drawable.ic_search)),
        Screen(label = "Trace", icon = painterResource(R.drawable.ic_trace)),
        Screen(label = "Profile", icon = painterResource(R.drawable.ic_profile)),
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