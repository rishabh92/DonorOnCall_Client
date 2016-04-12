package com.donor.oncall.DonorApi;

import com.squareup.okhttp.OkHttpClient;

import retrofit.RestAdapter;
import retrofit.client.OkClient;

/**
 * Created by prashanth on 16/1/16.
 */
public class ServiceGenerator {

    public static final String production_domain = "http://ec2-52-74-63-14.ap-southeast-1.compute.amazonaws.com";
    public static  final String debug_domain = "http://192.168.1.36:8000";

    private static RestAdapter.Builder builder = new RestAdapter.Builder()
            .setEndpoint(debug_domain)
            .setClient(new OkClient(new OkHttpClient()));

    public static <S> S createService(Class<S> serviceClass) {
        RestAdapter adapter = builder.build();
        return adapter.create(serviceClass);
    }
}
