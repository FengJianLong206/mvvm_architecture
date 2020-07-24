package com.eztv.basicsdk.http;

import java.util.Map;

import io.reactivex.Observable;
import retrofit2.http.FieldMap;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;

public interface Api {

    public String HOST="";

//    @FormUrlEncoded
//    @POST("/api/client101/app_upgrade")
//    Observable<ResponseBean<UpdateBean>> loginRx(@FieldMap Map<String,String> params);
}
