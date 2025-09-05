package com.example.learningjetpackcompose.mvvm.presentation.view_models

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.learningjetpackcompose.mvvm.data.TweetsRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject
@HiltViewModel
class CategoryViewModel @Inject constructor(private val repository: TweetsRepository) : ViewModel() {
    private val _categories = MutableStateFlow<List<String>?>(emptyList())
    val categories : StateFlow<List<String>?> = _categories.asStateFlow()

    init {
        getCategories()
    }
    private fun getCategories(){
        viewModelScope.launch {
            val data = repository.getCategories()
            _categories.emit(data)
        }
    }
}