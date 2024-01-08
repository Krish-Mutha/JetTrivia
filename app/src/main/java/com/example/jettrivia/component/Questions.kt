package com.example.jettrivia.component

import android.util.Log
import androidx.compose.material3.CircularProgressIndicator
import androidx.compose.runtime.Composable
import com.example.jettrivia.screens.QuestionViewModel

@Composable
fun Questions(viewModel: QuestionViewModel){
    val questions = viewModel.data.value.data?.toMutableList()
    if(viewModel.data.value.loading ==true){
        CircularProgressIndicator()
        Log.d("Loading","Questions: ...Loading...")
    }
    else{
        Log.d("Loading","Questions: ...Loading Stopped...")
        questions?.forEach{questionItem ->
            Log.d("Result","Questions: ${questionItem.question}")
        }
    }
}