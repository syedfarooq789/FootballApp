package com.farooq.footballapp.ui

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.SnackbarResult
import androidx.compose.material3.TopAppBarDefaults
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.farooq.footballapp.data.util.NetworkMonitor
import com.farooq.footballapp.designsystem.component.FootballBackground
import com.farooq.footballapp.designsystem.component.FootballTopAppBar
import com.farooq.footballapp.designsystem.component.NiaGradientBackground
import com.farooq.footballapp.designsystem.theme.GradientColors
import com.farooq.footballapp.designsystem.theme.LocalGradientColors
import com.farooq.footballapp.navigation.FootballNavHost
import com.farooq.footballapp.navigation.TopLevelDestination


/**
 * Created by Syed Farooq Hassan on 12/22/2023.
 *
 * Football application definition.
 *
 * @param windowSizeClass Supports different screen sizes.
 * @param networkMonitor Monitors the internet connectivity.
 * @param appState Football application global state.
 */
@OptIn(ExperimentalMaterial3Api::class)
@Composable
fun FootballApp(
    windowSizeClass: WindowSizeClass,
    networkMonitor: NetworkMonitor,
    appState: FootballAppState = rememberFootballAppState(
        networkMonitor = networkMonitor,
        windowSizeClass = windowSizeClass
    )
) {
    val shouldShowGradientBackground =
        appState.currentTopLevelDestination == TopLevelDestination.FIXTURES
    val snackbarHostState = remember { SnackbarHostState() }
    FootballBackground {
        NiaGradientBackground(
            gradientColors = if (shouldShowGradientBackground) {
                LocalGradientColors.current
            } else {
                GradientColors()
            },
        ) {
            Column(Modifier.fillMaxSize()) {
                // Show the top app bar on top level destinations.
                val destination = appState.currentTopLevelDestination
                if (destination != null) {
                    FootballTopAppBar(
                        titleRes = destination.titleTextId,
                        colors = TopAppBarDefaults.centerAlignedTopAppBarColors(
                            containerColor = Color.Transparent,
                        )
                    )
                }
                FootballNavHost(appState = appState, onShowSnackbar = { message, action ->
                    snackbarHostState.showSnackbar(
                        message = message,
                        actionLabel = action,
                        duration = SnackbarDuration.Short,
                    ) == SnackbarResult.ActionPerformed
                })
            }
        }
    }

}