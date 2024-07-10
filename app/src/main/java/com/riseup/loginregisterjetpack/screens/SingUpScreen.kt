package com.riseup.loginregisterjetpack.screens

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.dp
import com.riseup.loginregisterjetpack.R
import com.riseup.loginregisterjetpack.components.ButtonComponent
import com.riseup.loginregisterjetpack.navigation.PostOfficeAppRouter
import com.riseup.loginregisterjetpack.navigation.Screen
import com.riseup.loginregisterjetpack.components.CheckBoxComponent
import com.riseup.loginregisterjetpack.components.ClickableLoginTextComponent
import com.riseup.loginregisterjetpack.components.DividerTextComponent
import com.riseup.loginregisterjetpack.components.HeadingTextComponent
import com.riseup.loginregisterjetpack.components.MyTextField
import com.riseup.loginregisterjetpack.components.NormalTextComponent
import com.riseup.loginregisterjetpack.components.PasswordTextField

@Composable
fun SignUpScreen() {
    Surface(
        modifier = Modifier
            .fillMaxSize()
            .background(Color.White)
            .padding(16.dp)
    ) {
        Column(modifier = Modifier.fillMaxSize()) {
            NormalTextComponent(value = stringResource(R.string.hello))

            HeadingTextComponent(value = stringResource(R.string.create_an_account))

            Spacer(modifier = Modifier.height(20.dp))

            MyTextField(
                labelValue = stringResource(id = R.string.firstName),
                painterResource(id = R.drawable.ic_profile)
            )

            MyTextField(
                labelValue = stringResource(id = R.string.lastName),
                painterResource = painterResource(id = R.drawable.ic_profile)
            )

            MyTextField(
                labelValue = stringResource(id = R.string.email),
                painterResource = painterResource(id = R.drawable.ic_email)
            )

            PasswordTextField(
                labelValue = stringResource(id = R.string.password),
                painterResource = painterResource(id = R.drawable.ic_lock)
            )
            CheckBoxComponent(
                value = stringResource(id = R.string.termsAndCondition),
                onTextSelected = {
                    PostOfficeAppRouter.navigateTo(Screen.TermsAndConditionsScreen)
                })
            Spacer(modifier = Modifier.height(60.dp))
            ButtonComponent(value = "Register")
            DividerTextComponent()
            ClickableLoginTextComponent(onTextSelected = {

            })
        }

    }
}

@Preview
@Composable
fun DefaultSignUpScreenPreview() {
    SignUpScreen()
}