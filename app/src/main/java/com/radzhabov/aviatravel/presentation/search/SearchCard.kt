package com.radzhabov.aviatravel.presentation.search

import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.size
import androidx.compose.foundation.shape.CircleShape
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material.Button
import androidx.compose.material.ButtonDefaults
import androidx.compose.material.Card
import androidx.compose.material.Icon
import androidx.compose.material.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.draw.clip
import androidx.compose.ui.draw.shadow
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.navigation.NavController
import com.radzhabov.aviatravel.R
import com.radzhabov.aviatravel.data.handlers.FlightHandler
import com.radzhabov.aviatravel.presentation.theme.CalmBlue
import com.radzhabov.aviatravel.presentation.theme.DarkBlue
import com.radzhabov.aviatravel.presentation.theme.MiddleBlue


@Composable
fun SearchCard(navController: NavController) {
    val flightHandler = FlightHandler()
    var from by remember { mutableStateOf("") }
    var to by remember { mutableStateOf("") }
    var isFromDropdownOpen by remember { mutableStateOf(false) }
    var isToDropdownOpen by remember { mutableStateOf(false) }

    // Assume you have a flightList with flight data

    Card(
        backgroundColor = CalmBlue,
        modifier = Modifier.fillMaxSize(),
        shape = RoundedCornerShape(size = 20.dp),
    ) {
        Card(
            backgroundColor = Color.White,
            modifier = Modifier
                .padding(15.dp)
                .shadow(
                    elevation = 8.dp,
                    ambientColor = CalmBlue,
                    spotColor = DarkBlue
                ),
            shape = RoundedCornerShape(size = 15.dp),
        ) {
            Column(
                horizontalAlignment = Alignment.CenterHorizontally,
                verticalArrangement = Arrangement.Top,
                modifier = Modifier.padding(start = 16.dp, end = 16.dp)
            ) {
                Text(
                    text = "Discover the World",
                    fontSize = 24.sp,
                    color = DarkBlue,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(top = 30.dp)
                )

                Text(
                    text = "Find what you need!",
                    fontSize = 14.sp,
                    color = MiddleBlue,
                    fontWeight = FontWeight.SemiBold,
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 30.dp)
                )

                SearchDropDown(
                    value = from,
                    onValueChange = { from = it },
                    label = "From",
                    placeholder = "Enter your city",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 13.dp),
                    dropDownItems = flightHandler.FlightsList(),
                    isDropdownOpen = isFromDropdownOpen,
                    onDropdownOpenChange = { isOpen -> isFromDropdownOpen = isOpen }
                )

                Button(
                    onClick = { /* Handle From button click */ },
                    modifier = Modifier
                        .size(56.dp)
                        .clip(RoundedCornerShape(10.dp))
                        .padding(bottom = 10.dp),
                    shape = CircleShape,
                    colors = ButtonDefaults.buttonColors(backgroundColor = DarkBlue)
                ) {
                    Icon(
                        painter = painterResource(R.drawable.ic_swap),
                        contentDescription = "My Icon",
                        tint = Color.White
                    )
                }

                SearchDropDown(
                    value = to,
                    onValueChange = { to = it },
                    label = "To",
                    placeholder = "Enter your city",
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(bottom = 13.dp),
                    dropDownItems = flightHandler.FlightsList(),
                    isDropdownOpen = isToDropdownOpen,
                    onDropdownOpenChange = { isOpen -> isToDropdownOpen = isOpen }
                )

                Spacer(modifier = Modifier.padding(20.dp))

                Button(
                    onClick = { /* Handle Search Flights button click */ },
                    shape = RoundedCornerShape(16.dp),
                    colors = ButtonDefaults.buttonColors(
                        backgroundColor = DarkBlue,
                        contentColor = Color.White
                    ),
                    modifier = Modifier
                        .fillMaxWidth()
                        .padding(start = 16.dp, end = 16.dp)
                ) {
                    Text(
                        text = "Search Flights",
                        modifier = Modifier
                            .padding(top = 5.dp, bottom = 5.dp),
                        fontSize = 18.sp
                    )
                }
            }
        }
    }
}