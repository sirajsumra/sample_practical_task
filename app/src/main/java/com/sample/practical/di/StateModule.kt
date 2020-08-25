package com.sample.practical.di

import com.sample.practical.view.home.HomeActivityState
import com.sample.practical.view.login.LoginActivityState
import com.sample.practical.view.splash.SplashActivityState
import com.sample.practical.view.splash.SplashActivityViewModel
import org.koin.dsl.module

val stateModule = module {
    factory {
        SplashActivityState()
    }

    factory {
        LoginActivityState()
    }

    factory {
        HomeActivityState()
    }
}