package com.farooq.footballapp.navigation

import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier


/**
 * Created by Syed Farooq Hassan on 12/22/2023.
 */
@Composable
fun FootballNavHost(
    appState: FootballAppState,
    onShowSnackbar: suspend (String, String?) -> Boolean,
    modifier: Modifier = Modifier,
    startDestination: String = forYouNavigationRoute,
) {
    val navController = appState.navController
    NavHost(
        navController = navController,
        startDestination = startDestination,
        modifier = modifier,
    ) {
        FixturesScreen(onTopicClick = navController::navigateToTopic)
    }
}