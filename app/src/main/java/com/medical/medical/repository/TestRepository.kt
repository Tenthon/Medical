package com.medical.medical.repository

import com.medical.medical.data.remote.ApiClient
import com.medical.medical.model.Resppnse
import io.reactivex.android.schedulers.AndroidSchedulers
import io.reactivex.disposables.Disposable
import io.reactivex.schedulers.Schedulers

interface TestRepository {
    fun getData(
        onResult: (isSuccess: Boolean?, messages: String?, datas: Resppnse?) -> Unit
    ): Disposable
}

class TestRepositoryImpl(private val apiClient: ApiClient) : TestRepository {
    override fun getData(
        onResult: (isSuccess: Boolean?, messages: String?, datas: Resppnse?) -> Unit
    ): Disposable =
        apiClient.listPengguna().subscribeOn(Schedulers.io()).observeOn(AndroidSchedulers.mainThread())
            .subscribe({
                println("hasil" + it.body())
                if (it.isSuccessful) {
                    val resp = it.body()
                    if (resp != null) {
                        onResult(true, "${it.message()}", resp)
                    } else onResult(false, "${it.message()}", null)
                } else onResult(false, it.message(), null)
            }, {
                onResult(false, "${it.message}", null)
            })
}