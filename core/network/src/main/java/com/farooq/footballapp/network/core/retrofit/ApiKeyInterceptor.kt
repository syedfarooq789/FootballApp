package com.farooq.footballapp.network.core.retrofit

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
        val originalRequest = chain.request().url
        val url =
            originalRequest.newBuilder().addQueryParameter(
                "api_token", "" +
                        "W8SeQBrVQQpzlDY46bBPDlYvQpDmdJKisTHT9TbYkiPKmr3GYw1mxvNuY0pG"
            ).build()
        request.url(url)
        return chain.proceed(request.build());
    }
}