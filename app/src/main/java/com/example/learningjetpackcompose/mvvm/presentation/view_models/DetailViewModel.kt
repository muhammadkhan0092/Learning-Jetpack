package com.example.learningjetpackcompose.mvvm.presentation.view_models

import android.provider.MediaStore.Video.VideoColumns.CATEGORY
import android.util.Log
import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.learningjetpackcompose.mvvm.data.TweetsRepository
import com.example.learningjetpackcompose.mvvm.domain.models.TweetListItem
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import java.util.logging.Logger
import javax.inject.Inject
@HiltViewModel
class DetailViewModel @Inject constructor(
    private val repository: TweetsRepository,
    savedStateHandle: SavedStateHandle
) : ViewModel() {
    private val _apps = MutableStateFlow<List<TweetListItem>?>(emptyList())
    val apps : StateFlow<List<TweetListItem>?> = _apps.asStateFlow()

    init {
        val typ = savedStateHandle.get<String>(CATEGORY)?:"Android"
        Log.d("khan","type is $typ")
        getAppsOfSpecificCategory(typ)
    }
    fun getAppsOfSpecificCategory(category : String){
        viewModelScope.launch {
            val data = repository.getDataOfSpecificCategory(category)
            _apps.emit(data)
        }
    }
}