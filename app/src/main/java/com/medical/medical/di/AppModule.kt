package com.medical.medical.di


import com.medical.medical.repository.TestRepository
import com.medical.medical.repository.TestRepositoryImpl
import com.medical.medical.view.view_model.TestViewModel
import org.koin.androidx.viewmodel.dsl.viewModel
import org.koin.dsl.module

val appModule = module {
    viewModel { TestViewModel(get(), get()) }


    single<TestRepository>(createdAtStart = true) { TestRepositoryImpl(get()) }


}
