package com.farooq.footballapp.domain

import com.farooq.footballapp.data.repository.FixturesRepository
import com.farooq.footballapp.model.data.Fixtures
import kotlinx.coroutines.flow.Flow
import javax.inject.Inject


/**
 * Created by Syed Farooq Hassan on 1/8/2024.
 *
 * Gets fixtures from the repository.
 *
 * @param fixturesRepository Fixtures repository responsible for fetching data from data source.
 */
class GetFixturesUseCase @Inject constructor(
    private val fixturesRepository: FixturesRepository
) {
    operator fun invoke(): Flow<List<Fixtures>> = fixturesRepository.getFixtures()

}