package com.farooq.footballapp.network.core.retrofit

import com.farooq.footballapp.network.core.model.Fixtures
import com.farooq.footballapp.network.core.model.NetworkResponse
import retrofit2.http.GET

/**
 *  Created by Syed Farooq Hassan on 12/20/2023.
 *
 * Retrofit API declaration for Football Network API
 */
interface FixturesService {
    @GET("fixtures")
    suspend fun getAllFixtures(): NetworkResponse<List<Fixtures>>

    @GET("fixtures")
    suspend fun getFixturesById(): NetworkResponse<List<Fixtures>>
}