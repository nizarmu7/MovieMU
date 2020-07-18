package com.akb.moviemu.api;

import com.akb.moviemu.model.detail.MovieDetailCastRoot;
import com.akb.moviemu.model.detail.MovieDetailRoot;
import com.akb.moviemu.model.detail.MovieDetailVideoRoot;
import com.akb.moviemu.model.home.MovieMainRoot;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface RetrofitGetData {

    @GET("movie/popular")
    Call<MovieMainRoot> getPopularMovies(@Query("api_key") String api_key);

    @GET("movie/top_rated")
    Call<MovieMainRoot> getTopRatedMovies(@Query("api_key") String api_key);

    @GET("movie/upcoming")
    Call<MovieMainRoot> getUpcomingMovies(@Query("api_key") String api_key);

    @GET("movie/{movie_id}")
    Call<MovieDetailRoot> getMovieIdDetail(@Path("movie_id") int movie_id, @Query("api_key") String api_key);

    @GET("movie/{movie_id}/credits")
    Call<MovieDetailCastRoot> getMovieDetailCast(@Path("movie_id") int movie_id, @Query("api_key") String api_key);

    @GET("movie/{movie_id}/videos")
    Call<MovieDetailVideoRoot> getMovieVideo(@Path("movie_id") int movie_id, @Query("api_key") String api_key);




}
