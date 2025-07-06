package com.example.loginstatehoisting

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.loginstatehoisting.screen.LoginScreen
import com.example.loginstatehoisting.ui.theme.LoginStateHoistingTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LoginStateHoistingTheme {
                LoginScreen()
            }
        }
    }
}
