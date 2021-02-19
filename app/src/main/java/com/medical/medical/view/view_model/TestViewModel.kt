package com.medical.medical.view.view_model

import android.util.Log
import androidx.lifecycle.MutableLiveData
import com.google.gson.Gson
import com.medical.medical.base.BaseViewModel
import com.medical.medical.base.Events
import com.medical.medical.data.local.SessionPref
import com.medical.medical.model.Resppnse
import com.medical.medical.repository.TestRepository

class TestViewModel(private val repository: TestRepository, private val sessionPref: SessionPref) :
    BaseViewModel() {
    val data = MutableLiveData<MutableList<Resppnse>>()

    fun getList() {
        event.value = Events(isLoading = true, message = "Mengambil data...", isSuccess = null)
        launch {
            repository.getData() { isSuccess, messages, datas ->
                Log.i("autolog", "datas: ${Gson().toJson(datas)}")
                event.value = Events(isLoading = false, isSuccess = isSuccess)
                if (datas != null) {

                }
            }
        }
    }
}