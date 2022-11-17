package com.example.simplecomposenavigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.example.simplecomposenavigation.ui.theme.SimpleComposeNavigationTheme

@Preview(showBackground = true)
@Composable
fun FirstScreenPreview() {
    val navController = rememberNavController()
    FirstScreen(navController)
}

@Preview(showBackground = true)
@Composable
fun SecondScreenPreview() {
    val navController = rememberNavController()
    SecondScreen(
        navController, "content"
    )
}

@Preview(showBackground = true, backgroundColor = 0)
@Composable
fun FirstScreenPreviewDark() {
    SimpleComposeNavigationTheme(darkTheme = true) {
        val navController = rememberNavController()
        FirstScreen(navController)
    }
}

@Preview(showBackground = true, backgroundColor = 0)
@Composable
fun SecondScreenPreviewDark() {
    SimpleComposeNavigationTheme(darkTheme = true) {
        val navController = rememberNavController()
        SecondScreen(
            navController, "content"
        )
    }
}