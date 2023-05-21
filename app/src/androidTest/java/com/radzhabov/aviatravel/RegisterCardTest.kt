package com.radzhabov.aviatravel

import androidx.compose.ui.test.junit4.createComposeRule
import androidx.compose.ui.test.onNodeWithText
import androidx.compose.ui.test.performClick
import androidx.compose.ui.test.performTextInput
import androidx.navigation.NavController
import com.radzhabov.aviatravel.presentation.register.RegisterCard
import io.mockk.mockk
import org.junit.Rule
import org.junit.Test

class RegisterCardTest {
    @get:Rule
    val composeTestRule = createComposeRule()

    @Test
    fun testRegisterCard() {
        val navController = mockk<NavController>(relaxed = true)

        composeTestRule.setContent {
            RegisterCard(MockUserDao(), navController = navController)
        }

        // Fill in the input fields
        composeTestRule.onNodeWithText("Username").performTextInput("testUserName")
        composeTestRule.onNodeWithText("Email").performTextInput("testEmail@mail.ru")
        composeTestRule.onNodeWithText("Password").performTextInput("testPassword")

        // Click the register button
        composeTestRule.onNodeWithText("Sign up").performClick()

    }
}
