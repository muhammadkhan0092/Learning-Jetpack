package com.example.learningjetpackcompose.mvvm.presentation.view_models

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.learningjetpackcompose.mvvm.data.TweetsRepository
import com.example.learningjetpackcompose.mvvm.domain.models.TweetListItem
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import javax.inject.Inject
@HiltViewModel
class DetailViewModel @Inject constructor(private val repository: TweetsRepository) : ViewModel() {
    private val _apps = MutableStateFlow<List<TweetListItem>?>(emptyList())
    val apps : StateFlow<List<TweetListItem>?> = _apps.asStateFlow()

    init {
        getAppsOfSpecificCategory("Android")
    }
    private fun getAppsOfSpecificCategory(category : String){
        viewModelScope.launch {
            val data = repository.getDataOfSpecificCategory(category)
            _apps.emit(data)
        }
    }
}