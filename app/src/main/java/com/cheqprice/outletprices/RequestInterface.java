package com.cheqprice.outletprices;

/**
 * Created by tatllo on 06/06/2017.
 */

import retrofit2.Call;
import retrofit2.http.Field;
import retrofit2.http.GET;
import retrofit2.http.POST;

public interface RequestInterface {

    @GET("supermarket_api/v1/get-all-products")
    Call<JSONResponse> getJSON();

    @GET("supermarket_api/v1/get-all-supermarket-products")
    Call<JSONResponse> getProductsList();

    @GET("supermarket_api/v1/get-all-users")
    Call<JSONResponse> getUserssList();


}
