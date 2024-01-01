package com.farooq.footballapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.navigation.compose.NavHost
import com.farooq.footballapp.fixtures.navigation.fixtureRoute
import com.farooq.footballapp.fixtures.navigation.fixtureScreen
import com.farooq.footballapp.ui.FootballAppState

/**
 * Created by Syed Farooq Hassan on 12/22/2023.
 *
 * Football navigation host defining screens.
 */
@Composable
fun FootballNavHost(
    appState: FootballAppState,
    onShowSnackbar: suspend (String, String?) -> Boolean,
    modifier: Modifier = Modifier,
    startDestination: String = fixtureRoute,
) {
    val navController = appState.navController
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier,
    ) {
        fixtureScreen()
    }
}