package com.example.stev7x.intermediatepractice.main.data.dao;

import retrofit2.Retrofit;
import retrofit2.

/**
 * Created by Stev7x on 01/12/2017.
 */

public class ApiClient {

    public static ApiRequestInterface service() {
        Retrofit retrofit = new Retrofit.Builder()
                .addConverterFactory(GsonConverterFactory)
    }

}
