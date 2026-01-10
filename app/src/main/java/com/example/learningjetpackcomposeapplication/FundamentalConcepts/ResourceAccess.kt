package com.example.learningjetpackcomposeapplication.FundamentalConcepts

import androidx.compose.foundation.Image
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.res.colorResource
import androidx.compose.ui.res.painterResource
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.tooling.preview.Preview
import com.example.learningjetpackcomposeapplication.R


//Access String from the string resources
@Composable
fun AccessStringResourceExample() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text(stringResource(R.string.fruit))
    }
}

//Access Color from the color resources
@Composable
fun AccessColorResourceExample() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Text("Orange Color", color = colorResource(R.color.orange))
    }
}

//Access Image from the drawable resources
@Composable
fun AccessImageResourceExample() {
    Box(
        modifier = Modifier.fillMaxSize(),
        contentAlignment = Alignment.Center
    ) {
        Image(
            painter = painterResource(R.drawable.orange),
            contentDescription = "orange image"
        )
    }
}


@Preview(showSystemUi = true)
@Composable
fun FundamentalConceptsPreview() {
    //AccessStringResourceExample()
    //AccessColorResourceExample()
    AccessImageResourceExample()
}