package com.medical.medical.view.activity.base_activity.ui.gallery

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class SettingViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Menu Pengaturan"
    }
    val text: LiveData<String> = _text
}