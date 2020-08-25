package com.sample.practical.base

import android.os.Bundle
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.annotation.LayoutRes
import androidx.databinding.DataBindingUtil
import androidx.databinding.ViewDataBinding
import androidx.fragment.app.Fragment
import com.sample.practical.BR

abstract class BaseFragment<BINDING : ViewDataBinding, STATE : BaseState, VIEWMODEL : BaseViewModel>(
    @LayoutRes val layoutId: Int
) : Fragment() {
    protected abstract val viewModel: VIEWMODEL
    protected lateinit var binding: BINDING
    protected val state: STATE by lazy {
        viewModel.provideState() as STATE
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        observeViewState(state)
    }

    override fun onCreateView(
        inflater: LayoutInflater,
        container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        return super.onCreateView(inflater, container, savedInstanceState)
    }

    private fun initializeDataBinding(
        inflater: LayoutInflater,
        container: ViewGroup?
    ): BINDING =
        DataBindingUtil.inflate<BINDING>(
            inflater,
            layoutId,
            container,
            false
        ).apply {
            binding = this
            lifecycleOwner = this@BaseFragment
            setVariable(BR.viewModel, viewModel)
            setVariable(BR.state, state)
            executePendingBindings()
        }

    abstract fun observeViewState(state: STATE)
}