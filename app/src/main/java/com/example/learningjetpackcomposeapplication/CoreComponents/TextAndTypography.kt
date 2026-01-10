package com.example.learningjetpackcomposeapplication.CoreComponents

import androidx.compose.foundation.basicMarquee
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Brush
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.Shadow
import androidx.compose.ui.text.SpanStyle
import androidx.compose.ui.text.TextStyle
import androidx.compose.ui.text.buildAnnotatedString
import androidx.compose.ui.text.font.FontStyle
import androidx.compose.ui.text.font.FontWeight
import androidx.compose.ui.text.withStyle
import androidx.compose.ui.tooling.preview.Preview
import androidx.compose.ui.unit.sp

@Composable
fun SimpleTextExample() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text("Coding with Hassan")
    }
}

@Composable
fun ModifiedTextExample() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            "Coding with Hassan",
            color = Color.Blue,
            fontSize = 30.sp,
            fontStyle = FontStyle.Italic,
            fontWeight = FontWeight.Bold,
            style = TextStyle(
                shadow = Shadow(color = Color.Red, blurRadius = 8f)
            )
        )
    }
}


@Composable
fun ModifiedColorfulTextExample() {

    val rainbowColors = listOf(
        Color.Red,
        Color.Green,
        Color.Magenta,
        Color.Blue,
    )
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(text = buildAnnotatedString {
            append("This is not color styled text \n")
            withStyle(
                SpanStyle(brush = Brush.linearGradient(colors = rainbowColors))
            ) {
                append("This is rainbow color text")
            }
        })
    }
}


@Composable
fun ScrollableTextExample() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(
            "I am Hassan experimenting with jetpack compose",
            modifier = Modifier.basicMarquee(),
            fontSize = 36.sp
        )
    }
}

@Preview(showSystemUi = true)
@Composable
fun TextAndTypographyPreview() {
    //SimpleTextExample()
    //ModifiedTextExample()
    //ModifiedColorfulTextExample()
    ScrollableTextExample()
}