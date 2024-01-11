package com.farooq.footballapp.network.core

import com.farooq.footballapp.model.data.Fixtures


/**
 * Created by Syed Farooq Hassan on 1/8/2024.
 *
 * Communicates with repository to give the data source data.
 */
interface FootballDataSource {
    suspend fun getFixtures(): List<Fixtures>
}