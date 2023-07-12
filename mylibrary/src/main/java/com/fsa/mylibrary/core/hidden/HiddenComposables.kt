package com.fsa.mylibrary.core.hidden

import androidx.compose.foundation.background
import androidx.compose.foundation.clickable
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.wrapContentSize
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import androidx.compose.ui.unit.dp


@Composable
fun Kit_Button(
    modifier: Modifier = Modifier,
    btnText: String = "",
    backgroundColor: Color = Color.White,
    onClick: () -> Unit = {}
) {
    Box(
        modifier = modifier
            .clickable { onClick() }
            .wrapContentSize()
            .background(backgroundColor),
        contentAlignment = Alignment.Center
    ) {
        Text(btnText, modifier = Modifier.padding(12.dp))
    }
}

@Composable
fun SecretContent(
    modifier: Modifier = Modifier
) {
    Text("Secret", modifier = modifier.padding(12.dp))
}
