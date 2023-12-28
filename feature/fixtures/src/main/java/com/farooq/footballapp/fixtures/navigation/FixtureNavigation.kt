package com.farooq.footballapp.fixtures.navigation

import androidx.navigation.NavController
import androidx.navigation.NavGraphBuilder
import androidx.navigation.NavOptions
import androidx.navigation.compose.composable
import com.farooq.footballapp.fixtures.FixturesScreen


const val fixtureRoute = "fixtures/"

/**
 * Created by Syed Farooq Hassan on 12/27/2023.
 *
 * Used to navigate to fixtures screen.
 */
fun NavController.navigateToFixtures(navOptions: NavOptions? = null) {
    this.navigate(fixtureRoute, navOptions)
}

/**
 * Created by Syed Farooq Hassan on 12/27/2023.
 *
 * Defined fixtures screen.
 */
fun NavGraphBuilder.fixtureScreen(onTopicClick: (String) -> Unit) {
    composable(
        route = fixtureRoute
    ) {
        FixturesScreen()
    }
}