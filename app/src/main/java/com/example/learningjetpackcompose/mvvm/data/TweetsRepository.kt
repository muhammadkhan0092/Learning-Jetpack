package com.example.learningjetpackcompose.mvvm.data

import android.util.Log
import com.example.learningjetpackcompose.mvvm.domain.models.TweetListItem
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.withContext
import javax.inject.Inject

class TweetsRepository @Inject constructor(private val tweetsApi: TweetsApi){
    suspend fun getCategories(): List<String>?{
        return withContext(Dispatchers.IO){
            try {
                val response = tweetsApi.getTweetsCategories()
                if(response.isSuccessful && response.body()!=null){
                    response.body()!!
                }
                else
                {
                    Log.d("khan","Error is ${response.errorBody()}")
                    null
                }
            }
            catch (e : Exception){
                Log.d("khan","Error is ${e.message}")
                null
            }
        }
    }
    suspend fun getDataOfSpecificCategory(category : String) : List<TweetListItem>?{
        return withContext(Dispatchers.IO){
            try {
                val response = tweetsApi.getTweetsFromSpecificCategory("$[?(@.category==\"$category\")]")
                if(response.isSuccessful && response.body()!=null){
                    Log.d("khan","data new is  ${response.body()}")
                    response.body()!!
                } else {
                    Log.d("khan","Error is ${response.errorBody()}")
                    null
                }
            } catch (e : Exception){
                Log.d("khan","Error is ${e.message}")
                null
            }
        }
    }
}