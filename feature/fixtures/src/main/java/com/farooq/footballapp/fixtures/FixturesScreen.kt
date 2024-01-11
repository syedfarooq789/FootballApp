package com.farooq.footballapp.fixtures

import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.hilt.navigation.compose.hiltViewModel
import androidx.lifecycle.compose.collectAsStateWithLifecycle
import com.farooq.ui.FixturesList
import com.farooq.ui.FixturesListState


/**
 * Created by Syed Farooq Hassan on 12/22/2023.
 *
 * Fixtures Screen.
 *
 * @param modifier Modifier instance.
 * @param viewModel Fixture view model.
 */
@Composable
internal fun FixturesRoute(
    modifier: Modifier = Modifier,
    viewModel: FixturesViewModel = hiltViewModel()
) {
    val onFixturesUiState by viewModel.onFixturesUiState.collectAsStateWithLifecycle()
    FixturesScreen(onFixturesUiState)
}


/**
 * Created by Syed Farooq Hassan on 12/22/2023.
 *
 * Fixtures Screen.
 *
 * @param onFixturesUiState Fixture list state value.
 */
@Composable
internal fun FixturesScreen(
    onFixturesUiState: FixturesListState
) {
    FixturesList(onFixturesUiState)
}