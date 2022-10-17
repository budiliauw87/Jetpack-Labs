package com.liaudev.jetgithub.ui.home

import android.content.res.Configuration
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.NavHostController


/**
 * Created by Budiliauw87 on 2022-10-17.
 * budiliauw87.github.io
 * Budiliauw87@gmail.com
 */
@Composable
fun HomeScreen(navController: NavHostController) {
    Home()
}

@Composable
fun Home() {
    Box(modifier = Modifier.fillMaxSize())
}


@Preview(
    name = "Light Mode",
)
@Preview(
    name = "Dark Mode", showBackground = true,
    uiMode = Configuration.UI_MODE_NIGHT_YES
)
@Composable
fun HomeScreenPreview() {
    Home()
}