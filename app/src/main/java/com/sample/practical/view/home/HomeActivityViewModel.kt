package com.sample.practical.view.home

import androidx.lifecycle.viewModelScope
import com.sample.practical.base.BaseState
import com.sample.practical.base.BaseViewModel
import kotlinx.coroutines.launch

class HomeActivityViewModel(private val state: HomeActivityState) : BaseViewModel() {


    override fun provideState(): BaseState = state

    init {
        getAlumbs()
    }

    fun getAlumbs() {
        viewModelScope.launch {
            state.albumAPIState.postValue(HomeActivityState.AlbumResponse.Loading)
            viewModelScope.launch {
                runCatching {
                    apiService.getPhotos()
                }.onSuccess {
                    state.albumAPIState.postValue(
                        HomeActivityState.AlbumResponse.Success(
                            it
                        )
                    )
                }.onFailure {
                    state.albumAPIState.postValue(
                        HomeActivityState.AlbumResponse.Failure(
                            it
                        )
                    )
                }
            }
        }
    }
}