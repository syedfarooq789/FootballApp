package com.farooq.footballapp.network.core.di

import com.farooq.footballapp.network.core.FootballDataSource
import com.farooq.footballapp.network.core.FootballDataSourceImpl
import com.farooq.footballapp.network.core.retrofit.FixturesService
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
    internal abstract fun bindsFootballDataSource(
        footballDataSourceImpl: FootballDataSourceImpl
    ): FootballDataSource
}