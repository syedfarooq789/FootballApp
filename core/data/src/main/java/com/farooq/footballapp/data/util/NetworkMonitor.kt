package com.farooq.footballapp.data.util

import kotlinx.coroutines.flow.Flow


/**
 * Created by Syed Farooq Hassan on 12/25/2023.
 *
 * Utility for reporting app connectivity status
 */
interface NetworkMonitor {
    val isOnline: Flow<Boolean>
}