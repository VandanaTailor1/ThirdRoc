package com.example.thirdroc.model;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitClient {
    public static Retrofit retrofit;
    public static Retrofit getInstance(){
   return retrofit = new Retrofit.Builder()
           .baseUrl("https://devapi.thirdroc.ai/")
           .addConverterFactory(GsonConverterFactory.create())
           .build();
    }

}
