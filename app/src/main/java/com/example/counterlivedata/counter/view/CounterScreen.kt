package com.example.counterlivedata.counter.view

import android.annotation.SuppressLint
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.padding
import androidx.compose.material3.Scaffold
import androidx.compose.runtime.Composable
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import com.example.counterlivedata.counter.viewmodel.CounterViewModel

@SuppressLint("UnusedMaterial3ScaffoldPaddingParameter")
@Composable
fun CounterScreen(){
    val context = LocalContext.current
    val counterViewModel = CounterViewModel(LocalContext.current)

    Scaffold {  paddingValues ->
        Column(
            horizontalAlignment = Alignment.CenterHorizontally,
            modifier = Modifier.padding(paddingValues)
            .fillMaxWidth()
        ) {

            CounterValue(counterViewModel)
            CounterButtons(counterViewModel)
        }
    }
}