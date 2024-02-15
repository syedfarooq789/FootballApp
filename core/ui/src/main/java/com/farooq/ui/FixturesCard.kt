package com.farooq.ui

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.semantics.onClick
import androidx.compose.ui.semantics.semantics
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.farooq.footballapp.model.data.Fixtures


/**
 * Created by Syed Farooq Hassan on 1/11/2024.
 */
@Preview
@Composable
fun FixturesCard(
//    onClick: () -> Unit,
    fixtures: Fixtures,
    modifier: Modifier = Modifier
) {
    val clickActionLabel = stringResource(R.string.fixtures)
    Card(
//        onClick = onClick,
        shape = RoundedCornerShape(16.dp),
        colors = CardDefaults.cardColors(containerColor = MaterialTheme.colorScheme.surface),
        // Use custom label for accessibility services to communicate button's action to user.
        // Pass null for action to only override the label and not the actual action.
        modifier = modifier.semantics {
            onClick(label = clickActionLabel, action = null)
        },
    ) {
        Column {
            Box(
                modifier = Modifier.padding(16.dp),
            ) {
                Row {
                    TeamNames(fixtures.name!!)
                }
            }
        }
    }

}

@Composable
fun TeamNames(
    teamName: String,
    modifier: Modifier = Modifier,
) {
    Text(teamName, style = MaterialTheme.typography.headlineSmall, modifier = modifier)
}