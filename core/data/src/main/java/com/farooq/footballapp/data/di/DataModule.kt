package com.farooq.footballapp.data.di

import com.farooq.footballapp.data.repository.FixturesRepository
import com.farooq.footballapp.data.repository.FixturesRepositoryImpl
import com.farooq.footballapp.data.util.ConnectivityManagerNetworkMonitor
import com.farooq.footballapp.data.util.NetworkMonitor
import dagger.Binds
import dagger.Module
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent


/**
 * Created by Syed Farooq Hassan on 1/4/2024.
 */
@Module
@InstallIn(SingletonComponent::class)
abstract class DataModule {
    @Binds
    internal abstract fun bindsNetworkMonitor(
        networkMonitor: ConnectivityManagerNetworkMonitor,
    ): NetworkMonitor

    @Binds
    internal abstract fun bindsFixturesRepository(
        fixturesRepositoryImpl: FixturesRepositoryImpl
    ): FixturesRepository
}