package com.example.learningjetpackcomposeapplication.CoreComponents

import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.remember
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.tooling.preview.Preview

@Composable
fun SimpleOutlinedTextExample() {

    var text by remember {
        mutableStateOf("")
    }


    Box (
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ){
        OutlinedTextField(
            value = text,
            onValueChange = {
                text = it
            },
            label = {
                Text("Labbel")
            }
        )
    }



}

@Preview(showSystemUi = true)
@Composable
fun OutlineTextFieldPreview() {
    SimpleOutlinedTextExample()
}