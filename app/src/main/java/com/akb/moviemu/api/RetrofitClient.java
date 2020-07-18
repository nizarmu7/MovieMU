package com.akb.moviemu.api;

import com.akb.moviemu.common.Constants;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/*
 Untuk dapat beroperasi pada sampel retrofit tunggal di seluruh aplikasi
 maka dibuat objek retrofit.
 */
public class RetrofitClient {

    private static Retrofit retrofit;

    public static Retrofit getRetrofitInstance() {
        if (retrofit == null) {
            retrofit = new Retrofit.Builder()
                    .baseUrl(Constants.BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
        }

        return retrofit;
    }


}
