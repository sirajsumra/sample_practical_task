package com.sample.practical.view.login

import androidx.lifecycle.observe
import com.sample.practical.R
import com.sample.practical.base.BaseActivity
import com.sample.practical.databinding.ActivityLoginBinding
import com.sample.practical.extension.hideKeyBoard
import com.sample.practical.extension.navigateTo
import com.sample.practical.extension.navigateToAndFinish
import com.sample.practical.view.home.HomeActivity
import kotlinx.android.synthetic.main.activity_login.*
import org.koin.androidx.viewmodel.ext.android.viewModel

class LoginActivity :
    BaseActivity<ActivityLoginBinding, LoginActivityState, LoginActivityViewModel>(R.layout.activity_login) {
    override val viewModel: LoginActivityViewModel by viewModel()

    override fun observeViewStat(state: LoginActivityState) {
        state.clickEvent.observe(this) {
            when (it) {
                is ClickEvent.loginButton -> {
                    viewModel.state.email.value = etEmail.text.toString()
                    viewModel.state.password.value = etPassword.text.toString()
                    viewModel.isUserInputValid()
                }
            }
        }

        state.validationLiveData.observe(this) { errorMessage ->
            errorMessage.run {
                when {
                    invalidEmail != 0 -> {
                        toast(getString(invalidEmail))
                        etEmail.requestFocus()
                    }
                    emptyEmail != 0 -> {
                        toast(getString(emptyEmail))
                        etEmail.requestFocus()
                    }
                    emptyPassword != 0 -> {
                        toast(getString(emptyPassword))
                        etPassword.requestFocus()
                    }
                    invalidUser != 0 -> {
                        toast(getString(invalidUser))
                    }
                    else -> {
                        hideKeyBoard()
                        defaultPref.data.isLoggedIn = true
                        defaultPref.store()
                        navigateToAndFinish<HomeActivity>()
                    }
                }
            }
        }
    }
}