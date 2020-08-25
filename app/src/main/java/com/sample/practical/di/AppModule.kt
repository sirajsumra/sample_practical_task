package com.sample.practical.di

import android.content.Context
import com.sample.practical.preferances.DefaultPreference
import com.sample.practical.preferances.NormalPreference
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module

val appModule = module {

    single {
        androidContext().getSharedPreferences(androidContext().packageName, Context.MODE_PRIVATE)
    }

    single {
        NormalPreference()
    }
    single {
        DefaultPreference()
    }
}