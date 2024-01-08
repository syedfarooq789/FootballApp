package com.farooq.ui

import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable


/**
 * Created by Syed Farooq Hassan on 1/2/2024.
 */
@Composable
fun appList() {
    LazyColumn {
        items(5) { index ->
            Text(text = "Item: $index")
        }
    }
}