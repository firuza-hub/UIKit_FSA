package com.fsa.mylibrary.additional

import androidx.compose.foundation.background
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.width
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp
import com.fsa.mylibrary.core.hidden.SecretContent


@Composable
fun SecretRedBox() {
    Box(
        modifier = Modifier
            .background(Color.Red)
            .width(100.dp)
            .height(50.dp)
    ) {
        SecretContent(modifier = Modifier.align(Alignment.Center))
    }
}

@Composable
fun RedBox() {
    Box(
        modifier = Modifier
            .background(Color.Red)
            .width(100.dp)
            .height(50.dp)
    ) {
    }
}