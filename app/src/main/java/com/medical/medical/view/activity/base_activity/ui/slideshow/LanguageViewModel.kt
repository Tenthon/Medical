package com.medical.medical.view.activity.base_activity.ui.slideshow

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

class LanguageViewModel : ViewModel() {

    private val _text = MutableLiveData<String>().apply {
        value = "Menu Bahasa"
    }
    val text: LiveData<String> = _text
}