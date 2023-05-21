package com.radzhabov.aviatravel.presentation.search

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.padding
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.radzhabov.aviatravel.presentation.ListCountry

@Composable
fun Search() {
    Column(
        modifier = Modifier
            .padding(5.dp)
    ) {
        ListCountry()
    }
}


@Preview(showBackground = true)
@Composable
fun SearchPreview () {
    Search()
}