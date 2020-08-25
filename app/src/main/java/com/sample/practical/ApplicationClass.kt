package com.sample.practical

import android.app.Application
import com.sample.practical.di.appModule
import com.sample.practical.di.netWorkModule
import com.sample.practical.di.stateModule
import com.sample.practical.di.viewModleModule
import org.koin.android.ext.android.getKoin
import org.koin.android.ext.koin.androidContext
import org.koin.core.context.startKoin
import org.koin.core.qualifier.named
import org.koin.core.scope.ScopeID

class ApplicationClass : Application() {
    override fun onCreate() {
        super.onCreate()
        initKoin()
    }

    private fun initKoin() {
        startKoin {
            androidContext(applicationContext)
            modules(listOf(appModule,netWorkModule, stateModule, viewModleModule))
        }
//        getKoin().createScope(ScopeID(), named("APP"))
    }

}