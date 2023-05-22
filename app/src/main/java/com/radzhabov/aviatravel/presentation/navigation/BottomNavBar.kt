package com.radzhabov.aviatravel.presentation.navigation

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import androidx.navigation.compose.rememberNavController
import com.radzhabov.aviatravel.R
import com.radzhabov.aviatravel.presentation.search.Search
import com.radzhabov.aviatravel.data.model.Screen
import com.radzhabov.aviatravel.presentation.profile.Profile
import com.radzhabov.aviatravel.presentation.trace.Trace
import com.radzhabov.aviatravel.presentation.theme.DarkBlue

@Composable
fun BottomNavBar() {
    var selectedScreen by remember { mutableStateOf(0) }
    val scaffoldState = rememberScaffoldState()
    val navController = rememberNavController()

    val screens = listOf(
        Screen(label = "Search", icon = painterResource(R.drawable.ic_search)),
        Screen(label = "Trace", icon = painterResource(R.drawable.ic_trace)),
        Screen(label = "Profile", icon = painterResource(R.drawable.ic_profile))
    )

    Scaffold(
        scaffoldState = scaffoldState,
        bottomBar = {
            BottomNavigation(
                backgroundColor = DarkBlue,
                contentColor = Color.White,
                modifier = Modifier.fillMaxWidth().clip(RoundedCornerShape(15.dp, 15.dp, 0.dp, 0.dp))
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
            0 -> Search(navController)
            1 -> Trace()
            2 -> Profile(innerPadding)
        }
    }
}

@Preview(showBackground = true)
@Composable
fun BottomNavBarPreview() {
    BottomNavBar()
}