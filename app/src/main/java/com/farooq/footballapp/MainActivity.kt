package com.farooq.footballapp

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.material3.windowsizeclass.ExperimentalMaterial3WindowSizeClassApi
import androidx.compose.material3.windowsizeclass.calculateWindowSizeClass
import com.farooq.footballapp.data.util.NetworkMonitor
import com.farooq.footballapp.ui.FootballApp
import com.farooq.footballapp.ui.theme.FootballAppTheme
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject




/**
 * Created by Syed Farooq Hassan on 12/27/2023.
 *
 * Main activity containing the main football app.
 */
@OptIn(ExperimentalMaterial3WindowSizeClassApi::class)
@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject
    lateinit var networkMonitor: NetworkMonitor

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            FootballAppTheme {
                FootballApp(
                    networkMonitor = networkMonitor,
                    windowSizeClass = calculateWindowSizeClass(this)
                )
            }
        }
    }
}