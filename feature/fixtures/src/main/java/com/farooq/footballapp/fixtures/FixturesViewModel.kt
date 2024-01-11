package com.farooq.footballapp.fixtures

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.farooq.footballapp.domain.GetFixturesUseCase
import com.farooq.ui.FixturesListState
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.map
import kotlinx.coroutines.flow.stateIn
import javax.inject.Inject


/**
 * Created by Syed Farooq Hassan on 12/29/2023.
 *
 * Fixtures view model.
 *
 * @param getFixturesUseCase Gets the fixtures from the repository.
 */
@HiltViewModel
class FixturesViewModel @Inject constructor(
    getFixturesUseCase: GetFixturesUseCase
) : ViewModel() {
    val onFixturesUiState: StateFlow<FixturesListState> = getFixturesUseCase().map {
        FixturesListState.Shown(fixtures = it)
    }
        .stateIn(
            scope = viewModelScope,
            started = SharingStarted.WhileSubscribed(5_000),
            initialValue = FixturesListState.Loading,
        )
}