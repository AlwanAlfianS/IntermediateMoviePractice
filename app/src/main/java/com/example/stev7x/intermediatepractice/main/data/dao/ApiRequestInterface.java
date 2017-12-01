package com.example.stev7x.intermediatepractice.main.data.dao;

import com.example.stev7x.intermediatepractice.main.main.MovieResponseDao;

import retrofit2.Call;
import retrofit2.http.GET;

/**
 * Created by Stev7x on 01/12/2017.
 */

public interface ApiRequestInterface {
    @GET("movie/popular")
    Call<MovieResponseDao> getMovieList()
}
