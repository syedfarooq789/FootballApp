package com.farooq.footballapp

import android.app.Application
import dagger.hilt.android.HiltAndroidApp


/**
 * Created by Syed Farooq Hassan on 1/4/2024.
 *
 * [Application] class for Football.
 */
@HiltAndroidApp
class FootballApplication : Application() {
    override fun onCreate() {
        super.onCreate()
    }
}