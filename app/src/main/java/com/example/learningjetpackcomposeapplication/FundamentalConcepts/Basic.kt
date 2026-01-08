package com.example.learningjetpackcomposeapplication.FundamentalConcepts

import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.tooling.preview.Preview


//Basic Composable Function Example

@Composable
fun Greeting(name: String){
    Text("Welcome $name")
}

@Preview(showSystemUi = true)
@Composable
fun GreetingPreview(){
    Greeting("Hassan")
}