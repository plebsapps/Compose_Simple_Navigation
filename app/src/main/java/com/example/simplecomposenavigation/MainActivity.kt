package com.example.simplecomposenavigation

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.navigation.NavType
import androidx.navigation.compose.NavHost
import androidx.navigation.compose.composable
import androidx.navigation.compose.rememberNavController
import androidx.navigation.navArgument

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            val navController = rememberNavController()
            NavHost(
                navController = navController,
                startDestination = "first"
            ) {
                /* creating route "home" */
                composable(route = "first") {
                    /* Using composable function */
                    FirstScreen(navController)
                }
                composable(
                    route = "second/{content}",
                    arguments = listOf(
                        navArgument("content") {
                            /* configuring arguments for navigation */
                            type = NavType.StringType
                        }
                    )
                ) {
                    SecondScreen(
                        navController,
                        it.arguments?.getString("content")
                    )
                }
            }
        }
    }
}