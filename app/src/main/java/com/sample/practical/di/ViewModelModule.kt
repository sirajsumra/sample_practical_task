package com.sample.practical.di

import com.sample.practical.view.home.HomeActivityViewModel
import com.sample.practical.view.login.LoginActivityViewModel
import com.sample.practical.view.splash.SplashActivityViewModel
import org.koin.dsl.module

val viewModleModule = module {
    factory {
        SplashActivityViewModel(get(),get())
    }

    factory {
        LoginActivityViewModel(get())
    }

    factory {
        HomeActivityViewModel(get())
    }
}