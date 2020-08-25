package com.sample.practical.view.login

import android.view.View
import com.sample.practical.R
import com.sample.practical.base.BaseState
import com.sample.practical.base.BaseViewModel
import com.sample.practical.extension.isEmailAddressValidPattern
import com.sample.practical.utils.VALID_EMAIL
import com.sample.practical.utils.VALID_PASSWORD

class LoginActivityViewModel(val state: LoginActivityState) : BaseViewModel() {
    override fun provideState(): BaseState = state

    fun isUserInputValid(): Boolean {
        return if (state.email.value.isNullOrEmpty()) {
            state.validationLiveData.postValue(LoginActivityState.ErrorMessage(emptyEmail = R.string.error_empty_email))
            false
        } else if (!state.email.value.toString().isEmailAddressValidPattern()) {
            state.validationLiveData.postValue(LoginActivityState.ErrorMessage(invalidEmail = R.string.error_valid_email))
            false
        } else if (state.password.value.isNullOrEmpty()) {
            state.validationLiveData.postValue(LoginActivityState.ErrorMessage(emptyPassword = R.string.error_empty_password))
            false
        } else if (!state.email.value.equals(VALID_EMAIL) || !state.password.value.equals(VALID_PASSWORD)) {
            state.validationLiveData.postValue(LoginActivityState.ErrorMessage(invalidUser = R.string.invalid_user))
            false
        } else {
            state.validationLiveData.postValue(LoginActivityState.ErrorMessage(isValid = R.string.is_valid))
            true
        }
    }

    fun onClick(v: View) {
        when (v.id) {
            R.id.btnLogin -> {
                state.clickEvent.postValue(ClickEvent.loginButton)
            }

        }
    }
}