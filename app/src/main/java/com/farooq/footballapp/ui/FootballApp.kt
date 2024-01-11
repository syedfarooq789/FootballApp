package com.farooq.footballapp.ui

import androidx.compose.material3.SnackbarDuration
import androidx.compose.material3.SnackbarHostState
import androidx.compose.material3.SnackbarResult
import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import com.farooq.footballapp.data.util.NetworkMonitor
import com.farooq.footballapp.navigation.FootballNavHost


/**
 * Created by Syed Farooq Hassan on 12/22/2023.
 */
@Composable
fun FootballApp(
    windowSizeClass: WindowSizeClass,
    networkMonitor: NetworkMonitor,
    appState: FootballAppState = rememberFootballAppState(
        networkMonitor = networkMonitor,
        windowSizeClass = windowSizeClass
    )
) {
    val snackbarHostState = remember { SnackbarHostState() }
    FootballNavHost(appState = appState, onShowSnackbar = { message, action ->
        snackbarHostState.showSnackbar(
            message = message,
            actionLabel = action,
            duration = SnackbarDuration.Short,
        ) == SnackbarResult.ActionPerformed
    })
}