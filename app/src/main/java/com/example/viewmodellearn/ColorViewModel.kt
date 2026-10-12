package com.example.viewmodellearn

import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.setValue
import androidx.compose.ui.graphics.Color
import androidx.lifecycle.ViewModel

class ColorViewModel: ViewModel() {
    var backgroundColor by mutableStateOf(Color.White)
        private set
    fun changeColor() {
        backgroundColor = Color.Red
    }
}