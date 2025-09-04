package com.example.learningjetpackcompose.mvvm.data

import com.example.learningjetpackcompose.mvvm.domain.models.TweetListItem
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Query


interface TweetsApi {

    @GET("/v3/b/68b9be5e43b1c97be936c24c?meta=false")
    suspend fun getTweetsFromSpecificCategory(@Header("X-JSON-Path") category: String, ) : Response<List<TweetListItem>>


    @GET("/v3/b/68b9c2cbd0ea881f4071b214?meta=false")
    suspend fun getTweetsCategories() : Response<List<String>>
}