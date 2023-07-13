package com.example.uasteguh.service

import android.telecom.Call
import com.example.uasteguh.model.MovieResponse

import retrofit2.http.GET

interface MovieApiInterface {
    @GET("/3/movie/popular?api_key=a613945a8cf848f751576e4f56763b4f")
    fun getMovieList(): retrofit2.Call<MovieResponse>
}