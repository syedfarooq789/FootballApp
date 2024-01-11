package com.farooq.footballapp.data.repository

import com.farooq.footballapp.model.data.Fixtures
import kotlinx.coroutines.flow.Flow


/**
 * Created by Syed Farooq Hassan on 1/8/2024.
 *
 * Fixtures repository interface.
 */
interface FixturesRepository {
    fun getFixtures(): Flow<List<Fixtures>>
}