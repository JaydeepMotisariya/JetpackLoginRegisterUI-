package com.riseup.loginregisterjetpack.app

import androidx.compose.animation.Crossfade
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.riseup.loginregisterjetpack.navigation.PostOfficeAppRouter
import com.riseup.loginregisterjetpack.navigation.Screen
import com.riseup.loginregisterjetpack.screens.SignUpScreen
import com.riseup.loginregisterjetpack.screens.TermsAndConditionsScreen

@Composable
fun PostOfficeApp() {
    Surface(
        modifier = Modifier.fillMaxSize(),
        color = Color.White
    ) {
        Crossfade(targetState = PostOfficeAppRouter.currentScreen) { currentState ->
            when (currentState.value) {
                is Screen.SignupScreen -> {
                    SignUpScreen()
                }
                is Screen.TermsAndConditionsScreen -> {
                  TermsAndConditionsScreen()
            }

        }

    }
}
}