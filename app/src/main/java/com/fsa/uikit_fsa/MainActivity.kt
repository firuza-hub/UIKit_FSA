package com.fsa.uikit_fsa

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.graphics.Color
import com.fsa.mylibrary.composables.Kit_Button
import com.fsa.uikit_fsa.ui.theme.UIKit_FSATheme


class MainActivity : ComponentActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContent {
            UIKit_FSATheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    Box(Modifier.fillMaxSize()) {

                        Kit_Button(
                            modifier = Modifier.align(Alignment.Center),
                            "Meow",
                            backgroundColor = Color.Red.copy(0.5f)
                        )
                    }
                }
            }
        }
    }
}

