package com.eztv.basicsdk.http;

import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;

public class HttpRequest {

    private static HttpRequest httpRequest;
    private Retrofit retrofit;

    public static HttpRequest init() {
        if (httpRequest == null) {
            synchronized (HttpRequest.class) {
                if (httpRequest == null) {
                    httpRequest = new HttpRequest();
                }
            }
        }
        return httpRequest;
    }

    public HttpRequest(){
//        HttpLoggingInterceptor
    }
}
