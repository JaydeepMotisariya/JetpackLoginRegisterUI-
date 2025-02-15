package com.riseup.loginregisterjetpack.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.riseup.loginregisterjetpack.components.HeadingTextComponent
import com.riseup.loginregisterjetpack.navigation.PostOfficeAppRouter
import com.riseup.loginregisterjetpack.navigation.Screen
import com.riseup.loginregisterjetpack.navigation.SystemBackButtonHandler

@Composable
fun TermsAndConditionsScreen() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(color = Color.White)
            .padding(16.dp)
    ) {
        HeadingTextComponent(value = "Terms and Conditions")
    }
    SystemBackButtonHandler {
        PostOfficeAppRouter.navigateTo(Screen.SignupScreen)
    }
}

@Preview
@Composable
fun PreviewTermsAndConditionsScreen() {
    TermsAndConditionsScreen()
}