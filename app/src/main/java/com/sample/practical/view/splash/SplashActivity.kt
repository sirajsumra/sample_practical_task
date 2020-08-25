package com.sample.practical.view.splash

import androidx.lifecycle.observe
import com.sample.practical.R
import com.sample.practical.base.BaseActivity
import com.sample.practical.databinding.ActivitySplashBinding
import com.sample.practical.extension.navigateToAndFinish
import com.sample.practical.view.home.HomeActivity
import com.sample.practical.view.login.LoginActivity
import org.koin.androidx.viewmodel.ext.android.viewModel

class SplashActivity :
    BaseActivity<ActivitySplashBinding, SplashActivityState, SplashActivityViewModel>(R.layout.activity_splash) {

    override val viewModel: SplashActivityViewModel by viewModel()

    override fun observeViewStat(state: SplashActivityState) {
        state.delayState.observe(this) {
            when (it) {
                true -> {
                    navigateToAndFinish<HomeActivity>()
                }
                false -> {
                    navigateToAndFinish<LoginActivity>()
                }
            }
        }
    }

}