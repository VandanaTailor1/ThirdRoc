package com.example.thirdroc.model;

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface SingInterface {
    @FormUrlEncoded
    @POST("api/employee/v1/login")
   Call<SingPojo> getData(
                          @Field("mobile_number") String mobile_number
    );

}
