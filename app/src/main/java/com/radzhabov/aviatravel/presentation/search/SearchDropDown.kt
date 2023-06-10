package com.radzhabov.aviatravel.presentation.search

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.material.DropdownMenu
import androidx.compose.material.DropdownMenuItem
import androidx.compose.material.Icon
import androidx.compose.material.IconButton
import androidx.compose.material.OutlinedTextField
import androidx.compose.material.Text
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Clear
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.radzhabov.aviatravel.data.model.Flight

@Composable
fun SearchDropDown(
    value: String,
    onValueChange: (String) -> Unit,
    label: String,
    placeholder: String,
    modifier: Modifier = Modifier,
    dropDownItems: List<Flight>,
    isDropdownOpen: Boolean,
    onDropdownOpenChange: (Boolean) -> Unit
) {
    var searchText by remember { mutableStateOf(value) }
    val filteredItems = dropDownItems.filter { it.city.contains(searchText, ignoreCase = true) }

    Column(modifier = modifier) {
        OutlinedTextField(
            value = searchText,
            onValueChange = {
                searchText = it
                onValueChange(it)
            },
            label = { Text(text = label) },
            placeholder = { Text(text = placeholder) },
            modifier = Modifier.fillMaxWidth(),
            singleLine = true,
            trailingIcon = {
                if (searchText.isNotEmpty()) {
                    IconButton(onClick = {
                        searchText = ""
                        onValueChange("")
                    }) {
                        Icon(
                            imageVector = Icons.Default.Clear,
                            contentDescription = "Очистить",
                            tint = Color.Gray
                        )
                    }
                }
            }
        )

        if (isDropdownOpen && filteredItems.isNotEmpty()) {
            DropdownMenu(
                expanded = true,
                onDismissRequest = { onDropdownOpenChange(false) },
                modifier = Modifier.fillMaxWidth()
            ) {
                filteredItems.forEach { item ->
                    DropdownMenuItem(onClick = {
                        searchText = item.city
                        onValueChange(item.city)
                        onDropdownOpenChange(false)
                    }) {
                        Text(text = item.city)
                    }
                }
            }
        }
    }
}