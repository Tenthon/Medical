package com.medical.medical.data.remote

import com.medical.medical.model.Resppnse
import io.reactivex.Flowable
import retrofit2.Response
import retrofit2.http.GET

interface ApiClient {
    @GET("movie")
    fun listPengguna(): Flowable<Response<Resppnse>>
}