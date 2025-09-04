package com.example.learningjetpackcompose.mvvm.di

import com.example.learningjetpackcompose.mvvm.data.TweetsApi
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
object NetworkModule {

    @Provides
    @Singleton
    fun returnRetrofitInstance() : Retrofit{
        return Retrofit.Builder().baseUrl("https://api.jsonbin.io").addConverterFactory(
            GsonConverterFactory.create()).build()
    }

    @Provides
    @Singleton
    fun returnTweetsApi(retrofit: Retrofit) : TweetsApi{
        return retrofit.create(TweetsApi::class.java)
    }
}