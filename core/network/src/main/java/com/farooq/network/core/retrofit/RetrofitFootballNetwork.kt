package com.farooq.network.core.retrofit

import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import okhttp3.OkHttpClient
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory
import javax.inject.Singleton

private const val FOOTBALL_API_BASE_URL = "https://api.sportmonks.com/v3/football/"

/**
 * Created by Syed Farooq Hassan on 12/20/2023.
 *
 * [Retrofit] backed [FootballDataSource]
 */
@Module
@InstallIn(SingletonComponent::class)
object RetrofitFootballNetwork {

    @Singleton
    @Provides
    fun provideHttpClient(
    ): OkHttpClient {
        val okHttpClientBuilder = OkHttpClient.Builder()
        okHttpClientBuilder.interceptors().add(
            ApiKeyInterceptor(),
        )
        okHttpClientBuilder.build()
        return okHttpClientBuilder.build()
    }

    @Singleton
    private val networkApi: Retrofit = Retrofit.Builder()
        .baseUrl(FOOTBALL_API_BASE_URL)
        .addConverterFactory(GsonConverterFactory.create())
        .client(provideHttpClient())
        .build()

    @Provides
    @Singleton
    internal fun provideFixturesApi(retrofit: Retrofit): FixturesService {
        return retrofit
            .create(FixturesService::class.java)
    }
}
