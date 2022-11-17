package com.example.simplecomposenavigation

import androidx.compose.foundation.*
import androidx.compose.foundation.layout.*
import androidx.compose.material.*
import androidx.compose.runtime.*
import androidx.compose.ui.*
import androidx.compose.ui.unit.dp
import androidx.navigation.NavController

@Composable
fun FirstScreen(navController: NavController) {
    var text by remember {
        mutableStateOf("")
    }
    Column(
        modifier = Modifier.fillMaxSize(),
        horizontalAlignment = Alignment.CenterHorizontally,
        verticalArrangement = Arrangement.Center
    ) {
        OutlinedTextField(
            value = text,
            onValueChange = { text = it },
            singleLine = true,
            colors = TextFieldDefaults.outlinedTextFieldColors(
                textColor = MaterialTheme.colors.onBackground,
                backgroundColor = MaterialTheme.colors.background,
                focusedBorderColor = MaterialTheme.colors.primary,
                unfocusedBorderColor = MaterialTheme.colors.primaryVariant,
            ),
            modifier = Modifier.border(2.dp, MaterialTheme.colors.primary)
        )
        Spacer(modifier = Modifier.height(16.dp))
        Button(
            onClick = {
                if (text == "") text = "empty"
                /* going to second screen with the value of text */
                navController.navigate("second/$text")
            }
        ) {
            Text(text = "Second Screen")
        }
    }
}