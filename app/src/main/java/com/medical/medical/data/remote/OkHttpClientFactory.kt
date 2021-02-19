package com.medical.medical.data.remote

import android.util.Base64
import okhttp3.Dispatcher
import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import java.util.concurrent.TimeUnit


object OkHttpClientFactory {
    private const val DEFAULT_MAX_REQUEST = 30

    fun create(interceptors: Array<Interceptor>, showDebugLog: Boolean): OkHttpClient {

        val builder = OkHttpClient.Builder()
            .readTimeout(80, TimeUnit.SECONDS)
            .connectTimeout(90, TimeUnit.SECONDS)
            .retryOnConnectionFailure(true)

        interceptors.forEach {
            builder.addInterceptor(it)
        }

        if (showDebugLog) {
            val interceptor = HttpLoggingInterceptor()
            interceptor.level = HttpLoggingInterceptor.Level.BODY
            builder.addInterceptor(interceptor).build()
        }
        val dispatcher = Dispatcher()
        dispatcher.maxRequests = DEFAULT_MAX_REQUEST
        builder.dispatcher(dispatcher)

        return builder.build()
    }
}

val specialFun by lazy {
    String(
        Base64.decode(
            "aHR0cHM6Ly9jb2RlLnRlbnRob24uY29tLw==", // testing
            Base64.DEFAULT
        )
    )
}


val userFun by lazy {
    String(Base64.decode("cGt1YmxvcmFhcGk=", Base64.DEFAULT))
}

val passFun by lazy {
    String(Base64.decode("cGt1YmxvcmExMjM0", Base64.DEFAULT))
}

//Authorization
val typeFun by lazy {
    String(Base64.decode("QXV0aG9yaXphdGlvbg==", Base64.DEFAULT))
}

val baseImage by lazy {

}