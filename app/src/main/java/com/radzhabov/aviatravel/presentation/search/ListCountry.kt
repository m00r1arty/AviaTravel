package com.radzhabov.aviatravel.presentation

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.lazy.LazyColumn
import androidx.compose.foundation.lazy.items
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.style.TextAlign
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import com.radzhabov.aviatravel.data.handlers.flightsList

//@Composable
//fun ListCountry(){
//    LazyColumn {
//        items(countriesList) { country ->
//            for (city in citiesList) {
//                if (city.country_code == country.code) {
//                    Text(
//                        text = "${country.name}, ${city.name}",
//                        color = Color.White,
//                        fontSize = 20.sp,
//                        fontWeight = FontWeight.Bold,
//                        textAlign = TextAlign.Center,
//                        modifier = Modifier
//                            .fillMaxWidth()
//                            .padding(vertical = 24.dp)
//                    )
//                }
//            }
//        }
//    }
//}

@Composable
fun ListCountry(){
    LazyColumn {
        items(flightsList) { flight ->
            Text(
                text = "${flight.city}, ${flight.country}",
                color = Color.Black,
                fontSize = 20.sp,
                fontWeight = FontWeight.Bold,
                textAlign = TextAlign.Center,
                modifier = Modifier
                    .fillMaxWidth()
                    .padding(vertical = 24.dp)
            )

        }
    }
}