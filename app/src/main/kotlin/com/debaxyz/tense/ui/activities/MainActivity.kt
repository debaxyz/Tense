package com.debaxyz.tense.ui.activities

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Surface
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview
import androidx.navigation.compose.rememberNavController
import com.debaxyz.tense.ui.theme.ComposeEmptyActivityTheme
import androidx.activity.enableEdgeToEdge
import com.debaxyz.tense.ui.components.topAppBar.MainScreen
import com.debaxyz.tense.ui.components.navigationBar.*
import androidx.compose.ui.unit.*
import androidx.compose.foundation.layout.*
class MainActivity : ComponentActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            ComposeEmptyActivityTheme {
                val navController = rememberNavController()
                Surface(modifier = Modifier.fillMaxSize())
                 {
                    MainScreen()
                }
            }
        }
    }
}

