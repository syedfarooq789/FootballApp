package com.farooq.footballapp.network.core

import com.farooq.footballapp.common.Dispatcher
import com.farooq.footballapp.common.FootballDispatchers
import com.farooq.footballapp.network.core.retrofit.FixturesService
import com.farooq.footballapp.model.data.Fixtures
import kotlinx.coroutines.CoroutineDispatcher
import kotlinx.coroutines.withContext
import javax.inject.Inject


/**
 * Created by Syed Farooq Hassan on 1/8/2024.
 *
 * Fetches the data from the api.
 *
 * @param ioDispatcher IO dispatcher instance.
 * @param fixturesService Retrofit interface used to fetch data from api.
 */
internal class FootballDataSourceImpl @Inject constructor(
    @Dispatcher(FootballDispatchers.IO) private val ioDispatcher: CoroutineDispatcher,
    private val fixturesService: FixturesService
) :
    FootballDataSource {
    override suspend fun getFixtures(): List<Fixtures> =
        withContext(ioDispatcher) {
            fixturesService.getAllFixtures().data
        }
}