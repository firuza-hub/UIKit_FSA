package com.fsa.mylibrary.composables

import android.content.Context
import android.widget.Toast
import androidx.compose.runtime.Composable
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.fsa.mylibrary.composables.hidden.Kit_Button


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

