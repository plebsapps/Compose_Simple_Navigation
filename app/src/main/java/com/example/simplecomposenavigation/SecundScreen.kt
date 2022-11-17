package com.example.simplecomposenavigation

import androidx.compose.foundation.layout.*
import androidx.compose.material.Button
import androidx.compose.material.MaterialTheme
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun SecondScreen(navController: NavController, content: String?) {
    require(content != null)

    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        Text(text = content, style = MaterialTheme.typography.h1)
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {
                /* going back to the main screen */
                navController.navigateUp()
            }
        ) {
            Text(text = "Go back")
        }
    }
}