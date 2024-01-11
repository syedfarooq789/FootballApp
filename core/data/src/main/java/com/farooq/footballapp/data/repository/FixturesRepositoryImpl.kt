package com.farooq.footballapp.data.repository

import com.farooq.footballapp.model.data.Fixtures
import com.farooq.footballapp.network.core.FootballDataSource
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.flow
import javax.inject.Inject


/**
 * Created by Syed Farooq Hassan on 1/8/2024.
 *
 * Fixtures repository responsible for fetching data from the data source.
 *
 * @param footballDataSource Football data source instance.
 */
internal class FixturesRepositoryImpl @Inject constructor(
    private val footballDataSource: FootballDataSource
) : FixturesRepository {
    override fun getFixtures(): Flow<List<Fixtures>> =
        flow {
            val result =
                footballDataSource.getFixtures()
            emit(result)
        }
}