package com.farooq.footballapp.navigation

import androidx.compose.ui.graphics.vector.ImageVector
import com.farooq.footballapp.R
import com.farooq.footballapp.designsystem.FootballIcons

/**
 * Created by Syed Farooq Hassan on 12/27/2023.
 *   Type for the top level destinations in the application. Each of these destinations
 *   can contain one or more screens (based on the window size). Navigation from one screen to the
 *   next within a single destination will be handled directly in composables.
 *
 */
enum class TopLevelDestination(
    val selectedIcon: ImageVector,
    val unselectedIcon: ImageVector,
    val iconTextId: Int,
    val titleTextId: Int,
) {
    FIXTURES(
        selectedIcon = FootballIcons.Home,
        unselectedIcon = FootballIcons.Home,
        iconTextId = R.string.app_name,
        titleTextId = com.farooq.fixtures.R.string.for_you
    ),
}
