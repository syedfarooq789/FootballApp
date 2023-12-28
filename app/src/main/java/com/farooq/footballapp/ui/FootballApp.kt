package com.farooq.footballapp.ui

import androidx.compose.material3.windowsizeclass.WindowSizeClass
import androidx.compose.runtime.Composable
import com.farooq.footballapp.data.util.NetworkMonitor


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

}