package com.sample.practical.view.splash

import androidx.lifecycle.MutableLiveData
import com.sample.practical.base.BaseState

class SplashActivityState : BaseState {
    val delayState = MutableLiveData<Boolean>()
}