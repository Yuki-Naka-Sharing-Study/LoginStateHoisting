package com.example.loginstatehoisting.screen

import androidx.compose.runtime.*

@Composable
fun LoginScreen() {
    var email by remember { mutableStateOf("") }
    var password by remember { mutableStateOf("") }
    var passwordVisible by remember { mutableStateOf(false) }

    val isValid = email.contains("@") && password.length >= 6

    LoginForm(
        email = email,
        onEmailChange = { email = it },
        password = password,
        onPasswordChange = { password = it },
        passwordVisible = passwordVisible,
        onPasswordVisibilityChange = { passwordVisible = it },
        onLoginClick = { /* ログイン処理をここに書く */ },
        loginEnabled = isValid
    )
}
