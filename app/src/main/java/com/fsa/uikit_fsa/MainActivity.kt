package com.fsa.uikit_fsa

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.compose.foundation.layout.Box
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.fsa.mylibrary.additional.RedBox
import com.fsa.mylibrary.core.generateString
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

                    val context = LocalContext.current
                    val secretString = generateString(26, 3)
                    println(secretString)
                    Box(Modifier.fillMaxSize()) {
//
//                        Kit_Button_Functional2(
//                            context,
//                            modifier = Modifier.align(Alignment.Center),
//                            secretString,
//                            backgroundColor = Color.Red.copy(0.5f)
//                        )

                        RedBox()
                    }
                }
            }
        }
    }
}

