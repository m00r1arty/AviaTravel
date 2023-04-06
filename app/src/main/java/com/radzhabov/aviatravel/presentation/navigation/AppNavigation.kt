package com.radzhabov.aviatravel.presentation.navigation

import androidx.compose.runtime.Composable
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.rememberNavController
import androidx.navigation.compose.composable
import com.radzhabov.aviatravel.presentation.screen.LoginScreen
import com.radzhabov.aviatravel.presentation.screen.RegisterScreen
import com.radzhabov.aviatravel.presentation.screen.Screens


@Composable
fun AppNavigation(){
    val navController = rememberNavController()

    NavHost(
        navController = navController,
        startDestination = Screens.Login.route
    ){
        composable(route = Screens.Login.route){
            LoginScreen(navController)
        }

        composable(route = Screens.Register.route ){
            RegisterScreen()
        }
    }
}

/*
@Composable
fun AppNavigation() {
    val navController = rememberNavController()

    NavHost(
        navController,
        startDestination = Screen.Login.route,
    ) {
        composable(Screen.Login.route) {
            LoginScreen(onClickRegister = {
                navController.navigate(Screen.Register.route)
            })
        }
        composable(Screen.Register.route) {
            RegisterScreen()
        }
    }
}


@Composable
fun MyScreen1(navController: NavController) {
    Button(onClick = { navController.navigate("MyScreen2") }) {
        Text("Перейти на MyScreen2")
    }
}

@Composable
fun MyScreen2() {
    Text("Вы перешли на MyScreen2")
}

@Composable
fun MyApp() {
    val navController = rememberNavController()

    NavHost(navController = navController, startDestination = "MyScreen1") {
        composable("MyScreen1") {
            MyScreen1(navController = navController)
        }
        composable("MyScreen2") {
            MyScreen2()
        }
    }
}
*/