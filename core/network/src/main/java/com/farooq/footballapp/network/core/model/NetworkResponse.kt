package com.farooq.footballapp.network.core.model

import kotlinx.serialization.Serializable

/**
 * Created by Syed Farooq Hassan on 12/20/2023.
 *
 * Wrapper for data provided from the [FOOTBALL_API_BASE_URL]
 */
@Serializable
data class NetworkResponse<T>(
    val data: T,
)
