package com.example.learningjetpackcomposeapplication

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import com.example.learningjetpackcomposeapplication.FundamentalConcepts.Greeting
import com.example.learningjetpackcomposeapplication.ui.theme.LearningJetpackComposeApplicationTheme

class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()
        setContent {
            LearningJetpackComposeApplicationTheme {
                Greeting("Hassan")
            }
        }
    }
}

