package com.example.mvpretrofitokhttprxjava.api;

import com.example.mvpretrofitokhttprxjava.activity.MainBean;
import com.example.mvpretrofitokhttprxjava.base.mvp.BaseModel;

import java.util.List;

import io.reactivex.Observable;
import retrofit2.http.Field;
import retrofit2.http.FormUrlEncoded;
import retrofit2.http.POST;
import retrofit2.http.Query;
/**
 *\@GET  Observable    @Query
 *\@FormUrlEncoded     @POST   Observable  @FieldMap   @FieldMap HashMap<String, String> params
 *\@Multipart  @POST   Observable  @PartMap    @PartMap Map<String, RequestBody> map
 *
 * created by JonSnow
 * on 2019/5/30
 */
public interface ApiServer {
    //示例    多种类型请求方式

    @POST("api/Activity/get_activities?")
    Observable<BaseModel<List<MainBean>>> getApi1(@Query("time") String requestType);

//    @GET("api/Activity/get_activities?")
//    Observable<BaseModel<List<>>> getApi1(@Query("time") String requestType);

//    @FormUrlEncoded
//    @POST("api/Activity/get_activities?")
//    Observable<BaseModel<List<>>> getApi1(@Field("time") String requestType);

//    @FormUrlEncoded
//    @POST("api/Activity/get_activities?")
//    Observable<BaseModel<List<>>> getApi1(@FieldMap HashMap<String, String> params);

//    @Multipart
//    @POST("api/Activity/get_activities?")
//    Observable<BaseModel<List<>>> getApi1(@PartMap Map<String, RequestBody> map);


//    http://v.juhe.cn/toutiao/index?type=junshi&key=2c1cb93f8c7430a754bc3ad62e0fac06
    @POST("s6/air/now?")
    Observable<BaseModel<List<MainBean>>> getMain(@Query("location") String requestType, @Query("key") String key);

}
