package com.sample.practical.view.splash

import androidx.lifecycle.viewModelScope
import com.sample.practical.base.BaseState
import com.sample.practical.base.BaseViewModel
import com.sample.practical.preferances.DefaultPreference
import com.sample.practical.utils.DELAY_TIME
import kotlinx.coroutines.delay
import kotlinx.coroutines.launch

class SplashActivityViewModel(
    val state: SplashActivityState,
    private val defaultPreference: DefaultPreference
) : BaseViewModel() {
    override fun provideState(): BaseState = state

    init {
        viewModelScope.launch {
            delay(DELAY_TIME)
            state.delayState.value = defaultPreference.data.isLoggedIn
        }
    }
}