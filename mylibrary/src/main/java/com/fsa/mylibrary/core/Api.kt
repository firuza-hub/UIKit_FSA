package com.fsa.mylibrary.core

import android.content.Context
import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.fsa.mylibrary.core.hidden.Kit_Button
import com.fsa.mylibrary.core.hidden.calculateSomeMeaninglessStuff


@Composable
fun Kit_Button_Functional(
    ctx: Context,
    modifier: Modifier = Modifier,
    btnText: String = "",
    backgroundColor: Color = Color.White
) {
    Kit_Button(modifier, btnText, backgroundColor, onClick = {
        Toast.makeText(
            ctx,
            "MEOW!",
            Toast.LENGTH_SHORT
        ).show()
    })
}

fun generateString(a: Int, b: Int): String {
    return calculateSomeMeaninglessStuff(a, b)
}

