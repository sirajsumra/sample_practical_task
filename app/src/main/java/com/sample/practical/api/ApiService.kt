package com.sample.practical.api


import com.sample.practical.model.AlbumData
import kotlinx.coroutines.Deferred
import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query

/**
* Provides remote APIs
*/
interface ApiService{
    @GET("photos/")
    suspend fun getPhotos(): ArrayList<AlbumData>

}
