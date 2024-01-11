package com.farooq.ui

import com.farooq.footballapp.model.data.Fixtures


/**
 * Created by Syed Farooq Hassan on 1/8/2024.
 *
 * Fixtures list state.
 */
sealed interface FixturesListState {
    /**
     * The fixtures list is loading.
     */
    data object Loading : FixturesListState

    /**
     * The fixtures list is shown
     */
    data class Shown(
        val fixtures: List<Fixtures>,
    ) : FixturesListState
}
