package com.radzhabov.aviatravel.testnav

import androidx.compose.foundation.layout.Column
import androidx.compose.material.BottomNavigation
import androidx.compose.material.BottomNavigationItem
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.res.painterResource
import androidx.navigation.NavController
import androidx.navigation.compose.currentBackStackEntryAsState
import com.radzhabov.aviatravel.R

@Composable
fun Screen1(navController: NavController) {
    Column {
        Text(text = "Screen 1")

        // BottomNavigationView
        BottomNavigation {
            val navBackStackEntry by navController.currentBackStackEntryAsState()
            val currentRoute = navBackStackEntry?.destination?.route
            BottomNavigationItem(
                icon = { /* иконка */ },
                label = { Text("Экран 1") },
                selected = currentRoute == "screen1",
                onClick = {
                    navController.navigate("screen1")
                }
            )
            BottomNavigationItem(
                icon = { painterResource(R.drawable.ic_search) },
                label = { Text("Экран 2") },
                selected = currentRoute == "screen2",
                onClick = {
                    navController.navigate("screen2")
                }
            )
            BottomNavigationItem(
                icon = { /* иконка */ },
                label = { Text("Экран 3") },
                selected = currentRoute == "screen3",
                onClick = {
                    navController.navigate("screen3")
                }
            )
        }
    }
}

@Composable
fun Screen2(navController: NavController) {
    Column {
        Text(text = "Screen 2")

        // BottomNavigationView
        BottomNavigation {
            val navBackStackEntry by navController.currentBackStackEntryAsState()
            val currentRoute = navBackStackEntry?.destination?.route
            BottomNavigationItem(
                icon = { /* иконка */ },
                label = { Text("Экран 1") },
                selected = currentRoute == "screen1",
                onClick = {
                    navController.navigate("screen1")
                }
            )
            BottomNavigationItem(
                icon = { painterResource(R.drawable.ic_search) },
                label = { Text("Экран 2") },
                selected = currentRoute == "screen2",
                onClick = {
                    navController.navigate("screen2")
                }
            )
            BottomNavigationItem(
                icon = { /* иконка */ },
                label = { Text("Экран 3") },
                selected = currentRoute == "screen3",
                onClick = {
                    navController.navigate("screen3")
                }
            )
        }
    }
}


@Composable
fun Screen3(navController: NavController) {
    Column {
        Text(text = "Screen 3")

        // BottomNavigationView
        BottomNavigation {
            val navBackStackEntry by navController.currentBackStackEntryAsState()
            val currentRoute = navBackStackEntry?.destination?.route
            BottomNavigationItem(
                icon = { /* иконка */ },
                label = { Text("Экран 1") },
                selected = currentRoute == "screen1",
                onClick = {
                    navController.navigate("screen1")
                }
            )
            BottomNavigationItem(
                icon = { painterResource(R.drawable.ic_search) },
                label = { Text("Экран 2") },
                selected = currentRoute == "screen2",
                onClick = {
                    navController.navigate("screen2")
                }
            )
            BottomNavigationItem(
                icon = { /* иконка */ },
                label = { Text("Экран 3") },
                selected = currentRoute == "screen3",
                onClick = {
                    navController.navigate("screen3")
                }
            )
        }
    }
}