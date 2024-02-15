package com.farooq.ui

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.runtime.Composable


/**
 * Created by Syed Farooq Hassan on 1/2/2024.
 *
 * Fixtures list.
 *
 * @param fixturesListState Fixtures list state value.
 */
@Composable
fun FixturesList(fixturesListState: FixturesListState) {
    when (fixturesListState) {
        FixturesListState.Loading -> Unit
        is FixturesListState.Shown -> {
            LazyColumn {
                items(fixturesListState.fixtures) {
                    FixturesCard(it)
                }

            }

        }
    }
}