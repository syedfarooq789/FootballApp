package com.farooq.network.core.retrofit

import okhttp3.Interceptor
import okhttp3.Interceptor.Chain
import okhttp3.Response

/**
 * Created by Syed Farooq Hassan on 12/20/2023.
 *
 * Interceptor for retrofit.
 */
class ApiKeyInterceptor() : Interceptor {
    override fun intercept(chain: Chain): Response {
        val request = chain.request().newBuilder()
        val originalRequest = chain.request().url()
        val url =
            originalRequest.newBuilder().addQueryParameter("api_key", "your api key value").build()
        request.url(url)
        return chain.proceed(request.build());
    }
}